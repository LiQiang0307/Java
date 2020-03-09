package com.liqiang.login.demo.service;

import com.liqiang.login.demo.entity.User;

/**
 * @author 李强
 * @data 2020/3/8 下午 07:28
 */
public interface UserService {
    public User login(String loginId,String loginPwd);
}
