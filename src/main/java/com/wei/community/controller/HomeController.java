package com.wei.community.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.wei.community.entity.DiscussPost;
import com.wei.community.entity.Page;
import com.wei.community.entity.User;
import com.wei.community.service.DiscussPostService;
import com.wei.community.service.UserService;

/**
 * @author wei
 */
@Controller
public class HomeController {

    @Autowired
    private DiscussPostService discussPostService;

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/home",method = RequestMethod.GET)
    public String home(Model model, Page page) {
//        page.setRows(discussPostService.selectDiscussPostRows(0));
//        page.setPath("index");
//        List<DiscussPost> discussPosts = discussPostService.selectDiscussPostList(0, page.getOffset(), page.getLimit());
//        List<Map<String,Object>> list = new ArrayList<>();
//        for (DiscussPost post:discussPosts
//             ) {
//            Map<String,Object> map = new HashMap<>();
//            User user = userService.selectUserById(post.getUserId());
//            map.put("post",post);
//            map.put("user",user);
//            list.add(map);
//        }
//        model.addAttribute("discussPosts",list);
//        return "index";
        // 方法调用钱,SpringMVC会自动实例化Model和Page,并将Page注入Model.
        // 所以,在thymeleaf中可以直接访问Page对象中的数据.
        page.setRows(discussPostService.selectDiscussPostRows(0));
        page.setPath("/index");

        List<DiscussPost> list = discussPostService.selectDiscussPostList(0, page.getOffset(), page.getLimit());
        List<Map<String, Object>> discussPosts = new ArrayList<>();
        if (list != null) {
            for (DiscussPost post : list) {
                Map<String, Object> map = new HashMap<>();
                map.put("post", post);
                User user = userService.selectUserById(post.getUserId());
                map.put("user", user);
                discussPosts.add(map);
            }
        }
        model.addAttribute("discussPosts", discussPosts);
        return "/index";
    }
}
