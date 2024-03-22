package com.ws.mybatisplus.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ws.mybatisplus.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ws.mybatisplus.entity.UserRoleVo;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author ws
 * @since 2021-04-07
 */
public interface UserService extends IService<User> {
    Page<UserRoleVo> getQuestionStudent(Page<UserRoleVo> page);

    Page<User> selectPage(Page<User> page);
}
