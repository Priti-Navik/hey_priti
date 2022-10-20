
//Swing
import javax.swing.*;
import java.awt.event.*;

public class AEvent5c {
    public static void main(String[] args) {
        JFrame f = new JFrame("Bank Registration Form");
        JTextField tf1 = new JTextField();
        JTextField tf2 = new JTextField();
        JTextField tf4 = new JTextField();
        JTextField tf5 = new JTextField();
        JTextField tf6 = new JTextField();
        JTextField tf7 = new JTextField();// tf2.setEchoChar('*');
        tf1.setBounds(100, 50, 150, 20);
        tf2.setBounds(100, 100, 150, 20);
        tf6.setBounds(100, 150, 150, 20);
        tf4.setBounds(100, 200, 150, 20);
        tf5.setBounds(100, 250, 150, 20);
        tf7.setBounds(100, 300, 150, 20);
        JLabel la1 = new JLabel("Name:");
        la1.setBounds(20, 50, 150, 20);
        JLabel la2 = new JLabel("Age:");
        la2.setBounds(20, 100, 150, 20);
        JLabel la6 = new JLabel("Address:");
        la6.setBounds(20, 150, 150, 20);
        JLabel la4 = new JLabel("Pincode:");
        la4.setBounds(20, 200, 150, 20);
        JLabel la5 = new JLabel("Gender:");
        la5.setBounds(20, 250, 150, 20);
        JLabel la7 = new JLabel("ID Proof:");
        la7.setBounds(20, 300, 150, 20);
        ////////////////////////// radio//////////////////////////////
        JRadioButton r1 = new JRadioButton("Male");
        r1.setBounds(100, 250, 60, 30);
        JRadioButton r2 = new JRadioButton("Female");
        r2.setBounds(160, 250, 150, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        f.add(r1);
        f.add(r2);
        ///////////////////// Checkbox///////////////////
        JCheckBox checkBox1 = new JCheckBox("Aadhar Card");
        checkBox1.setBounds(100, 300, 100, 30);
        JCheckBox checkBox2 = new JCheckBox("PAN Card");
        checkBox2.setBounds(200, 300, 100, 30);
        JCheckBox checkBox3 = new JCheckBox("Passport");
        checkBox3.setBounds(300, 300, 100, 30);
        f.add(checkBox1);
        f.add(checkBox2);
        f.add(checkBox3);
        JLabel la3 = new JLabel();
        JButton b1 = new JButton("REGISTER");
        b1.setBounds(20, 350, 100, 30);
        JButton b2 = new JButton("RESET");
        b2.setBounds(150, 350, 100, 30);
        la3.setBounds(20, 400, 150, 20);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (tf1.getText().equals("ASHISH")) {
                    la3.setText("Registration Sucesfull! ");
                } else
                    la3.setText("Login Failed! - Invalid user");
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf1.setText("");
                tf2.setText("");
                tf4.setText("");
                tf5.setText("");
                tf6.setText("");
                tf7.setText("");
                // r1.RadioButton("");
                r1.setSelected(false);
                r2.setSelected(false);
                checkBox1.setSelected(false);
                checkBox2.setSelected(false);
                checkBox3.setSelected(false);
                la3.setText("Input Cleared!");
            }
        });
        f.add(b1);
        f.add(tf1);
        f.add(tf2);
        f.add(tf4);
        // f.add(tf5);
        f.add(tf6);
        // f.add(tf7);
        f.add(la1);
        f.add(la2);
        f.add(la4);
        f.add(la5);
        f.add(la6);
        f.add(la7);
        f.add(b2);
        f.add(la3);
        f.setSize(420, 500);
        f.setLayout(null);
        f.setVisible(true);

    }
}