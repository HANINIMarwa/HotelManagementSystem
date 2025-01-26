package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class CustomerInfo extends JFrame implements ActionListener {
    JTable table;
    JButton back;

    CustomerInfo() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // Labels for table columns
        JLabel l1 = new JLabel("Document Type");
        l1.setBounds(10, 3, 100, 20);
        add(l1);

        JLabel l2 = new JLabel("Number");
        l2.setBounds(160, 3, 100, 20);
        add(l2);

        JLabel l3 = new JLabel("Name");
        l3.setBounds(290, 3, 100, 20);
        add(l3);

        JLabel l4 = new JLabel("Gender");
        l4.setBounds(410, 3, 100, 20);
        add(l4);

        JLabel l5 = new JLabel("Country");
        l5.setBounds(540, 3, 100, 20);
        add(l5);

        JLabel l6 = new JLabel("Room Number");
        l6.setBounds(640, 3, 100, 20);
        add(l6);

        JLabel l7 = new JLabel("Checkin time");
        l7.setBounds(760, 3, 100, 20);
        add(l7);
        

        // Table to display customer data
        table = new JTable();
        table.setBounds(0, 40, 1000, 370);
        add(table);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("SELECT * FROM Customer"); // Corrected SQL query
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Back button
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setBounds(420, 500, 120, 30);
        add(back);

        // Frame settings
        setBounds(300, 200, 1000, 600);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            setVisible(false); // Hide the current window
            new Reception(); // Open the Reception window
        }
    }

    public static void main(String[] args) {
        new CustomerInfo();
    }
}