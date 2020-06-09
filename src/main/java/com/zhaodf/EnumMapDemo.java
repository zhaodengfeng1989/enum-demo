package com.zhaodf;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

/**
 * 类：EnumSetDemo
 *
 * @author zhaodf
 * @date 2020/6/9
 */
public class EnumMapDemo {
    public static void main(String[] args){
        EnumMap<StateMachine.Signal, String> signalStringEnumMap = new EnumMap(StateMachine.Signal.class);
        signalStringEnumMap.put(StateMachine.Signal.RED,"红灯");
        signalStringEnumMap.put(StateMachine.Signal.GREEN,"绿灯");
        signalStringEnumMap.put(StateMachine.Signal.YELLOW,"黄灯");

        Iterator<Map.Entry<StateMachine.Signal,String>> iterator = signalStringEnumMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<StateMachine.Signal, String> entry = iterator.next();
            System.out.println(entry.getKey().name() + " : " + entry.getValue());
        }
    }
}
