package com.nowcoder.controller;

import com.nowcoder.mapper.UserMapper;
import com.nowcoder.pojo.DiscussPost;
import com.nowcoder.pojo.Page;
import com.nowcoder.pojo.User;
import com.nowcoder.service.DiscussPostService;
import com.nowcoder.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Slf4j
public class HomeController {
    @Autowired
    private DiscussPostService discussPostService;
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String getIndexPage(Model model, Page page){
        log.info("数据展示:{}", page);
        page.setRows(discussPostService.findDiscussionPostRows(null));
        page.setPath("/index");

        List<DiscussPost> list = discussPostService.findDiscussionPosts(null, page.getCurrent(), page.getLimit());

        List<Map<String, Object>> discussPosts = new ArrayList<>();

        if(list != null){
            for (DiscussPost post : list) {
                Map<String, Object> map = new HashMap<>();

                map.put("post", post);
                User user = userService.findUserById(Integer.parseInt(post.getUserId()));
                map.put("user", user);

                discussPosts.add(map);
            }
        }
        model.addAttribute("discussPosts", discussPosts);

        return "/index";
    }
}
