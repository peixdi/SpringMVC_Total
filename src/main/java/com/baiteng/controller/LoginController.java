package com.baiteng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 2017/6/7.
 */
@Controller
@RequestMapping("/user/*")
public class LoginController {

    @RequestMapping("login")
    public ModelAndView Index()
    {
        ModelAndView modelAndView = new ModelAndView("login/login");
        return modelAndView;
    }

    /*@RequestMapping(value="request.do")
//    @ResponseBody
    public Map<String,Object> login(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Map<String,Object> map = new HashMap<String,Object>();
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if("abc".equals(username) && "123".equals(password)){
            map.put("message", "登录成功");
        }else{
            map.put("message", "用户名或密码错误，登录失败");
        }

        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write(message);
//        return map;
    }*/

    @RequestMapping(value = "login.do")
    @ResponseBody
    public Map<String,Object> login(@RequestParam("username") String username,
                                    @RequestParam("password") String password) throws IOException {

        Map<String,Object> map = new HashMap<String,Object>();

        if ("abc".equals(username) && "123".equals(password)) {
            map.put("message", "登录成功");
        } else {
            map.put("message", "用户名或密码错误，登录失败");
        }

        return map;
    }
   /* @RequestMapping(value = "bean.do")
    @ResponseBody
    public Map<String,Object> login( User user)throws IOException {
       Map<String,Object> map = new HashMap<String,Object>();
        String username = user.getUsername();
        String password = user.getPassword();

        if ("abc".equals(username) && "123".equals(password)) {
            map.put("message", "登录成功");
        } else {
            map.put("message", "用户名或密码错误，登录失败");
        }

        return map;
    }*/

}
