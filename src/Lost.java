import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * 玩剑的
 */

public class Lost extends CommonHero {

    public Lost() throws AWTException {
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
                pingsheK();
                break;
            case KeyAdapt.KEY_P:
                pingsheU();
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


    void pingsheJ() {
        System.out.println(System.currentTimeMillis() + "pingshej=====");

        robot.keyPress(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_D);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_J);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_J);
        //
        robot.keyPress(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_J);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_D);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_J);
    }

    void pingsheK() {

        robot.keyPress(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_D);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_K);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_K);
        //
        robot.keyPress(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_K);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_D);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_K);

    }

    void pingsheU() {
        System.out.println(System.currentTimeMillis() + "pingsheU=====");
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_D);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_L);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_L);
        //
        robot.keyPress(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_L);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_D);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_L);
        robot.delay(180);
    }


}
