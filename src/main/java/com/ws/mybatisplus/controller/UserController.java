package com.ws.mybatisplus.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ws.mybatisplus.entity.User;
import com.ws.mybatisplus.entity.UserRoleVo;
import com.ws.mybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ws
 * @since 2021-04-07
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("list")
    //打印所有字段
    public String list() {
        List<User> list = new ArrayList<User>();
        list = userService.list();
        return list.toString();
    }


    @GetMapping("getAllUserByAge/{page}/{size}")
    public Map<String, Object> getAllUserByPage(@PathVariable Integer page, @PathVariable Integer size) {
        Map<String, Object> map = new HashMap<>();
        Page<User> userPage = userService.selectPage(new Page<>(page, size));
        if (userPage.getRecords().size() == 0) {
            map.put("code", 400);
        } else {
            map.put("code", 200);
            map.put("data", userPage);
        }
        return map;
    }


    @GetMapping("/getAllRoleWithUserByPage/{page}/{size}")
    public Map<String, Object> getAllQuestionWithStudentByPage(@PathVariable Integer page, @PathVariable Integer size) {
        Map<String, Object> map = new HashMap<>();
        Page<UserRoleVo> questionStudent = userService.getQuestionStudent(new Page<>(page, size));
        if (questionStudent.getRecords().size() == 0) {
            map.put("code", 400);
        } else {
            map.put("code", 200);
            map.put("data", questionStudent);
        }
        return map;
    }

}

