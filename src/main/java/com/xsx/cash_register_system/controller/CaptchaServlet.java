package com.xsx.cash_register_system.controller;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
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

public class CaptchaServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //设置数据返回类型-->图片
        response.setContentType("image/jpeg");
        //得到验证码
        Map<String, BufferedImage> map = VerifyCodeUtil.getImg();
        //图片
        BufferedImage img = VerifyCodeUtil.getBuff(map);
        //得到图片内容
        String code = VerifyCodeUtil.getKey(map);
        HttpSession session = request.getSession();
        session.setAttribute("code_1", code);//绑定数据到服务器中

        //通过输出流将文件写出，然后压缩
        OutputStream out = response.getOutputStream();
        JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
        encoder.encode(img);
        //针对少数同学无法使用上述包的情况
        //ImageIO.write(img, "image/jpeg", out);

    }
}
