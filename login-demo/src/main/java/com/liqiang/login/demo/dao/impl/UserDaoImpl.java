package com.liqiang.login.demo.dao.impl;

import com.liqiang.login.demo.dao.UserDao;
import com.liqiang.login.demo.entity.User;

/**
 * @author 李强
 * @data 2020/3/8 下午 07:11

 */
public class UserDaoImpl implements UserDao {
    /**
     * 用户登录
     * @param loginId 登录ID
     * @param loginPwd 登录密码
     * @return String 登录结果
     */

    @Override
    public User login(String loginId, String loginPwd) {
        User user=null;
        //直接根据loginId查询出这个用户信息
        if("admin".equals(loginId)){
            //在根据传入的密码匹配
            if ("admin".equals(loginPwd)){
                user=new User();
                 user.setLoginId("admin");
                 user.setLoginPwd("admin");
                 user.setUsername("Lusifier");
            }
        }

        return user;
    }
}
