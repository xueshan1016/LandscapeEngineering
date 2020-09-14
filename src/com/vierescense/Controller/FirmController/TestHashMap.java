package com.vierescense.Controller.FirmController;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class TestHashMap {
    public static void main(String[] args) {
        Map map=new HashMap();//
        //学生的信息可以map
        map.put("name","张三");
        map.put("sex","男");
        map.put("age",22);
        map.put("isMarried",false);
        //Key为空，value不为空
        map.put(null,"江西南昌庐山中大道888号");
        //key不为空，value为空
        map.put("school",null);
        //System.out.println(map);
        //遍历集合
        Set keys =map.keySet();//获取所有的key值
        for(Object key:keys){
            System.out.println(key+":"+map.get(key));
        }
        System.out.println(map.containsKey("address")?"包含":"不包含");
    }
}
