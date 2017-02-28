import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Владислав on 28.02.2017.
 */
public class Punkt2  {
    JPanel jpnl2;
    JTextField jTextFieldComboBox;
    JComboBox jcbb;
    JLabel jLabelpunkt2, jLabelAdd;
    JButton jButtonAdd;
    String appl[]={};



    Punkt2() {
        jpnl2 = new JPanel();
        jpnl2.setPreferredSize(new Dimension(200, 150));
        jpnl2.setOpaque(true);
        jpnl2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        jButtonAdd = new JButton("Добавить");
        jcbb = new JComboBox(appl);
        jcbb.setEditable(true);

        jLabelpunkt2 = new JLabel("Пункт 1 Сombobox");

        jLabelAdd = new JLabel("Добавлено 0");


        jTextFieldComboBox = new JTextField();
        jTextFieldComboBox.setPreferredSize(new Dimension(150, 20));
        jpnl2.add(jLabelpunkt2);
        jpnl2.add(jTextFieldComboBox);
        jpnl2.add(jButtonAdd);
        jpnl2.add(jcbb);
        jpnl2.add(jLabelAdd);


        jButtonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i;
                boolean isElemetInlist=false;
                for (i=0; i <jcbb.getItemCount();i++) {
                    if (jTextFieldComboBox.getText().equals(jcbb.getItemAt(i)))
                    {
                        JOptionPane.showMessageDialog(jpnl2, "Данный элемент уже есть","Ошибка",JOptionPane.WARNING_MESSAGE);


                        isElemetInlist = true;
                        break;
                    }
                }
                if(isElemetInlist == false) {
                    jcbb.addItem(jTextFieldComboBox.getText());
                    jLabelAdd.setText("Добавлено " + (i+1));
                }

            }


        });

    }
    public JPanel Panel2(){
        return jpnl2;
    }

}