import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * 操作父类
 */
public class CommonHero {

    //全局定义
    public static long lastClickTime = 0L;
    // 快速点击间隔dj
    public static final long FAST_CLICK_DELAY_TIME = 150L;

    public Robot robot;

    public CommonHero() throws AWTException {
        robot = new Robot();
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
                sasdl();
                break;
            case KeyAdapt.KEY_N:
                sdsal();
                break;
        }
    }

// ================================================================================

    //
    void sdj() {
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_D);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_J);
        robot.keyRelease(KeyEvent.VK_D);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_J);
        robot.delay(100);
    }

    /**
     * 下前B
     */
    void sdk() {
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(53);
        robot.keyPress(KeyEvent.VK_D);
        robot.delay(53);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(53);
        robot.keyPress(KeyEvent.VK_K);
        robot.keyRelease(KeyEvent.VK_D);
        robot.delay(53);
        robot.keyRelease(KeyEvent.VK_K);
        robot.delay(53);
    }


    void sdl() {
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

    void sal() {
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_A);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_L);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_L);
    }


    void baoqi() {
        robot.keyPress(KeyEvent.VK_D);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_A);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_A);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_I);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_I);
    }


    //下 欠下 欠 l
    void sdsdl() {
        //下前
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_D);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(20);
        //下后
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_D);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_D);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_D);
        robot.delay(20);
        //C
        robot.keyPress(KeyEvent.VK_L);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_L);
        robot.delay(100);
    }

    void sdsal() {
        //下前
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_D);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(20);
        //下后
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_D);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_A);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_A);
        robot.delay(20);
        //C
        robot.keyPress(KeyEvent.VK_L);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_L);
        robot.delay(100);
    }

    //下后下欠C
    void sasdl() {
        //下
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_A);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(20);
        //下后
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_A);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_D);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_D);
        robot.delay(20);
        //C
        robot.keyPress(KeyEvent.VK_L);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_L);
        robot.delay(100);
    }
}
