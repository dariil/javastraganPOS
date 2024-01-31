package posfinal;
import javax.swing.*;
import java.awt.*;
import java.sql.Timestamp;
import java.util.Date;

public class receipt {
    JFrame receipt = new JFrame();
    JPanel receiptPanel = new JPanel();
    JTextArea head = new JTextArea();
    JTextArea footer = new JTextArea();
    JTextArea boldhead = new JTextArea();
    JTextArea boldamt = new JTextArea();
    JScrollPane scroll = new JScrollPane(receiptPanel);
    FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
    Font boldhd = new Font("Tahoma", Font.CENTER_BASELINE, 18);
    Font boldam = new Font("SansSerif", Font.BOLD, 15);
    Font plain = new Font("TimesRoman", Font.PLAIN, 13);

    public void receiptHeadFN(){
        ImageIcon straganLogo = new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\Stragan_logo2.png");
        receipt.setIconImage(straganLogo.getImage());
        receipt.setTitle("Stragan | Receipt");
        Date date = new Date();
        long time = date.getTime();
        Timestamp ts = new Timestamp(time);
        receipt.setSize(400, 700);
        receipt.getContentPane().setBackground(Color.WHITE);
        receipt.setLocation(150, 10);
        receipt.setVisible(true);
        receipt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        boldhead.setFont(boldhd);
        head.setFont(plain);
        boldhead.setText("\n     STRAGAN GROCERY STORE");
        head.setText("\t              Stragan Corp.\n");
        head.setText(head.getText() + "\t13 Main Street, E Service Road\n");
        head.setText(head.getText() + "\t        Muntinlupa City, 1781\n");
        head.setText(head.getText() + "\t         TEL# 7236-647-6183\n\n");
        head.setText(head.getText() + "   Time of purchase:    " + ts);
        head.setText(head.getText() + "\n                            SALES TRANSACTION");
        head.setText(head.getText() + "\n    *****************************************************************");
        head.setText(head.getText() + "\n         Item\t\tQty\tPrice\n");
        head.setText(head.getText() + "    *****************************************************************");
        head.setEditable(false);
        boldhead.setEditable(false);
        receiptPanel.add(boldhead);
        receiptPanel.add(head);
        receipt.add(receiptPanel);
    }
    
    public void receiptFooterFN(String discount, String tax, String total, String payment, String balance){
        footer.setFont(plain);
        boldamt.setFont(boldam);
        footer.setEditable(false);
        boldamt.setEditable(false);
        boldamt.setText("Amount Due:                       \t" + "  " + total);
        footer.setText("    *****************************************************************");
        footer.setText(footer.getText() + "\n   Discount:");
        footer.setText(footer.getText() + "\t\t20%    -\t" + discount);
        footer.setText(footer.getText() + "\n   Tax:\t\t3%    -\t" + tax);
        footer.setText(footer.getText() + "\n\n   Payment:\t\t\t" + payment);
        footer.setText(footer.getText() + "\n   Change:\t\t\t" + balance);
        footer.setText(footer.getText() + "\n    *****************************************************************");
        footer.setText(footer.getText() + "\n              THANK YOU FOR SHOPPING WITH US.\n");
        footer.setText(footer.getText() + "\t             COME AGAIN");
        receiptPanel.add(boldamt);
        receiptPanel.add(footer);
    }
}