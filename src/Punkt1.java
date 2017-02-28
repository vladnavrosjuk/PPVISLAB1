import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Владислав on 28.02.2017.
 */
public class Punkt1 {
    JButton jButtonName, jButtonSwap;
    JTextField jTextFieldButtonName;
    JPanel jpnl1;
    JLabel jlabelpunkt1;


    Punkt1() {
        jlabelpunkt1 = new JLabel("Пункт 2");
        jpnl1 = new JPanel();
        jpnl1.setPreferredSize(new Dimension(200, 150));
        jpnl1.setOpaque(true);
        jpnl1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jButtonName = new JButton("1");
        jButtonSwap = new JButton("2");
        jTextFieldButtonName = new JTextField();
        jButtonName.setPreferredSize(new Dimension(150,30));
        jButtonSwap.setPreferredSize(new Dimension(150,30));
        jTextFieldButtonName.setPreferredSize(new Dimension(150,30));
        jpnl1.add(jlabelpunkt1);

        jpnl1.add(jButtonName);
        jpnl1.add(jButtonSwap);
        jpnl1.add(jTextFieldButtonName);


        jButtonName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButtonSwap.setText(jTextFieldButtonName.getText());
            }
        });
        jButtonSwap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = jButtonSwap.getText();
                jButtonSwap.setText(jButtonName.getText());
                jButtonName.setText(msg);

            }
        });


    }
    public JPanel Panel1(){
        return jpnl1;
    }
}
