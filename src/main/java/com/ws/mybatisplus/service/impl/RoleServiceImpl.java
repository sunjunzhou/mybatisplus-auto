package com.ws.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ws.mybatisplus.entity.Role;
import com.ws.mybatisplus.mapper.RoleMapper;
import com.ws.mybatisplus.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ws
 * @since 2021-03-09
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {


    @Override
    public Page<Role> selectRole(Page<Role> page) {
        return page.setRecords(this.baseMapper.selectRole(page));
    }
}
