package com.xsx.cash_register_system.util;

/**
 * @Author BKGin
 * @Email xushengxing@gmail.com
 * @Date 2021/1/19
 *
 * Tool返回状态工具类
 */
public class Tool {
    private Integer code;//状态码
    private Boolean isSuccess;//是否成功/状态

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    private String message;//消息
    private Object result;//数据对象
    /*
     * 构造函数*/
    public Tool(){
        super();
    }
    /**
     *返回标准的Json格式数据其中包括（是否成功、状态码、消息、内容）
     * @param success
     * @param code
     * @param message
     * @param result
     */
    public Tool(Boolean success,Integer code,String message,Object result ){
        super();
        this.isSuccess=success;
        this.code=code;
        this.message=message;
        this.result=result;
    }
}
