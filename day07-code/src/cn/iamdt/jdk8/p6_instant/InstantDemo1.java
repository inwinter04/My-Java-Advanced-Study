package cn.iamdt.jdk8.p6_instant;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo1 {
    /*
        Instant类 : 用来表示时间的对象，类似于之前学的Date
     */
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("当前的时间戳是:" + now);

        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);
    }
}
