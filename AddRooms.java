
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;
import java.awt.event.*;
public class AddRooms extends JFrame implements ActionListener{
    JButton add ,cancel ;
    JTextField tfroom ,tfPrice;
    JComboBox typecombo , availablecombo , Cleancombo;
    AddRooms(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Add Rooms");
        heading.setFont(new Font("Tahoma" , Font.BOLD,18));
        heading.setBounds(150, 20, 200, 20);
        add(heading);
        
        
        JLabel lblroom = new JLabel("Room Number:");
        lblroom.setFont(new Font("Tahoma" , Font.PLAIN,16));
        lblroom.setBounds(60, 80, 120, 30);
        add(lblroom);  
        
        tfroom = new JTextField();
        tfroom.setBounds(200,80,150,30);
        add(tfroom);
        
        JLabel lblavailable = new JLabel("Available:");
        lblavailable.setFont(new Font("Tahoma" , Font.PLAIN,16));
        lblavailable.setBounds(60, 130, 120, 30);
        add(lblavailable);
        
        String availableOptions[] = {"Available", "Occupied"};
        availablecombo = new JComboBox(availableOptions);
        availablecombo.setBounds(200,130,150,30);
        availablecombo.setBackground(Color.WHITE);
        add(availablecombo);
             
        
        JLabel lblclean = new JLabel("Cleaning Status:");
        lblclean.setFont(new Font("Tahoma" , Font.PLAIN,16));
        lblclean.setBounds(60, 180, 120, 30);
        add(lblclean);
        
        String CleanOptions[] = {"Cleaned", "Dirty"};
        Cleancombo = new JComboBox(CleanOptions);
        Cleancombo.setBounds(200,180,150,30);
        Cleancombo.setBackground(Color.WHITE);
        add(Cleancombo);
        
        
        JLabel lblPrice = new JLabel("PRICE $:");
        lblPrice.setFont(new Font("Tahoma" , Font.PLAIN,16));
        lblPrice.setBounds(60, 230, 120, 30);
        add(lblPrice);  
        
        tfPrice = new JTextField();
        tfPrice.setBounds(200,230,150,30);
        add(tfPrice);
        
        
        
        JLabel lbltype = new JLabel("Bed type:");
        lbltype.setFont(new Font("Tahoma" , Font.PLAIN,16));
        lbltype.setBounds(60, 280, 120, 30);
        add(lbltype);
        
        String TypeOptions[] = {"Single Bed", "Double Bed"};
        typecombo = new JComboBox(TypeOptions);
        typecombo.setBounds(200,280,150,30);
        typecombo.setBackground(Color.WHITE);
        add(typecombo);
        
        
        add = new JButton("Add Room");
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.setBounds(60,350,130,30);
        add.addActionListener(this);
        add(add);
        
        
        cancel = new JButton("Cancel");
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(Color.BLACK);
        cancel.setBounds(220,350,130,30);
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/bed.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(400,30,500,300);
        add(image);
        setBounds(330,200,940,470);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == add){
            String roomnumber = tfroom.getText();
            String availability = (String)availablecombo.getSelectedItem();
            String status =(String)Cleancombo.getSelectedItem();
            String price = tfPrice.getText();
            String type =(String)typecombo.getSelectedItem();
            try{
                 Conn conn = new Conn();
                 String str = "insert into room values('"+roomnumber+"','"+availability+"','"+status+"','"+price+"','"+type+"')";
                 conn.s.executeUpdate(str);
                 JOptionPane.showMessageDialog(null , "New Room added successfully");
                 setVisible(false);
            }catch (Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new AddRooms();
    }
    }

