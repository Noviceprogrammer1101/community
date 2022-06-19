package com.wei.community.service;

import com.wei.community.entity.DiscussPost;
import com.wei.community.entity.User;

/**
 * @author wei
 */

public interface UserService {
    public User selectUserById(int userId);
}
