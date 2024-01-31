package posfinal;
import java.awt.*;
import javax.swing.*;
public class prompts extends JFrame{
    
    //VOID
    JFrame voidFrame = new JFrame();
    JPanel voidPanel = new JPanel();
    ImageIcon straganLogo = new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\Stragan_logo2.png");
    Font font = new Font("Tahoma", Font.BOLD, 14);
    JLabel voidPrompt = new JLabel();
    JButton voidYes = new JButton("Yes");
    JButton voidNo = new JButton("No");
    
    
    //LOGOUT
    JFrame logOutFrame = new JFrame();
    JPanel logOutPanel = new JPanel();
    JLabel logOutPrompt = new JLabel("Are you sure you want to logout system?");
    JButton logOutYes = new JButton("Yes");
    JButton logOutNo = new JButton("No");
    
    //DISCOUNT
    JFrame discountFrame = new JFrame();
    JPanel discountPanel = new JPanel();
    JLabel discountPrompt = new JLabel("Are you sure you want to apply discount?");
    JButton discountYes = new JButton("Yes");
    JButton discountNo = new JButton("No");
    
    //DELETE
    JFrame deleteFrame = new JFrame();
    JPanel deletePanel = new JPanel();
    JLabel deletePrompt = new JLabel("Are you sure you want to delete item?");
    JButton deleteYes = new JButton("Yes");
    JButton deleteNo = new JButton("No");
    
    //PROCEED
    JFrame proceedFrame = new JFrame();
    JPanel proceedPanel = new JPanel();
    JLabel proceedPrompt = new JLabel("Enter payment amount:");
    JTextField proceedPayment = new JTextField(30);
    JButton enter = new JButton("Enter");
    
    
    //INSUFFICIENT
    JFrame insufficentFrame = new JFrame();
    JPanel insufficentPanel = new JPanel();
    JLabel insufficentPrompt = new JLabel("Insufficient payment amount");
    JButton goBack = new JButton("Go Back");
    
    public void voidFn(){
        voidFrame.setIconImage(straganLogo.getImage());
        voidFrame.setTitle("Void");
        voidFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        voidFrame.setSize(400,190);
        voidFrame.setVisible(true);
        voidFrame.setLocationRelativeTo(null);
        voidFrame.setResizable(false);
        
        voidPanel.setLayout(null);
        voidPanel.setBackground(Color.white);
        
        voidPrompt.setBounds(75,0,250,100);
        voidPrompt.setFont(font);
        voidPanel.add(voidPrompt);
        
        voidYes.setBounds(60,80,120,35);
        voidYes.setBackground(new Color(46, 171, 4));
        voidYes.setForeground(Color.WHITE);
        voidYes.setFont(font);
        voidPanel.add(voidYes);
        
        voidNo.setBounds(210,80,120,35);
        voidNo.setBackground(new Color(239, 69, 39));
        voidNo.setForeground(Color.WHITE);
        voidNo.setFont(font);
        voidPanel.add(voidNo);
        
        voidFrame.add(voidPanel);
        
        voidPrompt.setText("Are you sure you want to void list?");
    }
    
    public void logoutFN(){
        logOutFrame.setIconImage(straganLogo.getImage());
        logOutFrame.setTitle("Logout");
        logOutFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        logOutFrame.setSize(400,190);
        logOutFrame.setVisible(true);
        logOutFrame.setLocationRelativeTo(null);
        logOutFrame.setResizable(false);
        
        logOutPanel.setLayout(null);
        logOutPanel.setBackground(Color.white);
        
        // Prompt
        logOutPrompt.setBounds(52,0,290,100);
        logOutPrompt.setFont(font);
        logOutPanel.add(logOutPrompt);
        
        logOutYes.setBounds(55,80,120,35);
        logOutYes.setBackground(new Color(46, 171, 4));
        logOutYes.setForeground(Color.WHITE);
        logOutYes.setFont(font);
        logOutPanel.add(logOutYes);
        
        logOutNo.setBounds(210,80,120,35);
        logOutNo.setBackground(new Color(239, 69, 39));
        logOutNo.setForeground(Color.WHITE);
        logOutNo.setFont(font);
        logOutPanel.add(logOutNo);
        
        logOutFrame.add(logOutPanel);
    }
    
    public void discountFN(){
        discountFrame.setIconImage(straganLogo.getImage());
        discountFrame.setTitle("Discount");
        discountFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        discountFrame.setSize(400,190);
        discountFrame.setVisible(true);
        discountFrame.setLocationRelativeTo(null);
        discountFrame.setResizable(false);
        
        discountPanel.setLayout(null);
        discountPanel.setBackground(Color.white);
        
        // Prompt
        discountPrompt.setBounds(50,0,290,100);
        discountPrompt.setFont(font);
        discountPanel.add(discountPrompt);
        
        discountYes.setBounds(55,80,120,35);
        discountYes.setBackground(new Color(46, 171, 4));
        discountYes.setForeground(Color.WHITE);
        discountYes.setFont(font);
        discountPanel.add(discountYes);
        
        discountNo.setBounds(210,80,120,35);
        discountNo.setBackground(new Color(239, 69, 39));
        discountNo.setForeground(Color.WHITE);
        discountNo.setFont(font);
        discountPanel.add(discountNo);
        
        discountFrame.add(discountPanel);
    }
    
    public void deleteFN(){
        deleteFrame.setIconImage(straganLogo.getImage());
        deleteFrame.setTitle("Delete");
        deleteFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        deleteFrame.setSize(400,190);
        deleteFrame.setVisible(true);
        deleteFrame.setLocationRelativeTo(null);
        deleteFrame.setResizable(false);
        
        deletePanel.setLayout(null);
        deletePanel.setBackground(Color.white);
        
        // Prompt
        deletePrompt.setBounds(63,0,270,100);
        deletePrompt.setFont(font);
        deletePanel.add(deletePrompt);
        
        deleteYes.setBounds(60,80,120,35);
        deleteYes.setBackground(new Color(46, 171, 4));
        deleteYes.setForeground(Color.WHITE);
        deleteYes.setFont(font);
        deletePanel.add(deleteYes);
        
        deleteNo.setBounds(210,80,120,35);
        deleteNo.setBackground(new Color(239, 69, 39));
        deleteNo.setForeground(Color.WHITE);
        deleteNo.setFont(font);
        deletePanel.add(deleteNo);
        
        deleteFrame.add(deletePanel);
    }
    
    public void proceedFN(){
        proceedFrame.setIconImage(straganLogo.getImage());
        proceedFrame.setTitle("Payment");
        proceedFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        proceedFrame.setSize(400,240);
        proceedFrame.setVisible(true);
        proceedFrame.setLocationRelativeTo(null);
        proceedFrame.setResizable(false);
        
        proceedPanel.setLayout(null);
        proceedPanel.setBackground(Color.white);
        
        // Prompt
        proceedPrompt.setBounds(110,0,200,100);
        proceedPrompt.setFont(font);
        proceedPanel.add(proceedPrompt);
        
        proceedPayment.setBounds(53, 80, 280, 40);
        proceedPayment.setHorizontalAlignment(JTextField.CENTER);
        proceedPanel.add(proceedPayment);
        
        enter.setBounds(135,140,120,35);
        enter.setBackground(new Color(46, 171, 4));
        enter.setForeground(Color.WHITE);
        enter.setFont(font);
        proceedPanel.add(enter);
        
        proceedFrame.add(proceedPanel);
    }
    
    public void insufficientFN(){
        insufficentFrame.setIconImage(straganLogo.getImage());
        insufficentFrame.setSize(400,190);
        insufficentFrame.setTitle("Insufficient Amount");
        insufficentFrame.setLayout(null);
        insufficentFrame.setResizable(false);
        
        insufficentPrompt.setBounds(95,0,270,100);
        insufficentPrompt.setFont(font);
        insufficentFrame.add(insufficentPrompt);
        
        goBack.setBounds(135,80,120,35);
        goBack.setBackground(new Color(46, 171, 4));
        goBack.setForeground(Color.WHITE);
        goBack.setFont(font);
        insufficentFrame.add(goBack);
        
        insufficentFrame.setLocationRelativeTo(null);
        insufficentFrame.setVisible(true);
    }
}