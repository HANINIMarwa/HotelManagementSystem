
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public  class HotelManagementSystem extends JFrame implements ActionListener {
    
     HotelManagementSystem(){
         //setSize(1366,565); 
         //setLocation(100,100);
         setBounds(100,100,1366,565);
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/icon2.jpg"));
         JLabel image = new JLabel(i1);
         image.setBounds(0,0,1366,565); // locationx , locationy , length 
         add(image);
         
         
         JLabel text = new JLabel("HOTEL NOVOTEL ");
         text.setBounds(330,430,1000,90);
         text.setForeground(Color.BLACK);
         text.setFont(new Font("serif",Font.PLAIN,50));
         image.add(text);
         
         
         JButton next = new JButton ("Next");
         next.setBounds(1150,450,150,50);
         next.setBackground(Color.WHITE);
         next.setForeground(Color.BLACK);
         next.addActionListener(this);
         next.setFont(new Font("serif",Font.PLAIN,24));
         image.add(next);
         setVisible(true);
         
         while(true){
             text.setVisible(false);
             try{
                 Thread.sleep(500);
             }catch(Exception e){
                 e.printStackTrace();
             }
             text.setVisible(true);
             try{
                 Thread.sleep(500);
             }catch(Exception e){
                 e.printStackTrace();
             }
         }
     }
    public void actionPerformed(ActionEvent ae ){
         setVisible(false);
         new Login();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new HotelManagementSystem();
    }
    
}
