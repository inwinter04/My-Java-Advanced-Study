package cn.iamdt.stonepuzzle;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class MainFrame extends JFrame implements KeyListener {
    int[][] data = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    public MainFrame() {
        // 注册键盘监听器
        this.addKeyListener(this);
        // 初始化窗体
        initFrame();
        // 初始化数据
        initData();
        // 绘制界面
        paintView();
        // 显示窗体
        setVisible(true);
    }

    /**
     * 初始化数据(打乱二维数组)
     */
    public void initData() {
        // 准备Random对象
        Random r = new Random();
        // 遍历二维数组，获取到每一个元素
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                int randomX = r.nextInt(4);
                int randomY = r.nextInt(4);
                // data[i][j]
                // data[randomX][randomY]
                int temp = data[i][j];
                data[i][j] = data[randomX][randomY];
                data[randomX][randomY] = temp;
            }
        }
    }


    /**
     * 初始化窗体
     */
    public void initFrame() {
        // 设置窗体大小
        setSize(514, 595);
        // 设置窗体关闭模式
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 设置窗体标题
        setTitle("石头迷阵单机版V1.0");
        // 设置窗体顶置
        setAlwaysOnTop(true);
        // 设置窗体居中
        setLocationRelativeTo(null);
        // 取消窗体默认样式
        setLayout(null);
    }

    /**
     * 绘制界面
     */
    public void paintView() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JLabel imageLabel = new JLabel(new ImageIcon("E:\\Codes\\Java\\Advanced-Codes\\day04-code\\src\\cn\\iamdt\\stonepuzzle\\image\\" + data[i][j] + ".png"));
                imageLabel.setBounds(50 + 100 * j, 90 + 100 * i, 100, 100);
                getContentPane().add(imageLabel);
            }
        }

        JLabel background = new JLabel(new ImageIcon("E:\\Codes\\Java\\Advanced-Codes\\day04-code\\src\\cn\\iamdt\\stonepuzzle\\image\\background.png"));
        background.setBounds(26, 30, 450, 484);
        getContentPane().add(background);
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

    // ---------------------------------------------------------
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
// ----------------------------------------------------------
}
