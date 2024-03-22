package com.ws.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ws.mybatisplus.entity.User;
import com.ws.mybatisplus.mapper.UserMapper;
import com.ws.mybatisplus.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@SpringBootTest
class MybatisplusApplicationTests {
    @Resource
    private UserMapper userMapper;
    private UserServiceImpl userService;

    @Test
    //  增
    public void testInsert() {
        User user = new User();
        user.setAge(23);
        user.setEmail("test@ffff.com");
        user.setId(9l);
        user.setName("zhang");
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }

    @Test
    //根据id更新
    public void testUpdateById() {
        User user = new User();
        user.setId(6l);
        user.setName("李四");
        int i = userMapper.updateById(user);
        System.out.println("更新" + i + "条");
    }

    //根据条件更新
    @Test
    public void testUpdate() {
        User user = new User();
        user.setAge(22);
        //更新条件
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("id", 1);
        //执行更新操作
        int update = userMapper.update(user, wrapper);
        System.out.println("更新" + update + "条");
    }

    @Test
    public void testUpdate2() {
        //更新的条件以及字段
        UpdateWrapper<User> wrapper1 = new UpdateWrapper<>();
        wrapper1.eq("id", 6).set("age", 23);
        //执行更新操作
        int update = userMapper.update(null, wrapper1);
        System.out.println(update);
    }

    //删除操作
    @Test
    public void testDeleteById() {
        //执行删除操作
        int result = userMapper.deleteById(6L);
        System.out.println("result = " + result);
    }

    @Test
    public void testDeleteByMap() {
        //删除条件放进一个容器里
        Map<String, Object> columnMap = new HashMap<>();
        columnMap.put("age", 22);
        columnMap.put("name", "张三");
        //将columnMap中的元素设置为删除的条件，多个之间为and关系
        int result = userMapper.deleteByMap(columnMap);
        System.out.println("result = " + result);
    }

    @Test
    public void testDelete() {
        User user = new User();
        user.setAge(21);
        user.setName("赵六");
        //将实体对象进行包装，包装为操作条件
        QueryWrapper<User> wrapper = new QueryWrapper<>(user);
        int result = userMapper.delete(wrapper);
        System.out.println("result = " + result);
    }

    @Test
    public void testDeleteBatchIds() {
        //根据id集合批量删除
        int result = userMapper.deleteBatchIds(Arrays.asList(1L, 2L, 3L));
        System.out.println("result = " + result);
    }

    @Test
    public void testSelectById() {
        //根据id查询数据
        User user = this.userMapper.selectById(5L);
        System.out.println("result = " + user);
    }

    @Test
    public void testSelectBatchIds() {
        //根据id集合批量查询
        List<User> users = userMapper.selectBatchIds(Arrays.asList(5l, 7l, 8l));
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testSelectOne() {
        QueryWrapper<User> wrapper = new QueryWrapper<User>();
        wrapper.eq("age", "22");
        //根据条件查询一条数据，如果结果超过一条会报错
        User user = this.userMapper.selectOne(wrapper);
        System.out.println(user);
    }

    @Test
    public void testSelectCount() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.gt("age", 20); // 条件：年龄大于20岁的用户
        // 根据条件查询数据条数
        Integer count = userMapper.selectCount(wrapper);
        System.out.println("count => " + count);
    }

    @Test
    public void testSelectList2() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //设置查询条件
        wrapper.like("age", 24);
        List<User> users = this.userMapper.selectList(wrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testSelectPage() {

        Page<User> page = new Page<>(1, 2); //查询第一页，查询1条数据

        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //设置查询条件
        wrapper.ge("age", 20);

        IPage<User> iPage = userMapper.selectPage(page, wrapper);
        System.out.println("数据总条数： " + iPage.getTotal());
        System.out.println("数据总页数： " + iPage.getPages());
        System.out.println("当前页数： " + iPage.getCurrent());

        List<User> records = iPage.getRecords();
        records.forEach(System.out::println);
    }

    @Test
    public void testAllEq() {
        //条件构造器
        Map<String, Object> params = new HashMap<>();
        params.put("name", "jack");
        params.put("age", "22");

        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.allEq((k, v) -> (k.equals("age") || k.equals("id") || k.equals("name")), params);

        List<User> users = this.userMapper.selectList(wrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testEq() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //SELECT id,name,age,email FROM user WHERE  age >= ? AND name IN (?,?,?)
        wrapper.ge("age", 20)
                .in("name", "tom", "jone", "Sandy");

        List<User> users = userMapper.selectList(wrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testLike() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        // SELECT id,user_name,name,age,email AS mail FROM tb_user WHERE name LIKE ?
        // 参数：%五(String)
        wrapper.likeLeft("name", "五");

        List<User> users = this.userMapper.selectList(wrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testOrderByAgeDesc() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //按照年龄倒序排序
        // SELECT id,name,age,email AS mail FROM tb_user ORDER BY age DESC
        wrapper.orderByDesc("age");
        List<User> users = this.userMapper.selectList(wrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testOr() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        // SELECT id,user_name,name,age,email AS mail FROM tb_user WHERE name = ? OR age = ?
        wrapper.eq("name", "王五").or().eq("age", 21);

        List<User> users = this.userMapper.selectList(wrapper);
        users.forEach(System.out::println);
    }

    @Test
    public void testSelect() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //SELECT id,name,age FROM tb_user WHERE name = ? OR age = ?
        wrapper.eq("name", "王五")
                .or()
                .eq("age", 21)
                .select("id", "name", "age"); //指定查询的字段

        List<User> users = this.userMapper.selectList(wrapper);
        users.forEach(System.out::println);
    }


    @Test
    public void test() {

        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.inSql("id", "select id from user where id<6");
        List<Object> objects = userMapper.selectObjs(wrapper);
        objects.forEach(System.out::println);
    }

    @Test
    public void testByColumn() {
        User userOfId1 = userMapper.findByColumn("id", "1");
        User userOfNameKid = userMapper.findByColumn("name", "kid");
        User userOfEmail = userMapper.findByColumn("email", "noone@nowhere.com");
        System.out.println(userOfId1);
    }


    @Test
    public void testTra(){
        User user1 = new User();
        user1.setName("zhangsan");
        user1.setAddress("beijing");
        user1.setAge(10);

        User user2 = new User();
        user2.setName("zhangsan");
        user2.setAddress("beijing");
        user2.setAge(20);

        User user3 = new User();
        user3.setName("lisi");
        user3.setAddress("shanghai");
        user3.setAge(30);

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        //类别 集合
       List<String> tracking = new ArrayList<>();
       tracking.add("name");
       tracking.add("address");


        //List<T> ts = Arrays.asList(personRecord.getName(), personRecord.getAddress());

        //多条件分组
        Function<User, List<String>> compositeKey = personRecord ->
            Arrays.asList(personRecord.getName(), personRecord.getAddress());

        Map<Object, List<User>> map =
            list.stream().collect(Collectors.groupingBy(compositeKey));


        //
        Map<String, List<User>> collect =
            list.stream().collect(Collectors.groupingBy(this::fetchGroupKey));

        System.out.println(collect);

    }

    private String fetchGroupKey(User user){

        return user.getAge() +"#"+ null;

    }

}