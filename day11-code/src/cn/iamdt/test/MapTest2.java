package cn.iamdt.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MapTest2 {
    /*
        需求：
                定义一个Map集合，键用表示省份名称，值表示市，但是市会有多个

                添加完成后，遍历结果：

                格式如下：

                江苏省=南京市，扬州市，苏州市，无锡市，常州市
     */
    public static void main(String[] args) {

        HashMap<String, List<String>> hm = new HashMap<>();

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "南京市", "扬州市", "苏州市", "无锡市", "常州市");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "武汉市", "孝感市", "十堰市", "宜宾市", "鄂州市");
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "成都市", "绵阳市", "自贡市", "攀枝花市", "泸州市");

        hm.put("江苏省", list1);
        hm.put("湖北省", list2);
        hm.put("四川省", list3);

        hm.forEach(new BiConsumer<String, List<String>>() {
            @Override
            public void accept(String key, List<String> value) {
                System.out.print(key + "=");
                for (int i = 0; i < value.size() - 1; i++) {
                    System.out.print(value.get(i) + "，");
                }
                System.out.println(value.get(value.size() - 1));
            }
        });
    }
}
