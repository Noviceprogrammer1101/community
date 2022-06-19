package com.wei.community.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wei.community.dao.UserMapper;
import com.wei.community.entity.DiscussPost;
import com.wei.community.entity.User;
import com.wei.community.service.UserService;

/**
 * @author wei
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserById(int userId) {
        return userMapper.selectUserById(userId);
    }
}
