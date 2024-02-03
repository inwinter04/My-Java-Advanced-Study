package cn.iamdt.frame.listener;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerTest {
    /*
        键盘事件 : KeyListenerTest
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            // 无法监听到 fn esc 上下左右 键盘操作
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == 37) {
                    System.out.println("左移动业务代码");
                } else if (keyCode == 38) {
                    System.out.println("上移动业务代码");
                } else if (keyCode == 39) {
                    System.out.println("右移动业务代码");
                } else if (keyCode == 40) {
                    System.out.println("下移动业务代码");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        frame.setVisible(true);
    }
}
