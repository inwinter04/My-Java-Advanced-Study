package cn.iamdt.regex;

public class StringRegexMethod {
    /*
        String类中与正则有关的常见方法

            public String replaceAll(String regex,String newStr) : 按照正则表达式匹配的内容进行替换
     */
    public static void main(String[] args) {
        String s = "先帝1创业2未半而中道3崩殂4，今5天下三分6，益州疲弊7，此8诚危急存亡之秋也。然9侍卫之臣不懈于内，忠志之士忘身10于外者，盖追先帝之殊遇11，欲报之于陛下也。诚宜12开张圣听13，以光14先帝遗德，恢弘15志士之气，不宜妄自菲薄16，引喻失义17，以塞忠谏之路也18。";

        System.out.println(s.replaceAll("\\d{1}", ""));
    }
}
