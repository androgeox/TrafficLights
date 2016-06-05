package Model;

import java.util.concurrent.TimeUnit;

public class LightsTimer {

    private int delay;
//    private int delay_red;
//    private int delay_yellow;
//    private int delay_green;

    public LightsTimer() {
    }

    public LightsTimer(int delay) {
    }

//    public void setDelay(int delay_red, int delay_yellow, int delay_green) {
//        this.delay_red = delay_red;
//        this.delay_yellow = delay_yellow;
//        this.delay_green = delay_green;
//    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public void start() {
        try {
            TimeUnit.SECONDS.sleep(delay);
//          TimeUnit.MINUTES.sleep(delay_yellow);
//          TimeUnit.MINUTES.sleep(delay_green);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
