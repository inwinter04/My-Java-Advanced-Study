package cn.iamdt.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    /*
        Map集合常用API

            ---------------------------------------------------------------------------
            public V put(K key,V value)		           添加元素 (修改: 如果键已经存在了, 就会使用新值, 替换旧值)
                                                            - 返回被覆盖掉的旧值.
            public V remove(Object key)		           根据键删除键值对元素
                                                            - 返回被删除的键, 所对应的值
            public void clear()			               移除所有的键值对元素
            public boolean containsKey(Object key)     判断集合是否包含指定的键
            public boolean containsValue(Object value) 判断集合是否包含指定的值
            public boolean isEmpty()		           判断集合是否为空
            public int size()			               集合的长度，也就是集合中键值对的个数
            ---------------------------------------------------------------------------

     */
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        // 添加元素
        map.put("张三", "北京");
        map.put("李四", "北京");
        map.put("王五", "上海");
        map.put("王五", "深圳");
        System.out.println(map);

        // 删除元素
        map.remove("王五");
        System.out.println(map);

        // 判断集合是否为空
        System.out.println(map.isEmpty());
        // 集合的长度
        System.out.println(map.size());

        // 判断集合中是否包含指定键
        System.out.println(map.containsKey("张三"));          // out: true
        // 判断集合中是否包含指定值
        System.out.println(map.containsValue("深圳"));        // out: false

        // 清空元素
        map.clear();
        System.out.println(map);

    }
}
