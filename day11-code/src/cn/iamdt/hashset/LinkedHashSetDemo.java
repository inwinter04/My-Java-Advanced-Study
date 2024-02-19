package cn.iamdt.hashset;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetDemo {
    /*
        LinkHashSet特点：去重，并保证存取顺序
     */
    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("d");
        lhs.add("b");
        lhs.add("a");
        lhs.add("c");
        lhs.add("c");

        System.out.println(lhs);
    }
}
