import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * 爱雅永恒
 */

public class AiYaYH extends CommonHero {


    public AiYaYH() throws AWTException {
        super();
    }


    public void keyWork(int markCode) {
        if (System.currentTimeMillis() - lastClickTime < FAST_CLICK_DELAY_TIME) {
            System.out.println("按得太快返回" + (System.currentTimeMillis() - lastClickTime));
            return;
        }
        lastClickTime = System.currentTimeMillis();
        switch (markCode) {
            case KeyAdapt.KEY_E:
                baoqi();
                break;
            case KeyAdapt.KEY_R:
                sdsdl();
                break;
            case KeyAdapt.KEY_U:
                sdk();
                break;
            case KeyAdapt.KEY_O:
                sdl();
                break;
            case KeyAdapt.KEY_P:
                sal();
                break;
            case KeyAdapt.KEY_M:
                simohuan();
                break;
            case KeyAdapt.KEY_N:
                kuzhao();
                break;
        }
    }


    void xiazhua() {
        System.out.println(System.currentTimeMillis() + "下zhua=====");
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_D);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_L);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_L);

    }


    //虚闪，下后 jku
    void xushanK() {
        System.out.println(System.currentTimeMillis() + "虚闪K=====");
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(30);
        robot.keyPress(KeyEvent.VK_A);
        robot.delay(30);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(30);
        robot.keyPress(KeyEvent.VK_K);
        robot.delay(30);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_K);
        robot.delay(30);
    }


    //
    void zhaotou() {
        System.out.println(System.currentTimeMillis() + "斥扉=====");
        robot.keyPress(KeyEvent.VK_A);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_K);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_K);
        robot.delay(100);
    }

    //裂空
    void liekong() {
        System.out.println(System.currentTimeMillis() + "裂空=====");
        robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_D);
        robot.delay(60);
        robot.keyPress(KeyEvent.VK_K);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_K);
    }


    //
    void gangren() {
        System.out.println(System.currentTimeMillis() + "钢刃=====");
        robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_D);
        robot.delay(60);
        robot.keyPress(KeyEvent.VK_I);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_I);
    }

    //单个学爪
    void xueyaJ() {
        System.out.println(System.currentTimeMillis() + "小血牙=====");
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_D);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_D);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_A);
    }

    //单个学爪
    void xueyaK() {
        System.out.println(System.currentTimeMillis() + "小血牙=====");
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_D);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_K);
        robot.keyRelease(KeyEvent.VK_D);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_K);
    }


    //血压
    void xueya() {
        System.out.println("血牙=====");
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_D);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_L);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_L);
    }

    //虚闪，下后 jku
    void xushan() {
        System.out.println(System.currentTimeMillis() + "虚闪U=====");
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_A);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_L);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_L);
        robot.delay(20);
    }

    //下下 c
    void baoqi() {
        System.out.println("曝气=====");
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(60);
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_L);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_L);
        robot.delay(100);

    }

    //超限状态
    void chaoxian() {
        System.out.println("超限状态=====");
        robot.keyPress(KeyEvent.VK_D);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_I);
    }

    //痛苦之爪
    void kuzhao() {
        System.out.println("恸哭之爪=====");
        //下后
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(30);
        robot.keyPress(KeyEvent.VK_D);
        robot.delay(30);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(30);
        robot.keyRelease(KeyEvent.VK_D);
        //下前
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(30);
        robot.keyPress(KeyEvent.VK_A);
        robot.delay(30);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(30);
        robot.keyRelease(KeyEvent.VK_A);
        robot.delay(30);
        //C
        robot.keyPress(KeyEvent.VK_L);
        robot.delay(30);
        robot.keyRelease(KeyEvent.VK_L);
        robot.delay(100);
    }

    //四魔幻，圈圈
    void simohuan() {
        System.out.println("噬魔环=====");
        //下后
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(30);
        robot.keyPress(KeyEvent.VK_A);
        robot.delay(30);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(30);
        robot.keyRelease(KeyEvent.VK_A);
        //下前
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(30);
        robot.keyPress(KeyEvent.VK_D);
        robot.delay(30);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(30);
        robot.keyRelease(KeyEvent.VK_D);
        robot.delay(30);
        //c
        robot.keyPress(KeyEvent.VK_L);
        robot.delay(30);
        robot.keyRelease(KeyEvent.VK_L);
        robot.delay(100);
    }


    //究极大招，
    void delay(int time) {
        robot.delay(time);
    }


}
