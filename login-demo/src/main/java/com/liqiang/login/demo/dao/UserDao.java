package com.liqiang.login.demo.dao;

import com.liqiang.login.demo.entity.User;

/**
 * 用户数据访问
 * @author 李强
 * @data 2020/3/8 下午 07:07
 */
public interface UserDao {
    public User login(String loginId, String loginPwd);
}
