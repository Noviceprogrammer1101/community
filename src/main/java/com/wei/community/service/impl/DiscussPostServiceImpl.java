package com.wei.community.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wei.community.dao.DiscussPostMapperMapper;
import com.wei.community.entity.DiscussPost;
import com.wei.community.service.DiscussPostService;

/**
 * @author wei
 */
@Service
public class DiscussPostServiceImpl implements DiscussPostService {

    @Autowired
    private DiscussPostMapperMapper discussPostMapperMapper;

    @Override
    public List<DiscussPost> selectDiscussPostList(int userId, int offSet, int count) {
        return discussPostMapperMapper.selectDiscussPostsList(userId,offSet,count);
    }

    @Override
    public int selectDiscussPostRows(int userId) {
        return discussPostMapperMapper.selectDiscussPostRow(userId);
    }
}
