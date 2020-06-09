package com.zhaodf;

/**
 * 需求：定义错误码，并要设置它的描述
 */
public enum ErrorCodeEnum3 implements IErrorCode{
    OK(0,"请求成功"),
    ERROR_404(404,"未找到"),
    ERROR_500(500,"系统内部错误");
    private int code;
    private String description;

    //定义构造方法
    ErrorCodeEnum3(int code, String description){
        this.code = code;
        this.description = description;
    }
    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public static void main(String[] args){
        for (ErrorCodeEnum3 errorCode:ErrorCodeEnum3.values()) {
            System.out.println(errorCode.getCode()+":"+errorCode.getDescription());
        }
    }
}
