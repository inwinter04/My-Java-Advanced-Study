package cn.iamdt.stonepuzzle;

import javax.swing.*;
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

    int row;            // 0号元素行坐标
    int column;         // 0号元素列坐标

    public MainFrame() {
        // 注册键盘监听器。  窗体对象.addKeyListener(KeyListener实现类对象)
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

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == 0) {
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println(row + "," + column);
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
        // 清空原有控件
        getContentPane().removeAll();

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

        // 重新绘制新界面
        getContentPane().repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        move(keyCode);
        paintView();
    }

    /**
     * 此方法用于处理移动业务
     */
    public void move(int keyCode) {
        if (keyCode == 37) {
            // 左移动业务代码
            // 移动前：data[row][column]
            // 移动后：data[row][column+1]
            if (column != 3) {
                int temp = data[row][column];
                data[row][column] = data[row][column + 1];
                data[row][column + 1] = temp;
                column++;
            }
        } else if (keyCode == 38) {
            // 上移动业务代码
            // 移动前：data[row][column]
            // 移动后：data[row+1][column]
            if (row != 3) {
                int temp = data[row][column];
                data[row][column] = data[row + 1][column];
                data[row + 1][column] = temp;
                row++;
            }
        } else if (keyCode == 39) {
            // 右移动业务代码
            // 移动前：data[row][column]
            // 移动后：data[row][column-1]
            if (column != 0) {
                int temp = data[row][column];
                data[row][column] = data[row][column - 1];
                data[row][column - 1] = temp;
                column--;
            }
        } else if (keyCode == 40) {
            // 下移动业务代码
            // 移动前：data[row][column]
            // 移动后：data[row-1][column]
            if (row != 0) {
                int temp = data[row][column];
                data[row][column] = data[row - 1][column];
                data[row - 1][column] = temp;
                row--;
            }
        }
//        else if (keyCode == 90) {
//            // 作弊器代码：z
//            data = new int[][]{
//                    {1, 2, 3, 4},
//                    {5, 6, 7, 8},
//                    {9, 10, 11, 12},
//                    {13, 14, 15, 0}
//            };
//        }
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
