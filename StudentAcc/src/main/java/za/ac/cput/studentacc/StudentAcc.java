/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package za.ac.cput.studentacc;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Sibusiso
 */
public class StudentAcc extends JFrame{
  private JButton regUser;
    private JButton newUser;
    private JButton btnEmp;

    public JFrame welcomeWindow() {

        JFrame welcome = new JFrame("Student Life");

        JLabel lblNewUserRegister = new JLabel("Student Life Registration");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.ITALIC, 30));
        lblNewUserRegister.setBounds(50, 100, 500, 50);

        regUser = new JButton("Student");
        newUser = new JButton("NEW Student");
        btnEmp = new JButton("Landlord");
        welcome.setResizable(false);
        btnEmp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                StudentLogin vr = new StudentLogin();
                welcome.setVisible(false);
                vr.starter();
            }
        });
        newUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                welcome.setVisible(false);
                LandlordRegistration rg = new LandlordRegistration();
                welcome.setVisible(false);
                rg.setVisible(true);
            }
        });

        regUser.addActionListener(new ActionListener() {
            /**
             * Added code to call the login form
             *
             * @author Sibusiso
             */

            @Override
            public void actionPerformed(ActionEvent ae) {
                welcome.setVisible(false);
                LandlordLogin rg = new LandlordLogin();
                welcome.setVisible(false);
                rg.starter();
            }
        });

        welcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        welcome.setSize(500, 600);
        welcome.setLocationRelativeTo(null);
        welcome.setVisible(true);
        welcome.getContentPane().setLayout(null);

        regUser.setFont(new Font("roman", Font.BOLD, 14));
        regUser.setBounds(130, 300, 210, 37);
        
        newUser.setFont(new Font("roman", Font.BOLD, 14));
        newUser.setBounds(130, 350, 210, 37);

        btnEmp.setFont(new Font("roman", Font.BOLD, 14));
        btnEmp.setBounds(130, 400, 210, 37);

        welcome.add(lblNewUserRegister);
        welcome.add(regUser);
        welcome.add(newUser);
        welcome.add(btnEmp);

        return welcome;
    }

    public void startProgram() {
        

        new StudentAcc().welcomeWindow();

    }

    public static void main(String[] args) {
        
        StudentAcc st = new StudentAcc();
        st.startProgram();
    }
}

   
