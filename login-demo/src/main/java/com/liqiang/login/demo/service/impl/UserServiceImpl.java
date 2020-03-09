package com.liqiang.login.demo.service.impl;

import com.liqiang.login.demo.dao.UserDao;
import com.liqiang.login.demo.dao.impl.UserDaoImpl;
import com.liqiang.login.demo.entity.User;
import com.liqiang.login.demo.service.UserService;

/**
 * @author 李强
 * @data 2020/3/8 下午 07:34
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao=new UserDaoImpl();
    /**
     *登录
     * @param loginId
     * @param loginPwd
     * @return
     */

    @Override
    public User login(String loginId, String loginPwd) {
        return userDao.login(loginId,loginPwd);
    }
}
