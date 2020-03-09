package com.liqiang.login.demo.web.controller;

import com.liqiang.login.demo.entity.User;
import com.liqiang.login.demo.service.UserService;
import com.liqiang.login.demo.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录控制器
 * @author 李强
 * @data 2020/3/8 下午 07:55
 */
public class LoginController extends HttpServlet {
    private UserService userService=new UserServiceImpl();

//get与post区别：
//    语义区别
//    post请求实际是两次（第一次是问服务器能否接收数据，第二次是上传到服务器），get是一次


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String loginId = req.getParameter("loginId");
        String loginPwd = req.getParameter("loginPwd");
        User user= userService.login(loginId,loginPwd);
        //登录失败的处理
       if(user==null){
            req.getRequestDispatcher("/fail.jsp").forward(req,resp);
        }
       //登录失败的处理
       else {
            req.getRequestDispatcher("/success.jsp").forward(req,resp);
        }
    }

}
