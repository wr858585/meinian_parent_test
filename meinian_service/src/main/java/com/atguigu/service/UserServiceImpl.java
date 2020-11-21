package com.atguigu.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author oono
 * @date 2020 11 18
 */
@Transactional
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService{

    public String getUserInfo() {
        return "hehehe";
    }
}
