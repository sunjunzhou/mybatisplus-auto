package com.ws.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.ws.mybatisplus.entity.TestSjzHoliday;
import com.ws.mybatisplus.mapper.TestSjzHolidayMapper;
import com.ws.mybatisplus.service.TestSjzHolidayService;

import java.util.List;

@Service
public class TestSjzHolidayServiceImpl extends ServiceImpl<TestSjzHolidayMapper, TestSjzHoliday> implements TestSjzHolidayService{

    @Resource
    private TestSjzHolidayMapper testSjzHolidayMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return testSjzHolidayMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TestSjzHoliday record) {
        return testSjzHolidayMapper.insert(record);
    }

    @Override
    public int insertSelective(TestSjzHoliday record) {
        return testSjzHolidayMapper.insertSelective(record);
    }

    @Override
    public TestSjzHoliday selectByPrimaryKey(Integer id) {
        return testSjzHolidayMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TestSjzHoliday record) {
        return testSjzHolidayMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TestSjzHoliday record) {
        return testSjzHolidayMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<TestSjzHoliday> selectByAll(TestSjzHoliday testSjzHoliday){
        return testSjzHolidayMapper.selectByAll(testSjzHoliday);
    }

    @Override
    public Page<TestSjzHoliday> seleceAllInfoPage(Page<TestSjzHoliday> page){
        return page.setRecords(testSjzHolidayMapper.seleceAllInfoPage(page));
    }

}
