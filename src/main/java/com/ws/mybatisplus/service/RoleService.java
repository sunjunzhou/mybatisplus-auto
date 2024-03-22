package com.ws.mybatisplus.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ws.mybatisplus.entity.Role;

public interface RoleService extends IService<Role> {
    Page<Role> selectRole(Page<Role> page);
}