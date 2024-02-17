package cn.iamdt.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("abc");
        list.add("bbb");
        list.add("def");
        list.add("ccc");

        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            String s = it.next();
            if ("def".equals(s)){
                list.remove("def");
            }
        }

    }
}
