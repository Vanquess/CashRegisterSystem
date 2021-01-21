package com.xsx.cash_register_system.util;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @Author BKGin
 * @Email xushengxing@gmail.com
 * @Date 2021/1/19
 *
 * Json工具类
 */
public class Json {

    public static void toJson(Tool result, HttpServletResponse response)throws  Exception{
        response.setContentType("text/json");
        response.setHeader("Cache-Control","no-cache");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();

        String json = JSONObject.toJSONString(result,
                SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteNullNumberAsZero,
                SerializerFeature.WriteNullListAsEmpty,
                SerializerFeature.WriteNullStringAsEmpty,
                SerializerFeature.WriteNullBooleanAsFalse,
                SerializerFeature.DisableCircularReferenceDetect);
        writer.write(json);
        writer.close();
    }
}
