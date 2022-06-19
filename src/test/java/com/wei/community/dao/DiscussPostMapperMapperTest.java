package com.wei.community.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.wei.community.entity.DiscussPost;

@SpringBootTest
@RunWith(SpringRunner.class)
@MapperScan("com.wei.community")
public class DiscussPostMapperMapperTest {

    @Autowired
    DiscussPostMapperMapper discussPostMapperMapper;
    @Test
    public void selectDiscussPostsListTest() {
        System.out.println(discussPostMapperMapper);
        List<DiscussPost> list = discussPostMapperMapper.selectDiscussPostsList(149, 0, 10);
        System.out.println(list);
    }

    @Test
    public void selectDiscussPostRowTest() {
        int i = discussPostMapperMapper.selectDiscussPostRow(149);
        System.out.println(i);
    }
}