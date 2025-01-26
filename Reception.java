package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reception extends JFrame implements ActionListener {
    JButton newCustomer, rooms, department, allEmployeee, ManagerInfo, Customers,logout;

    Reception() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        newCustomer = new JButton("New Customer Form");
        newCustomer.setBounds(10, 30, 200, 30);
        newCustomer.setBackground(Color.BLACK);
        newCustomer.setForeground(Color.WHITE);
        newCustomer.addActionListener(this);
        add(newCustomer);

        rooms = new JButton("ROOMS");
        rooms.setBounds(10, 70, 200, 30);
        rooms.setBackground(Color.BLACK);
        rooms.setForeground(Color.WHITE);
        rooms.addActionListener(this);
        add(rooms);

        department = new JButton("Department");
        department.setBounds(10, 110, 200, 30);
        department.setBackground(Color.BLACK);
        department.setForeground(Color.WHITE);
        department.addActionListener(this);
        add(department);

        allEmployeee = new JButton("All Employees");
        allEmployeee.setBounds(10, 150, 200, 30);
        allEmployeee.setBackground(Color.BLACK);
        allEmployeee.setForeground(Color.WHITE);
        allEmployeee.addActionListener(this);
        add(allEmployeee);

        Customers = new JButton("Customer infos");
        Customers.setBounds(10, 190, 200, 30);
        Customers.setBackground(Color.BLACK);
        Customers.setForeground(Color.WHITE);
        Customers.addActionListener(this);
        add(Customers);

        ManagerInfo = new JButton("Manager Info ");
        ManagerInfo.setBounds(10, 230, 200, 30);
        ManagerInfo.setBackground(Color.BLACK);
        ManagerInfo.setForeground(Color.WHITE);
        ManagerInfo.addActionListener(this);
        add(ManagerInfo);

        logout = new JButton("Logout");
        logout.setBounds(10, 270, 200, 30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.addActionListener(this);
        add(logout);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/reception.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(250, 30, 500, 470);
        add(image);

        setBounds(350, 200, 800, 570);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == newCustomer) {
            setVisible(false);
            new AddCustomer();
        } else if (ae.getSource() == rooms) {
            setVisible(false);
            new Room();
        } else if (ae.getSource() == department) {
            setVisible(false);
            new Department();
        } else if (ae.getSource() == allEmployeee) {
            setVisible(false);
            new Employeeinfo();
        } else if (ae.getSource() == ManagerInfo) {
            setVisible(false);
            new Managerinfo();
        }else if (ae.getSource() == Customers) {
            setVisible(false);
            new CustomerInfo();
        }else if (ae.getSource() == logout ) {
            setVisible(false);
            new Logout();
        }
    }

    public static void main(String[] args) {
        new Reception();
    }
}