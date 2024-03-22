package com.ws.mybatisplus.mapper;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ws.mybatisplus.entity.User;
import com.ws.mybatisplus.entity.UserRoleVo;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Date;

import com.ws.mybatisplus.entity.TestSjzHoliday;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestSjzHolidayMapper extends BaseMapper<TestSjzHoliday> {
    int deleteByPrimaryKey(Integer id);

    int insert(TestSjzHoliday record);

    int insertSelective(TestSjzHoliday record);

    TestSjzHoliday selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestSjzHoliday record);

    int updateByPrimaryKey(TestSjzHoliday record);

    List<TestSjzHoliday> selectByAll(TestSjzHoliday testSjzHoliday);

    List<TestSjzHoliday> seleceAllInfoPage(Page<TestSjzHoliday> page);

}