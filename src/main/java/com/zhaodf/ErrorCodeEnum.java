package com.zhaodf;

/**
 * 需求：定义错误码，并要设置它的描述
 */
public enum ErrorCodeEnum {
    OK(0){
        @Override
        public String getDescription() {
            return "请求成功";
        }
    },
    ERROR_404(404){
        @Override
        public String getDescription() {
            return "未找到";
        }
    },
    ERROR_500(500){
        @Override
        public String getDescription() {
            return "系统内部错误";
        }
    };
    private int code;

    //定义构造方法
    ErrorCodeEnum(int code){
        this.code = code;
    }

    //定义一个抽象方法
    public abstract String getDescription();

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static void main(String[] args){
        for (ErrorCodeEnum errorCode:ErrorCodeEnum.values()) {
            System.out.println(errorCode.getCode()+":"+errorCode.getDescription());
        }
    }
}
