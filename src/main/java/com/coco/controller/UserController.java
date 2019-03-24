package com.coco.controller;

import com.coco.entity.User;
import com.coco.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by yadi_coco on 2019/3/24.
 */
@Controller
public class UserController {
    @Autowired
    private IUserService userService;


    public boolean saveUser(User user){
        return userService.save(user);
    }
}
