package com.wei.community.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.wei.community.entity.DiscussPost;

/**
 * @author wei
 */
@Mapper
public interface DiscussPostMapperMapper {
    /**
     * 分页
     * @param userId
     * @param offSet
     * @param count
     * @return
     */
    List<DiscussPost> selectDiscussPostsList(@Param("userId") int userId,@Param("offSet") int offSet,@Param("count") int count);

    /**
     * 查一行
     * @param userId
     * @return
     */
    int selectDiscussPostRow(@Param("userId") int userId);

}