package com.xsx.cash_register_system.controller;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import com.xsx.cash_register_system.util.VerifyCodeUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

public class VerifyCodeController extends HttpServlet {

    /**
     * 验证码传输
     * @param request
     * @param response
     */
    @RequestMapping(value = "/getVerify", method = RequestMethod.POST, headers = "Accept=application/json")
    public void getVerify(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("image/jpeg");//设置相应类型,告诉浏览器输出的内容为图片
            response.setHeader("Pragma", "No-cache");//设置响应头信息，告诉浏览器不要缓存此内容
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expire", 0);
            VerifyCodeUtil verifyCodeUtil = new VerifyCodeUtil();
            verifyCodeUtil.getRandcode(request, response);//输出验证码图片方法
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 验证码校验
     * @param code
     * @param session
     * @return
     */
    @RequestMapping(value = "/checkVerify")
    public boolean checkVerify(String code, HttpSession session) {
        try {
            //从session中获取随机数
            String random = (String) session.getAttribute("RANDOMVALIDATECODEKEY");
            if (random == null) {
                return false;
            }
            if (random.equals(code)) {
                System.out.println("正确的验证码");
                return true;
            } else {
                System.out.println("错误的验证码");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
