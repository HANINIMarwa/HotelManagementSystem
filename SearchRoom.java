
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class SearchRoom extends JFrame implements ActionListener{
    JTable table;
    JButton back;
    JComboBox bedType;
    SearchRoom() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

      JLabel text = new JLabel("Search for Room");
      text.setFont(new Font("Tahoma" , Font.PLAIN,20));
      text.setBounds(250,150,200,30);
      add(text);
      
      JLabel lblbed = new JLabel("Bed Type");
      lblbed.setBounds(50,100,100,20);
      add(lblbed);
      
      bedType = new JComboBox(new String[] {"Single bed","Double bed"}); 
      bedType.setBounds(150,100,150,25);
      bedType.setBackground(Color.WHITE);
      add(bedType);
      
        JLabel l1 = new JLabel("Room Number");
        l1.setBounds(15, 3, 100, 20);
        add(l1);
        
        JLabel l2 = new JLabel("Status");
        l2.setBounds(230, 3, 100, 20);
        add(l2);
        
        JLabel l3 = new JLabel("Availibility");
        l3.setBounds(120, 3, 100, 20);
        add(l3);
        
        JLabel l4 = new JLabel("Price");
        l4.setBounds(330, 3, 100, 20);
        add(l4);
        
        JLabel l5 = new JLabel("Bed type");
        l5.setBounds(410, 3, 100, 20);
        add(l5);
        
        table = new JTable();
        table.setBounds(0, 20, 500, 400);
        add(table);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("SELECT * FROM room");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setBounds(200,500,120,30);
        add(back);

        setBounds(300, 200, 1050, 600);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Reception();
    }
    public static void main(String[] args) {
        new SearchRoom();
    }
}