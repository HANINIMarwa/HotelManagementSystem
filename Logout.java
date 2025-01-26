package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Logout extends JFrame implements ActionListener {
    JButton yes, no;

    Logout() {
        // Configuration de la fenêtre
        setLayout(null);
        setBounds(500, 200, 400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Message de confirmation
        JLabel message = new JLabel("Voulez-vous vraiment vous déconnecter ?");
        message.setBounds(50, 30, 300, 30);
        message.setFont(new Font("Arial", Font.BOLD, 14));
        add(message);

        // Bouton "Oui"
        yes = new JButton("Oui");
        yes.setBounds(80, 100, 100, 30);
        yes.setBackground(Color.BLACK);
        yes.setForeground(Color.WHITE);
        yes.addActionListener(this);
        add(yes);

        // Bouton "Non"
        no = new JButton("Non");
        no.setBounds(220, 100, 100, 30);
        no.setBackground(Color.BLACK);
        no.setForeground(Color.WHITE);
        no.addActionListener(this);
        add(no);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == yes) {
            // Fermer la fenêtre actuelle et ouvrir la fenêtre de connexion
            setVisible(false);
            new Login(); // Remplace "Login" par le nom de ta classe de connexion
        } else if (ae.getSource() == no) {
            // Fermer la fenêtre de déconnexion et revenir à la fenêtre précédente
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Logout();
    }
}
