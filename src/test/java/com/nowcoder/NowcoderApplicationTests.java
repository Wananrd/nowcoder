package com.nowcoder;

import com.nowcoder.mapper.DiscussPostMapper;
import com.nowcoder.pojo.DiscussPost;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class NowcoderApplicationTests {
    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    void contextLoads() {
        List<DiscussPost> list = discussPostMapper.selectDiscussPosts(null, 0, 10);
        for (DiscussPost post : list) {
            System.out.println(post);
        }
    }

    @Test
    void testSelectDiscussPostRows(){
        Integer cnt = discussPostMapper.selectDiscussPostRows(null);
        System.out.println(cnt);
    }
}
