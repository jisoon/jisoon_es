package com.jisoon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jisoon on 2017-07-25.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("adminId", "admin123");
        mav.addObject("adminPassword", "1234");
        return mav;
    }

}
