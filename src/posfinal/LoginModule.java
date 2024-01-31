package posfinal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import loginmodule.posgui;
//import loginmodule.vegetables;

// Create new User class file (User.java)
class User{
    private String un = "admin"; // StraganCorp
    private String pw = "admin"; // adminCashier
    
    public String getUsername(){
        return un;
    }
    
    public String getPassword(){    
        return pw;
    }
}

public class LoginModule extends JFrame implements ActionListener{
    // Components
    JPanel panel = new JPanel();
    ImageIcon straganLogoLog = new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\Stragan_logo1.png");
    ImageIcon straganLogo = new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\Stragan_logo2.png");
    JLabel logoHolder = new JLabel(straganLogoLog);
    JLabel username = new JLabel("Username");
    JLabel password = new JLabel("Password");
    JTextField usernameField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("L O G I N");
    MainPosModule pos;
    public LoginModule(){
        // JOptionPane message prompt
        UIManager UI = new UIManager();
        UI.put("OptionPane.background",Color.WHITE);
        UI.put("Panel.background",Color.WHITE);
        
        // Frame
        setIconImage(straganLogo.getImage());
        setTitle("Stragan | Cashier");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450,450);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        panel.setLayout(null);
        panel.setBackground(Color.white);
        
        // Stragan logo
        logoHolder.setBounds(146, 25, 155, 155);
        panel.add(logoHolder);
        
        // Username
        username.setBounds(62, 208, 100, 10);
        panel.add(username);
        usernameField.setBounds(137, 200, 230, 30);
        usernameField.setHorizontalAlignment(JTextField.CENTER);
        panel.add(usernameField);
        
        // Password
        password.setBounds(62, 253, 100, 10);
        panel.add(password);
        passwordField.setBounds(137, 245, 230, 30);
        passwordField.setHorizontalAlignment(JTextField.CENTER);
        panel.add(passwordField);
        
        // Button
        loginButton.setBounds(100, 305, 250, 40);
        loginButton.setBorderPainted(false);
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(new Color(247, 148, 30));
        loginButton.addActionListener(this);
        panel.add(loginButton);
       
        add(panel);
    }
    
    // Main Method
    public static void main(String[] args) {
        new LoginModule();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // User object
        User userInfo = new User();
        
        // Retrieve user input
        String Username = usernameField.getText();
	String Password = passwordField.getText();
        
        // Textfield conditions
        if(Username.equals(userInfo.getUsername()) && Password.equals(userInfo.getPassword())){
            JOptionPane.showMessageDialog(this, "Sucessfully logged in to cashier.");
            pos = new MainPosModule();
            dispose();
            // Insert redirect to next frame code here
        } else if (Username.isEmpty() && !Password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Username field is blank. Please enter your username.");
            passwordField.setText("");
        } else if (!Username.isEmpty() && Password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Password field is blank. Please enter your password.");
        } else if (Username.isEmpty() && Password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Input fields are blank. Please enter your credentials.");
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect username and password combination.");
            usernameField.setText("");
            passwordField.setText("");
        }
    } 
}