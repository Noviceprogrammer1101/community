package com.wei.community.dao;

import org.apache.ibatis.annotations.Mapper;
import com.wei.community.entity.User;

/**
 * @author wei
 */
@Mapper
public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
    User selectUserById(int userId);
}