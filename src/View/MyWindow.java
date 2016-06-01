package View;

import javax.swing.*;
import java.awt.*;


import Controller.*;

/**
 * Created by Georgiy on 31.05.2016.
 */
public class MyWindow extends JFrame {

    private JLabel labelRed;
    private JLabel labelYellow;
    private JLabel labelGreen;
    private JTextField redTime;
    private JTextField yellowTime;
    private JTextField greenTime;
    private JButton startBtn;

    public MyWindow(){
        super("TraficLights");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        GridLayout grid = new GridLayout(2, 3);
        grid.setHgap(20);
        grid.setVgap(20);
        panel.setLayout(grid);

        labelRed = new JLabel("",JLabel.CENTER);
        labelYellow = new JLabel("",JLabel.CENTER);
        labelGreen = new JLabel("",JLabel.CENTER);


        redTime = new JTextField();
        //redTime.setSize(20, 20);

        yellowTime = new JTextField();
        //yellowTime.setSize(20, 20);

        greenTime = new JTextField();
        //greenTime.setSize(20, 20);

        startBtn = new JButton("start");
        startBtn.addActionListener(new Listener());

//        labelRed.setText("red");
//        labelYellow.setText("yellow");
//        labelGreen.setText("green");

        panel.add(labelRed);
        panel.add(labelYellow);
        panel.add(labelGreen);
        panel.add(redTime);
        panel.add(yellowTime);
        panel.add(greenTime);
        panel.add(startBtn);

        setContentPane(panel);
        setSize(400,400);

    }


    public JTextField getGreenTime() {
        return greenTime;
    }

    public void setGreenTime(JTextField greenTime) {
        this.greenTime = greenTime;
    }

    public JTextField getYellowTime() {
        return yellowTime;
    }

    public void setYellowTime(JTextField yellowTime) {
        this.yellowTime = yellowTime;
    }

    public JTextField getRedTime() {
        return redTime;
    }

    public void setRedTime(JTextField redTime) {
        this.redTime = redTime;
    }

    public JLabel getLabelGreen() {
        return labelGreen;
    }

    public void setLabelGreen(JLabel labelGreen) {
        this.labelGreen = labelGreen;
    }

    public JLabel getLabelYellow() {
        return labelYellow;
    }

    public void setLabelYellow(JLabel labelYellow) {
        this.labelYellow = labelYellow;
    }

    public JLabel getLabelRed() {
        return labelRed;
    }

    public void setLabelRed(JLabel labelRed) {
        this.labelRed = labelRed;
    }
}
