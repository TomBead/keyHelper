import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * 爱雅
 */

public class AiYa extends CommonHero {

    public AiYa() throws AWTException {
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
                fengcong();
                break;
            case KeyAdapt.KEY_P:
                quanquanK();
                break;
            case KeyAdapt.KEY_M:
                sasdl();
                break;
            case KeyAdapt.KEY_N:
                sdsal();
                break;
        }
    }



    //风冲 下后 A
    void fengcong() {
        System.out.println(System.currentTimeMillis() + "风冲j=====");
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(30);
        robot.keyPress(KeyEvent.VK_A);
        robot.delay(30);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(30);
        robot.keyPress(KeyEvent.VK_J);
        robot.delay(30);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_J);
        robot.delay(30);
    }

    //斜方向冲  ==下后 B
    void fengyin() {
        System.out.println(System.currentTimeMillis() + "风隐k=====");
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

    //锁骨
    void suogu() {
        System.out.println(System.currentTimeMillis() + "锁骨C=====");
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(30);
        robot.keyPress(KeyEvent.VK_A);
        robot.delay(30);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(30);
        robot.keyPress(KeyEvent.VK_L);
        robot.delay(30);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_L);
        robot.delay(30);
    }


    //圈圈，大中小
    void quanquanK() {
        System.out.println(System.currentTimeMillis() + "圈圈=====");
        //前下 前下 a
        robot.keyPress(KeyEvent.VK_D);
        robot.delay(30);
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(30);
        robot.keyRelease(KeyEvent.VK_D);
        robot.delay(30);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(30);
        //
        robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_D);
        robot.delay(30);

        robot.keyRelease(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(30);
        robot.keyPress(KeyEvent.VK_J);
        robot.delay(30);
        robot.keyRelease(KeyEvent.VK_J);

    }

    //升天，大中小
    void shengtianK() {
        System.out.println(System.currentTimeMillis() + "升天 k=====");
        //前下 前下 a
        robot.keyPress(KeyEvent.VK_D);
        robot.delay(30);
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(30);
        robot.keyRelease(KeyEvent.VK_D);
        robot.delay(30);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(30);
        //
        robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_D);
        robot.delay(30);

        robot.keyRelease(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(30);
        robot.keyPress(KeyEvent.VK_K);
        robot.delay(30);
        robot.keyRelease(KeyEvent.VK_K);

    }

    //升天 ，大中小
    void shengtianU() {
        System.out.println(System.currentTimeMillis() + "升天u =====");
        //前下 前下 a
        robot.keyPress(KeyEvent.VK_D);
        robot.delay(30);
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(30);
        robot.keyRelease(KeyEvent.VK_D);
        robot.delay(30);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(30);
        //
        robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_D);
        robot.delay(30);

        robot.keyRelease(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(30);
        robot.keyPress(KeyEvent.VK_L);
        robot.delay(30);
        robot.keyRelease(KeyEvent.VK_L);

    }





}
