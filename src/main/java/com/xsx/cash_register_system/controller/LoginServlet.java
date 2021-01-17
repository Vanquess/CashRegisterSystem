package com.xsx.cash_register_system.controller;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import com.xsx.cash_register_system.dao.AdminDao;
import com.xsx.cash_register_system.dao.impl.AdminDaoImpl;
import com.xsx.cash_register_system.entity.Admin;
import com.xsx.cash_register_system.util.VerifyCodeUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

public class LoginServlet extends HttpServlet {
//    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("utf-8");
//        response.setContentType("text/html;charset=utf-8");
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//
//        AdminDao dao = new AdminDaoImpl();
//        try {
//            Admin u = dao.login(username, password);
//            if(u == null){
//                //返回登录页面，并且显示登录失败
//                //1.使用request绑定错误信息
//                request.setAttribute("msg",	"用户名或者密码错误！");
//                //2.转发过去登录页面，显示信息
//                request.getRequestDispatcher("login.jsp").forward(request, response);
//            }else{
//                //不为空，表明当前用户登录成功
//                //只能修改自己的信息，可以看到所有人
//                HttpSession session = request.getSession();
//                List<User> list = dao.findAll();
//                session.setAttribute("list", list);
//                session.setAttribute("u", u);
//                Cookie c1 = new Cookie("username", username);
//                Cookie c2 = new Cookie("password", password);
//                String checked = request.getParameter("checked");
//                if ("on".equals(checked)) {
//                    c1.setMaxAge(10*24*60*60);
//                    c2.setMaxAge(10*24*60*60);
//                    response.addCookie(c1);
//                    response.addCookie(c2);
//                } else {
//                    c1.setMaxAge(0);
//                    c2.setMaxAge(0);
//                }
//                request.getRequestDispatcher("userList.jsp").forward(request, response);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
