package com.zhaodf;

import java.util.EnumSet;

/**
 * 类：EnumSetDemo
 *
 * @author zhaodf
 * @date 2020/6/9
 */
public class EnumSetDemo {
    public static void main(String[] args){
        EnumSet<ErrorCodeEnum> errSet = EnumSet.allOf(ErrorCodeEnum.class);
        for (ErrorCodeEnum errorCodeEnum:errSet) {
            System.out.println("枚举值名称："+errorCodeEnum.name()+"，枚举值code："+errorCodeEnum.getCode()+"，枚举值描述："+errorCodeEnum.getDescription());
        }
    }
}
