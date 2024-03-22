package com.ws.mybatisplus.controller;

import com.ws.mybatisplus.entity.Person;
import com.ws.mybatisplus.mapper.PersonMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PersonController {
    @Resource
    private PersonMapper personMapper;

    //增
    @PostMapping(value = "/person")
    public String personAdd(@RequestBody Person person) {
        int i = personMapper.insert(person);
        return person.toString();
    }

    //查
    @RequestMapping("/findByAll")
    public List<Person> personList() {
        return personMapper.findByAll(new Person());
    }

    //通过id查
    @GetMapping(value = "/selectByPrimaryKey/{id}")
    public Person personFindOne(@PathVariable("id") Integer id) {
        return personMapper.selectByPrimaryKey(id);
    }

    //姓名查
    @GetMapping(value = "/selectByName/{name}")
    public List<Person> selectByName(@PathVariable("name") String name) {
        return personMapper.selectByName(name);
    }

    //删除一个人
    @DeleteMapping(value = "/deleteByPrimaryKey/{id}")
    public void personDelete(@PathVariable("id") Integer id) {
        personMapper.deleteByPrimaryKey(id);
    }

    //更新一个人员
    // @RequestParam
    @PutMapping(value = "/person/{id}")
    public int personUpdate(@PathVariable("id") Integer id,
                            @RequestParam("name") String name,
                            @RequestParam("age") Integer age) {
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setAge(age);
        return personMapper.updateByPrimaryKeySelective(person);
    }
}