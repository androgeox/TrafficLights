package Controller;

import Model.LightsTimer;
import View.MyWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Listener implements ActionListener {

    private MyWindow window;

    @Override
    public void actionPerformed(ActionEvent e) {
        window = new MyWindow();

        if (window.getRedTime() == null && window.getYellowTime() == null && window.getGreenTime() == null) {
            setTrafficLights();
        } else {
            while (window.getRedTime() != null || window.getYellowTime() != null || window.getGreenTime() != null) {
                oneWork();
            }
        }
    }

    /**
     * Method start timer with value of JTextField
     */
    private void setTrafficLights() {
        try {
            String str = window.getRedTime().getText();//TODO str = null?
            System.out.println(str);
            int delay_red = Integer.parseInt(str);
            int delay_yellow = Integer.parseInt(window.getYellowTime().getText());
            int delay_green = Integer.parseInt(window.getGreenTime().getText());
            LightsTimer timer = new LightsTimer();
            timer.setDelay(delay_red);
            timer.start();
            window.setLabelRed(new JLabel(""));
            window.setLabelYellow(new JLabel("yellow"));
            timer.setDelay(delay_yellow);
            timer.start();
            window.setLabelYellow(new JLabel(""));
            window.setLabelGreen(new JLabel("green"));
            timer.setDelay(delay_green);
            timer.start();
            window.setLabelGreen(new JLabel(""));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    * Method start when value of JTextField isEmpty
     */
    private void oneWork() {
        LightsTimer timer = new LightsTimer();
        window.setLabelRed(new JLabel("red"));
        timer.setDelay(2);
        timer.start();
        window.setLabelRed(new JLabel(""));
        window.setLabelYellow(new JLabel("yellow"));
        timer.setDelay(3);
        timer.start();
        window.setLabelYellow(new JLabel(""));
        window.setLabelGreen(new JLabel("green"));
        timer.setDelay(5);
        timer.start();
        window.setLabelGreen(new JLabel(""));
    }
}
