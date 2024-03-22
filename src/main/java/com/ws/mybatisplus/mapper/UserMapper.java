package com.ws.mybatisplus.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.ws.mybatisplus.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ws.mybatisplus.entity.UserRoleVo;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author ws
 * @since 2021-04-07
 */
public interface UserMapper extends BaseMapper<User> {
    //    @Select("SELECT * FROM user u LEFT JOIN role r ON u.id = r.id")
//    List<UserRoleVo> selectUserListPage(Page<UserRoleVo> pagination);
    @Select("SELECT role.*,user.* FROM user,role WHERE role.userid=user.id")
    List<UserRoleVo> getQuestionStudent(Page<UserRoleVo> page);

    @Select("SELECT * FROM user")
    List<User> selectPage(Page<User> page);


    @Select("select * from user where ${column} = #{value}")
    User findByColumn(@Param("column") String column, @Param("value") String value);
}
