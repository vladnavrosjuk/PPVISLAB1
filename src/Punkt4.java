import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Владислав on 28.02.2017.
 */
public class Punkt4 {
    JPanel jpnl4;
    JTextField jTextFieldCheckBox;
    JCheckBox jcb1;
    JCheckBox jcb2;
    JCheckBox jcb3;
    JButton jButtonSelectCheckBox;
    JLabel jLabelpunkt4;

    Punkt4(){
        jpnl4 = new JPanel();
        jpnl4.setPreferredSize(new Dimension(200,150));
        jpnl4.setOpaque(true);
        jpnl4.setBorder(BorderFactory.createLineBorder(Color.magenta));
        jLabelpunkt4 = new JLabel("Пункт 4 CheckBox");
        jpnl4.add(jLabelpunkt4);
        jTextFieldCheckBox = new JTextField();
        jTextFieldCheckBox.setPreferredSize(new Dimension(150,20));
        jpnl4.add(jTextFieldCheckBox);
        jcb1 = new JCheckBox("1");
        jcb2 = new JCheckBox("2");
        jcb3 = new JCheckBox("3");
        jButtonSelectCheckBox = new JButton("Выбрать") ;
        jButtonSelectCheckBox.setPreferredSize(new Dimension(180, 30));
        jpnl4.add(jButtonSelectCheckBox);

        jpnl4.add(jcb1);
        jpnl4.add(jcb2);
        jpnl4.add(jcb3);

        jButtonSelectCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jTextFieldCheckBox.getText().equals(jcb1.getText())) {

                    if (jcb1.isSelected()) {
                        jcb1.setSelected(false);
                    } else {
                        jcb1.setSelected(true);
                    }
                }
                else if(jTextFieldCheckBox.getText().equals(jcb2.getText())) {

                    if (jcb2.isSelected()) {
                        jcb2.setSelected(false);
                    } else {
                        jcb2.setSelected(true);
                    }
                }
                else if(jTextFieldCheckBox.getText().equals(jcb3.getText())) {

                    if (jcb3.isSelected()) {
                        jcb3.setSelected(false);
                    } else {
                        jcb3.setSelected(true);
                    }
                }
                else
                    JOptionPane.showMessageDialog(jpnl4, "Данного флажка не существует", "Ошибка", JOptionPane.WARNING_MESSAGE);


            }
        });


    }
    public JPanel Panel4(){
        return jpnl4;
    }
}
