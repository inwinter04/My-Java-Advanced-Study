package cn.iamdt.frame.label;

import javax.swing.*;

public class JLabelTest {
    /*
        案例：使用JLabel展示文本和图片

        JLabel构造方法 :
            JLabel(String text) 使用指定的文本创建一个 JLabel 对象
            JLabel(Icon image) 使用指定的图像创建一个 JLabel 对象
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // JLabel展示文本
        JLabel jl1 = new JLabel("听君一席话");
        jl1.setBounds(50,50,100,100);
        frame.getContentPane().add(jl1);

        JLabel jl2 = new JLabel("如听一席话");
        jl2.setBounds(150,50,100,100);
        frame.getContentPane().add(jl2);

        // JLabel展示图片
        JLabel imgLabel_3png = new JLabel(new ImageIcon("E:\\Codes\\Java\\Advanced-Codes\\day03-code\\src\\cn\\iamdt\\frame\\label\\image\\3.png"));
        imgLabel_3png.setBounds(50,150,100,100);
        frame.getContentPane().add(imgLabel_3png);

        JLabel imgLabel_2png = new JLabel(new ImageIcon("E:\\Codes\\Java\\Advanced-Codes\\day03-code\\src\\cn\\iamdt\\frame\\label\\image\\2.png"));
        imgLabel_2png.setBounds(150,150,100,100);
        frame.getContentPane().add(imgLabel_2png);

        frame.setVisible(true);
    }
}
