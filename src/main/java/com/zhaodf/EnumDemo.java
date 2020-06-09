package com.zhaodf;

/**
 * Hello world!
 *
 */
public class EnumDemo
{
    enum Color{
        RED, GREEN, BLUE
    }
    public static void main( String[] args ) {
        for (Color c:Color.values()) {
            System.out.println("返回枚举声明中常量的序号："+c + " ordinal: " + c.ordinal());
        }

        Color red = Color.RED;
        System.out.println("声明枚举值的枚举类为："+red.getDeclaringClass());
        System.out.println("该枚举值的名称："+red.name());
        System.out.println("该枚举值在枚举类中的声明序号："+red.ordinal());
        System.out.println("该枚举类与另一个枚举值比较compareTo："+red.compareTo(Color.GREEN));
        System.out.println("该枚举类与另一个枚举值比较equals："+red.equals(Color.RED));
        System.out.println("该枚举类与另一个枚举值比较==："+(red==Color.RED));
    }
}
