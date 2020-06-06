package com.nowcoder.community;

import com.nowcoder.community.dao.DiscussPostMapper;
import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 * @author laiming
 * @describ
 * @create 2020-06-21:15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DiscussPostMapper discussPostMapper;
    @Test
    public void testSelectUser(){
        User user=userMapper.selectById(11);
        System.out.println("根据ID:"+user);

        User user1 = userMapper.selectByName("niuke");
        System.out.println("根据用户名查："+user1);


        User user2 = userMapper.selectByEmail("nowcoder115@sina.com");
        System.out.println("根据邮箱查："+user2);
    }


    @Test
    public void testInsert(){
        User user=new User();
        user.setUsername("张飞");
        user.setEmail("zhangfei@qq.com");
        user.setCreateTime(new Date());
        int i = userMapper.insertUser(user);
        System.out.println("插入成功"+i);
    }

    @Test
    public void testupdate(){
        int i = userMapper.updateStatus(150, 1);
        System.out.println("修改成功"+i);
    }

    @Test
    public void testSelectPosts(){
        List<DiscussPost> discussPostList = discussPostMapper.selectDiscussPosts(149, 0, 10);
        for (DiscussPost discussPosts:discussPostList) {
            System.out.println(discussPosts);
        }

        int rows = discussPostMapper.selectDiscussPostRows(149);
        System.out.println(rows);
    }
}
