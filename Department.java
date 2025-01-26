package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class Department extends JFrame implements ActionListener {
    JTable table;
    JButton back;

    Department() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // Labels for Department and Budget
        JLabel l1 = new JLabel("Department");
        l1.setBounds(15, 3, 100, 20);
        add(l1);

        JLabel l2 = new JLabel("Budget");
        l2.setBounds(370, 3, 100, 20);
        add(l2);

        // Table to display department data
        table = new JTable();
        table.setBounds(0, 50, 700, 400);
        add(table);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("SELECT * FROM department");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Back button
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this); // Attach ActionListener
        back.setBounds(280, 400, 120, 30);
        add(back);

        // Frame settings
        setBounds(400, 200, 700, 480);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            System.out.println("Back button clicked"); // Debugging statement
            setVisible(false); // Hide the current window
            new Reception(); // Open the Reception window
            System.out.println("Reception window should be open now"); // Debugging statement
        }
    }

    public static void main(String[] args) {
        new Department();
    }
}