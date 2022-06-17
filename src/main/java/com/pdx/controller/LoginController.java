package com.pdx.controller;

import com.pdx.pojo.User;
import com.pdx.service.RoleService;
import com.pdx.service.RoleUserService;
import com.pdx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author PDX
 * @website https://blog.csdn.net/Gaowumao
 * @Date 2022-05-05 01:19
 * @Description
 */
@Controller
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleUserService roleUserService;


    @RequestMapping("/doLogin")
    public String doLogin(String username, String password, Model model, HttpServletRequest request){
        User user = userService.login(username,password);
        List<String> list = roleUserService.selectNameById(user.getId());
        model.addAttribute("user",user);
        request.getSession().setAttribute("user",user);
        request.getSession().setAttribute("list",list);
        return "index";
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request){
        request.getSession().removeAttribute("user");
        return "extra-login";
    }
}
