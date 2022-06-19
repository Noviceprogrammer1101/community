package com.wei.community.service;
import java.util.List;

import com.wei.community.entity.DiscussPost;

/**
 * @author wei
 */
public interface DiscussPostService {
    public List<DiscussPost> selectDiscussPostList(int userId,int offSet,int count);
    public int selectDiscussPostRows(int userId);
}
