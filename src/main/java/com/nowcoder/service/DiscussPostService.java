package com.nowcoder.service;

import com.nowcoder.mapper.DiscussPostMapper;
import com.nowcoder.mapper.UserMapper;
import com.nowcoder.pojo.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussPostService {
    @Autowired
    private DiscussPostMapper discussPostMapper;
    @Autowired
    private UserMapper userMapper;

    public List<DiscussPost> findDiscussionPosts(Integer userId, Integer page, Integer pageSize){
        return discussPostMapper.selectDiscussPosts(userId, page, pageSize);
    }

    public Integer findDiscussionPostRows(Integer userId){
        return discussPostMapper.selectDiscussPostRows(userId);
    }
}
