package cn.iamdt.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo4 {
    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });

        ts.add("a");
        ts.add("aa");
        ts.add("aaaa");
        ts.add("aaa");

        System.out.println(ts);

    }
}
