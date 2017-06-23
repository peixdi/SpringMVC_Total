package com.baiteng.controller;

import com.baiteng.entity.User2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Admin on 2017/6/12.
 */
@Controller
@RequestMapping(value="/test")
public class VueController {
    @RequestMapping(value = "/vuejs", method = GET)
    public ModelAndView testVue() {
        ModelAndView mv = new ModelAndView("vuejs/index");
        return mv;
    }

  /*  @RequestMapping(value = "bean.do")
    @ResponseBody
    public Map<String,Object> login(User2 user)throws IOException {
        Map<String,Object> map = new HashMap<String,Object>();



        return map;
    }*/
  @RequestMapping(value = "/vuejs.do")
  @ResponseBody
  public User2 login(User2 user)throws IOException {
    return user;
  }

}
