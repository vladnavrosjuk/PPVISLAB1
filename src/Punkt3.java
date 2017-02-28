import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Владислав on 28.02.2017.
 */
public class Punkt3 {
    JPanel jpnl3;
    JTextField jTextFieldRb;
    JRadioButton jrb1, jrb2, jrb3;
    JButton jButtonSelectRB;
    JLabel jLabelpunkt3;

    Punkt3(){
        jpnl3 = new JPanel();
        jpnl3.setPreferredSize(new Dimension(200,150));
        jpnl3.setOpaque(true);
        jpnl3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
        jLabelpunkt3 = new JLabel( "Пункт 3 RadioButton");
        jpnl3.add(jLabelpunkt3);
        jButtonSelectRB = new JButton("Выбрать");

        jrb1 = new JRadioButton("1",true );
        jrb2 = new JRadioButton("2");
        jrb3 = new JRadioButton("3");
        ButtonGroup bg = new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);
        bg.add(jrb3);
        jTextFieldRb = new JTextField();
        jTextFieldRb.setPreferredSize(new Dimension(150,20));
        jpnl3.add(jLabelpunkt3);
        jpnl3.add(jTextFieldRb);
        jpnl3.add(jButtonSelectRB);
        jButtonSelectRB.setPreferredSize(new Dimension(180, 30));
        jpnl3.add(jrb1);
        jpnl3.add(jrb2);
        jpnl3.add(jrb3);

        jButtonSelectRB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(jTextFieldRb.getText().equals(jrb1.getText())) {

                    if (jrb1.isSelected()) {
                        JOptionPane.showMessageDialog(jpnl3, "Данная кнопка уже выбрана", "Ошибка", JOptionPane.WARNING_MESSAGE);
                    } else {
                        jrb1.setSelected(true);
                    }
                }
                else if(jTextFieldRb.getText().equals(jrb2.getText())) {

                    if (jrb2.isSelected()) {
                        JOptionPane.showMessageDialog(jpnl3, "Данная кнопка уже выбрана", "Ошибка", JOptionPane.WARNING_MESSAGE);
                    } else {
                        jrb2.setSelected(true);
                    }
                }
                else if(jTextFieldRb.getText().equals(jrb3.getText())) {

                    if (jrb3.isSelected()) {
                        JOptionPane.showMessageDialog(jpnl3, "Данная кнопка уже выбрана", "Ошибка", JOptionPane.WARNING_MESSAGE);
                    } else {
                        jrb3.setSelected(true);
                    }
                }
                else
                    JOptionPane.showMessageDialog(jpnl3, "Данной кнопки не существует", "Ошибка", JOptionPane.WARNING_MESSAGE);

            }
        });
    }
    public JPanel Panel3()
    {
        return jpnl3;
    }
}
