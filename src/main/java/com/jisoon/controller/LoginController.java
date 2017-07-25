package com.jisoon.controller;

import com.jisoon.mapper.UserMapper;
import com.jisoon.model.UserModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by jisoon on 2017-07-25.
 */
@Controller
@Slf4j
public class LoginController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    public void singin(
            @RequestParam String userId,
            @RequestParam String password){
        UserModel user = userMapper.findOne(userId);
        log.info(">>> db user : {}", user);
    }

}

