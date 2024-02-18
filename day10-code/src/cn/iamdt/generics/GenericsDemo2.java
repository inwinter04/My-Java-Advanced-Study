package cn.iamdt.generics;

public class GenericsDemo2 {
    /*
        常见的泛型标识符 :  E V K T

            E : Element
            T : Type
            K : Key(键)
            V : Value(值)

        清楚不同的泛型, 在什么时机能确定到具体的类型

        泛型类 : 创建对象的时候
     */
    public static void main(String[] args) {
        Student<String> stu = new Student<>();
        stu.setE("张三");     // 上方限制的是什么泛型这里就只能传入什么类型
    }
}

class Student<E> {
    private E e;

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
