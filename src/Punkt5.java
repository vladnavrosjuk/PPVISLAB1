import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Владислав on 28.02.2017.
 */
public class Punkt5 {
    JTable table;
    JTextField texttable;
    JButton btnSwap21;
    JButton btnAdd;
    JButton btnSwap12;
    JScrollPane pane;
    JLabel jlabelpunkt5;
    JPanel jPanelTablePunkt5;

    Punkt5() {

        jlabelpunkt5 = new JLabel("Пункт 5 JTable");
        jPanelTablePunkt5 = new JPanel();
        jPanelTablePunkt5.setPreferredSize(new Dimension(405, 180));
        jPanelTablePunkt5.setOpaque(true);
        jPanelTablePunkt5.setBorder(BorderFactory.createLineBorder(Color.RED));
        JTable table = new JTable();
        Object[] columns = {"1", "2"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setBackground(Color.green);
        table.setForeground(Color.black);
        Font font = new Font("", 7, 30);
        table.setFont(font);
        table.setRowHeight(30);
        texttable = new JTextField();
        btnSwap21 = new JButton("SWAP 2 - 1");
        btnAdd = new JButton("Add");
        btnSwap12 = new JButton("SWAP 1 - 2");
        texttable.setBounds(15, 120, 300, 25);
        btnSwap21.setBounds(215, 145, 100, 25);
        btnAdd.setBounds(15, 145, 100, 25);
        btnSwap12.setBounds(120, 145, 100, 25);
        jlabelpunkt5.setBounds(15, 3, 100, 10);
        pane = new JScrollPane(table);
        pane.setBounds(15, 20, 370, 100);
        jPanelTablePunkt5.setLayout(null);
        jPanelTablePunkt5.add(jlabelpunkt5);
        jPanelTablePunkt5.add(pane);
        jPanelTablePunkt5.add(texttable);
        jPanelTablePunkt5.add(btnAdd);
        jPanelTablePunkt5.add(btnSwap12);
        jPanelTablePunkt5.add(btnSwap21);
        Object[] row = new Object[4];
        btnAdd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                row[0] = texttable.getText();
                model.addRow(row);
            }
        });

        btnSwap12.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {



                boolean isElemetInCol=true;
                int selCol = table.getSelectedRow();
                int selRow= table.getSelectedColumn();
                Object n = new Object[1];
                if (model.getValueAt(table.getSelectedRow(),table.getSelectedColumn()).equals(""))
                    isElemetInCol=false;
                if(selCol >= 0 || isElemetInCol==true ){
                    Object obj = new Object[1];
                    obj = model.getValueAt(selCol,selRow+1);
                    model.setValueAt(model.getValueAt(selCol,selRow),selCol,selRow+1);
                    model.setValueAt(obj,selCol,selRow);
                }
            }
        });
        btnSwap21.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                int selRow = table.getSelectedRow();
                int selCol = table.getSelectedColumn();
                boolean isElemetInCol=true;
                if (model.getValueAt(table.getSelectedRow(),table.getSelectedColumn()).equals(""))
                    isElemetInCol=false;


                if(selRow >= 0|| isElemetInCol==true) {
                    Object obj = new Object[1];
                    obj = model.getValueAt(selRow,selCol-1);
                    model.setValueAt(model.getValueAt(selRow,selCol),selRow,selCol-1);
                    model.setValueAt(obj,selRow,selCol);
                }
            }
        });


    }
    public JPanel Panel5(){
        return jPanelTablePunkt5;
    }
}
