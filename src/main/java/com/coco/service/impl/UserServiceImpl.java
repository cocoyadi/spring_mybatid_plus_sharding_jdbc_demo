package com.coco.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coco.entity.User;
import com.coco.mapper.UserMapper;
import com.coco.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * Created by yadi_coco on 2019/3/24.
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService {
    //实现自定义的接口
}
