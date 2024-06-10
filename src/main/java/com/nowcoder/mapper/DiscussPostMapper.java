package com.nowcoder.mapper;

import com.nowcoder.pojo.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPosts(@Param("userId") Integer userId,@Param("page") Integer page,@Param("pageSize") Integer pageSize);

    Integer selectDiscussPostRows(Integer userId);
}
