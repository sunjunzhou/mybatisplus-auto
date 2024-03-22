package com.ws.mybatisplus.controller;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ws.mybatisplus.entity.TestSjzHoliday;
import com.ws.mybatisplus.service.TestSjzHolidayService;
import com.ws.mybatisplus.util.Result;
import com.ws.mybatisplus.util.ResultUtil;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/sjzHoliday")
public class TestSjzHolidayController {

    @Resource
    private final TestSjzHolidayService testSjzHolidayService;

    //查
    @GetMapping("/getAllInfo")
    public Result getAllInfo(TestSjzHoliday testSjzHoliday){
        return ResultUtil.success(testSjzHolidayService.selectByAll(testSjzHoliday));
    }
    //根据id查
    @GetMapping(value = "/findOne/{id}")
    public Result findOneInfo(@PathVariable("id") Integer id) {
        return ResultUtil.success(testSjzHolidayService.selectByPrimaryKey(id));
    }

    //增
    @PutMapping("/addInfo")
    public Result addInfo(@RequestBody TestSjzHoliday testSjzHoliday){
        return ResultUtil.success(testSjzHolidayService.insert(testSjzHoliday));
    }

    //删
    @DeleteMapping("/deleteInfo/{id}")
    public Result deleteInfo(@PathVariable("id") Integer id){
        return ResultUtil.success(testSjzHolidayService.deleteByPrimaryKey(id));
    }

    //改
    @PutMapping("/updateInfo/{id}")
    public Result updateInfo(@PathVariable("id") Integer id,
            @RequestBody TestSjzHoliday testSjzHoliday){
        testSjzHoliday.setId(id);
        return ResultUtil.success(testSjzHolidayService.updateByPrimaryKey(testSjzHoliday));
    }

    //分页查
    @GetMapping("/seleceAllInfoPage/{page}/{size}")
    public Result allInfoPage(@PathVariable Integer page, @PathVariable Integer size){
        return ResultUtil.success(testSjzHolidayService.seleceAllInfoPage(new Page<>(page, size)));
    }


    //分页查
    @GetMapping("/infoPage")
    public Result getInfoPage(
            @RequestParam Map<String, Object> params, Page page, TestSjzHoliday testSjzHoliday) {
        return ResultUtil.success(testSjzHolidayService.page(page, Wrappers.query(testSjzHoliday)));
    }



}
