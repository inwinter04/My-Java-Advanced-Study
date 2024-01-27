package cn.iamdt.b;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        // z.show();            // 'show()' 在 'cn.iamdt.a.Fu' 中具有 protected 访问权限，无法访问
        z.method();
    }
}
