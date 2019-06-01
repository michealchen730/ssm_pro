package com.scdn.controller;

import com.scdn.domain.User;
import com.scdn.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/ShowUser")
    public String toIndex(HttpServletRequest request, Model model){
        int userId=Integer.parseInt(request.getParameter("id"));
        User user=this.userService.findById(userId);
        model.addAttribute("user",user);
        return "ShowUser";
    }
}
