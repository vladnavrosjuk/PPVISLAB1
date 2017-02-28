

import javax.swing.*;
import java.awt.*;

public class Main  {
    JFrame jFrame;



    Main(){
        JFrame jFrame  = new JFrame("ППВИС ЛАБА 1");
        jFrame.getContentPane().setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(430, 550);
        jFrame.setVisible(true);
        Punkt1 panel1 = new Punkt1();
        Punkt5 panel5 = new Punkt5();
        Punkt2 panel2 = new Punkt2();
        Punkt3 panel3 = new Punkt3();
        Punkt4 panel4 = new Punkt4();
        jFrame.add(panel2.Panel2());
        jFrame.add(panel1.Panel1());
        jFrame.add(panel3.Panel3());
        jFrame.add(panel4.Panel4());
        jFrame.add(panel5.Panel5());
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}