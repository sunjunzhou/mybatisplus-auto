package com.ws.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ws.mybatisplus.entity.User;
import com.ws.mybatisplus.entity.UserRoleVo;
import com.ws.mybatisplus.mapper.UserMapper;
import com.ws.mybatisplus.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ws
 * @since 2021-03-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public Page<UserRoleVo> getQuestionStudent(Page<UserRoleVo> page) {
        return page.setRecords(this.baseMapper.getQuestionStudent(page));
    }

    @Override
    public Page<User> selectPage(Page<User> page) {
        return page.setRecords(this.baseMapper.selectPage(page));
    }

}
