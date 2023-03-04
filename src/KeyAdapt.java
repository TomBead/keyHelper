import com.melloware.jintellitype.HotkeyListener;
import com.melloware.jintellitype.JIntellitype;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//创建全局快捷键
public class KeyAdapt extends JFrame implements ActionListener {
    public static char[] keyCode = {'E', 'R', 'U', 'O', 'P', 'U', 'N', 'M'};
    public static final int KEY_E = 'E';
    public static final int KEY_R = 'R';
    public static final int KEY_U = 'U';
    public static final int KEY_O = 'O';
    public static final int KEY_P = 'P';
    public static final int KEY_N = 'N';
    public static final int KEY_M = 'M';
    //
    CommonHero hero;
    AiYaYH aiYaYH;
    AiYa aiYa;
    Lost lost;
    //
    public JButton jb1, jb2;

    public static boolean isKeyRegist = false;


    //是哪个人
    public static String[] NameIndex = {"Hero", "aiYaYH", "AiYa", "Lost"};
    public static int currIndex = 0;
    //


    // 初始化
    public KeyAdapt() throws AWTException {
        aiYaYH = new AiYaYH();
        aiYa = new AiYa();
        lost = new Lost();
        hero = new CommonHero();
        init();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new KeyAdapt();
                } catch (AWTException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // 初始化
    private void init() {
        JPanel jp1 = new JPanel();
        jp1.setLayout(null);
        jb1 = new JButton("开启一键招式");
        jb1.setBounds(20, 20, 260, 30);
        jb1.addActionListener(this);
        jp1.add(jb1);


        jb2 = new JButton("关闭一键招式");
        jb2.setBounds(20, 60, 260, 30);
        jb2.addActionListener(this);
        jp1.add(jb2);


        this.add(jp1);
        this.setTitle("注册全局快捷键");
        this.setSize(310, 310);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addKeyListen();
    }


    void addKeyListen() {
        // 添加热键监听器
        // 第二步：添加热键监听器
        JIntellitype.getInstance().addHotKeyListener(new HotkeyListener() {
            public void onHotKey(int markCode) {
                System.out.println("当前英雄===" + NameIndex[currIndex]);
                if (currIndex == 0) {
                    hero.keyWork(markCode);
                }
                if (currIndex == 1) {
                    aiYaYH.keyWork(markCode);
                }
                if (currIndex == 2) {
                    aiYa.keyWork(markCode);
                }
                if (currIndex == 3) {
                    lost.keyWork(markCode);
                }
            }
        });
    }


    // 事件监听
    @Override
    public void actionPerformed(ActionEvent e) {
        // 监听注册全局快捷键
        if (e.getSource().equals(jb1)) {
            if (!isKeyRegist) {
                JOptionPane.showMessageDialog(null, NameIndex[currIndex] + " 开启成功",
                        "提示消息", JOptionPane.INFORMATION_MESSAGE);
                registKey();
                return;
            }

            //
            if (currIndex < NameIndex.length - 1) {
                currIndex++;
            } else {
                currIndex = 0;
            }
            JOptionPane.showMessageDialog(null, NameIndex[currIndex] + " 开启成功",
                    "提示消息", JOptionPane.INFORMATION_MESSAGE);

        }
        // 监听注册全局快捷键
        if (e.getSource().equals(jb2)) {
            unRegistKey();
            JOptionPane.showMessageDialog(null, "一键招式已经关闭",
                    "提示消息", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    void registKey() {
        // 第一步：注册热键，热键标识，组合键（shift），主要热键D
        for (int i = 0; i < keyCode.length; i++) {
            JIntellitype.getInstance().registerHotKey((int) keyCode[i], 0, (int) keyCode[i]);
        }
        isKeyRegist = true;
    }


    void unRegistKey() {
        for (int i = 0; i < keyCode.length; i++) {
            JIntellitype.getInstance().unregisterHotKey((int) keyCode[i]);
        }
        isKeyRegist = false;
    }


}
