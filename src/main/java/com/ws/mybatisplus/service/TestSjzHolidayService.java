package com.ws.mybatisplus.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ws.mybatisplus.entity.TestSjzHoliday;
import com.ws.mybatisplus.entity.User;

import java.util.List;

public interface TestSjzHolidayService extends IService<TestSjzHoliday> {


    int deleteByPrimaryKey(Integer id);

    int insert(TestSjzHoliday record);

    int insertSelective(TestSjzHoliday record);

    TestSjzHoliday selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestSjzHoliday record);

    int updateByPrimaryKey(TestSjzHoliday record);

    List<TestSjzHoliday> selectByAll(TestSjzHoliday testSjzHoliday);

    Page<TestSjzHoliday> seleceAllInfoPage(Page<TestSjzHoliday> page);
}
