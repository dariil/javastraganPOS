package posfinal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableCellRenderer;
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;

public class MainPosModule extends JFrame implements ActionListener{
    prompts prompt = new prompts();
    receipt summary = new receipt();
    foodItems fresh = new freshGoodsItem();
    foodItems frozen = new frozenGoodsItem();
    DecimalFormat df = new DecimalFormat("0.00");
    // Images
    ImageIcon straganLogo = new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\Stragan_logo2.png");
    private final FlowLayout flow = new FlowLayout();
    private final GridLayout keyPadLayout = new GridLayout(4, 4);
    private final GridLayout itmList = new GridLayout(6, 2);
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    
    private final Font pricingFont = new Font("Tahoma", Font.BOLD, 15);
    private final Font keyPadFont = new Font("Tahoma", Font.BOLD, 30);
    private final Font dotFont = new Font("Tahoma", Font.BOLD, 40);
    private final Font keyPadFont1 = new Font("Tahoma", Font.BOLD, 13);
    private final Font tableHeaderFont = new Font("Tahoma", Font.BOLD, 17);
    private final Font tableContentFont = new Font("Tahoma", Font.BOLD, 15);
    private final Font summaryFont = new Font("Tahoma", Font.BOLD, 15);
    
    private JPanel leftDiv = new JPanel();
    private JPanel rightDiv = new JPanel();
    private JPanel listPanel = new JPanel();
    private JPanel keyPadPanel = new JPanel();
    private JPanel finisherPanel = new JPanel();
    private JPanel priceComputePanel = new JPanel();
    private JPanel goodsBtnPnl = new JPanel();
    private JPanel freshGoodsPanel = new JPanel();
    private JPanel frozenGoodsPanel = new JPanel();
    private JPanel fillerPanel = new JPanel();
    
    private JTable priceList = new JTable();
    
    private JButton num1 = new JButton("1");
    private JButton num2 = new JButton("2");
    private JButton num3 = new JButton("3");
    private JButton num4 = new JButton("4");
    private JButton num5 = new JButton("5");
    private JButton num6 = new JButton("6");
    private JButton num7 = new JButton("7");
    private JButton num8 = new JButton("8");
    private JButton num9 = new JButton("9");
    private JButton num0 = new JButton("0");
    private JButton num00 = new JButton("00");
    private JButton dotButton = new JButton(".");
    private JButton voidButton = new JButton("Void");
    private JButton deleteButton = new JButton("Delete");
    private JButton computeButton = new JButton("Compute");
    private JButton discountButton = new JButton("Apply Discount");
    private JButton proceedButton = new JButton("Proceed to Checkout");
    private JButton logoutButton = new JButton("Logout");
    
    private JButton freshGoodsButton = new JButton("Fresh Goods");
    private JButton frozenGoodsButton = new JButton("Frozen Goods");
    
    private JButton applesButton = new JButton(new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\freshGoods\\apples.png"));
    private JButton avocadoButton = new JButton(new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\freshGoods\\avocado.png"));
    private JButton cauliFlowerButton = new JButton(new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\freshGoods\\cauliFlower.png"));
    private JButton beetrootButton = new JButton(new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\freshGoods\\beetroot.png"));
    private JButton celeryButton = new JButton(new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\freshGoods\\celery.png"));
    private JButton eggPlantButton = new JButton(new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\freshGoods\\eggplant.png"));
    private JButton lettuceButton = new JButton(new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\freshGoods\\lettuce.png"));
    private JButton potatoesButton = new JButton(new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\freshGoods\\potatoes.png"));
    private JButton redChiliButton = new JButton(new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\freshGoods\\redChili.png"));
    private JButton tomatoesButton = new JButton(new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\freshGoods\\tomatoes.png"));
    private JButton greenBeansBtn = new JButton(new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\freshGoods\\greenBeans.png"));
    private JButton gingerBtn = new JButton(new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\freshGoods\\ginger.png"));
    
    private JButton beefCattleBtn = new JButton(new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\frozenGoods\\beefCattle.png"));
    private JButton chickenWingsBtn = new JButton(new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\frozenGoods\\chickenWings.png"));
    private JButton crabMeatBtn = new JButton(new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\frozenGoods\\crabMeat.png"));
    private JButton fishBtn = new JButton(new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\frozenGoods\\fish.png"));
    private JButton lambMeatBtn = new JButton(new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\frozenGoods\\lambMeat.png"));
    private JButton porkMeatBtn = new JButton(new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\frozenGoods\\porkMeat.png"));
    private JButton prawnBtn = new JButton(new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\frozenGoods\\prawn.png"));
    private JButton sausageBtn = new JButton(new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\frozenGoods\\sausage.png"));
    private JButton squidBtn = new JButton(new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\frozenGoods\\squid.png"));
    private JButton wholeChickenBtn = new JButton(new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\frozenGoods\\wholeChicken.png"));
    private JButton chickenDrumBtn = new JButton(new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\frozenGoods\\chickenDrum.png"));
    private JButton rawSalmonBtn = new JButton(new ImageIcon("C:\\Users\\Bryce Adam\\Documents\\NetBeansProjects\\Stragan Final (POS)\\posFinal\\src\\Images\\frozenGoods\\rawSalmon.png"));
    
    private JLabel subTotallbl = new JLabel("Subtotal: ");
    private JLabel discountlbl = new JLabel("Discount: ");
    private JLabel taxlbl = new JLabel("Tax: ");
    private JLabel paymentlbl = new JLabel("Payment: ");
    private JLabel totallbl = new JLabel("Total: ");
    private JLabel subTotalCompute = new JLabel("P0.00");
    private JLabel discountCompute = new JLabel("P0.00");
    private JLabel taxCompute = new JLabel("P0.00");
    private JLabel paymentCompute = new JLabel("P0.00");
    private JLabel totalCompute = new JLabel("P0.00");
    private JLabel fillerLabelFinisherPanel = new JLabel("      ");
    private JLabel fillerLabelSummaryPanel = new JLabel("      ");
    private JLabel fillerLabelSummaryPanel2 = new JLabel("      ");
    
    private JScrollPane freshGoodsScroll;
    private JScrollPane frozenGoodsScroll;
    
    public MainPosModule(){
        super("Stragan | Cashier");
        fresh.addGoods();
        frozen.addGoods();
        setIconImage(straganLogo.getImage());
        this.setSize(screenSize.width, screenSize.height);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.WHITE);
        setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        setResizable(true);
        setLayout(flow);
        
        leftDivElements();
        rightDivElements();
        addActionListeners();
        this.setVisible(true);
    }
    
    public void leftDivElements(){
        flow.setAlignment(FlowLayout.LEFT);
        listPanel.setPreferredSize(new Dimension(1000, 300));
        listPanel.setBackground(Color.WHITE);
        priceList.setModel(new DefaultTableModel(
            new Object [][] {
                
            }, new String [] {"ITEM DESCRIPTION", "PRICE", "QUANTITY", "TOTAL"}
        ));
        
        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(JLabel.CENTER);
        priceList.getColumnModel().getColumn(0).setCellRenderer(center);
        priceList.getColumnModel().getColumn(1).setCellRenderer(center);
        priceList.getColumnModel().getColumn(2).setCellRenderer(center);
        priceList.getColumnModel().getColumn(3).setCellRenderer(center);
        
        priceList.setRowHeight(25);
        priceList.getTableHeader().setFont(tableHeaderFont);
        priceList.setFont(tableContentFont);
        priceList.setBackground(Color.WHITE);
        //priceList.setPreferredSize(new Dimension(880,270));
        JScrollPane scrollPane = new JScrollPane(priceList);
        scrollPane.setPreferredSize(new Dimension(1000, 270));
        getContentPane().add(scrollPane);
        listPanel.add(scrollPane);
        
        keyPadPanel.setPreferredSize(new Dimension(400, 400));
        keyPadPanel.setBackground(Color.WHITE);
        keyPadPanel.setLayout(keyPadLayout);
        keyPadLayout.setHgap(10);
        keyPadLayout.setVgap(10);
        keyPadPanel.add(num1);
        keyPadPanel.add(num2);
        keyPadPanel.add(num3);
        keyPadPanel.add(voidButton);
        keyPadPanel.add(num4);
        keyPadPanel.add(num5);
        keyPadPanel.add(num6);
        keyPadPanel.add(deleteButton);
        keyPadPanel.add(num7);
        keyPadPanel.add(num8);
        keyPadPanel.add(num9);
        keyPadPanel.add(computeButton);
        keyPadPanel.add(num00);
        keyPadPanel.add(num0);
        keyPadPanel.add(dotButton);
        keyPadPanel.add(logoutButton);
        
        num1.setFont(keyPadFont);
        num2.setFont(keyPadFont);
        num3.setFont(keyPadFont);
        num4.setFont(keyPadFont);
        num5.setFont(keyPadFont);
        num6.setFont(keyPadFont);
        num7.setFont(keyPadFont);
        num8.setFont(keyPadFont);
        num9.setFont(keyPadFont);
        num0.setFont(keyPadFont);
        num00.setFont(keyPadFont);
        dotButton.setFont(dotFont);
        voidButton.setFont(keyPadFont1);
        deleteButton.setFont(keyPadFont1);
        computeButton.setFont(keyPadFont1);

        num1.setBackground(new Color(240,240,240,240));
        num2.setBackground(new Color(240,240,240,240));
        num3.setBackground(new Color(240,240,240,240));
        num4.setBackground(new Color(240,240,240,240));
        num5.setBackground(new Color(240,240,240,240));
        num6.setBackground(new Color(240,240,240,240));
        num7.setBackground(new Color(240,240,240,240));
        num8.setBackground(new Color(240,240,240,240));
        num9.setBackground(new Color(240,240,240,240));
        num0.setBackground(new Color(240,240,240,240));
        num00.setBackground(new Color(240,240,240,240));
        dotButton.setBackground(new Color(240,240,240,240));
        voidButton.setBackground(new Color(239, 69, 39));
        voidButton.setForeground(Color.WHITE);
        deleteButton.setBackground(new Color(247, 148, 30));
        deleteButton.setForeground(Color.WHITE);
        computeButton.setBackground(new Color(46, 171, 4));
        computeButton.setForeground(Color.WHITE);
        logoutButton.setBackground(new Color(239, 69, 39));
        logoutButton.setForeground(Color.WHITE);
       
        subTotallbl.setFont(pricingFont);
        subTotalCompute.setFont(pricingFont);
        taxlbl.setFont(pricingFont);
        taxCompute.setFont(pricingFont);
        discountlbl.setFont(pricingFont);
        discountCompute.setFont(pricingFont);
        paymentlbl.setFont(pricingFont);
        paymentCompute.setFont(pricingFont);
        totallbl.setFont(keyPadFont);
        totalCompute.setFont(keyPadFont);
        
        subTotallbl.setPreferredSize(new Dimension(230, 20));
        taxlbl.setPreferredSize(new Dimension(230, 30));
        discountlbl.setPreferredSize(new Dimension(230, 30));
        paymentlbl.setPreferredSize(new Dimension(230, 30));
        totallbl.setPreferredSize(new Dimension(230, 30));
        taxlbl.setPreferredSize(new Dimension(230, 30));
        subTotalCompute.setPreferredSize(new Dimension(230, 48));
        taxCompute.setPreferredSize(new Dimension(230, 48));                 
        discountCompute.setPreferredSize(new Dimension(230, 48));
        paymentCompute.setPreferredSize(new Dimension(230, 48));
        totalCompute.setPreferredSize(new Dimension(230, 48));
        fillerLabelSummaryPanel.setPreferredSize(new Dimension(500,25));
        fillerLabelSummaryPanel2.setPreferredSize(new Dimension(200,8));
        
        priceComputePanel.setPreferredSize(new Dimension(550, 400));
        priceComputePanel.setBackground(new Color(240,240,240,240));
        priceComputePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        priceComputePanel.add(fillerLabelSummaryPanel);
        priceComputePanel.add(subTotallbl);
        priceComputePanel.add(subTotalCompute);
        priceComputePanel.add(discountlbl);
        priceComputePanel.add(discountCompute);
        priceComputePanel.add(taxlbl);
        priceComputePanel.add(taxCompute);
        priceComputePanel.add(paymentlbl);
        priceComputePanel.add(paymentCompute);
        priceComputePanel.add(totallbl);
        priceComputePanel.add(totalCompute);
        priceComputePanel.add(fillerLabelSummaryPanel2);
        priceComputePanel.add(finisherPanel);
        
        finisherPanel.setPreferredSize(new Dimension(500, 68));
        finisherPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        proceedButton.setPreferredSize(new Dimension(230, 55));
        proceedButton.setBackground(new Color(46, 171, 4));
        proceedButton.setForeground(Color.WHITE);
        proceedButton.setFont(summaryFont);
        discountButton.setPreferredSize(new Dimension(230, 55));
        discountButton.setBackground(new Color(247, 148, 30));
        discountButton.setForeground(Color.WHITE);
        discountButton.setFont(summaryFont);
        
        finisherPanel.setBackground(new Color(240,240,240,240));
        finisherPanel.add(proceedButton);
        finisherPanel.add(fillerLabelFinisherPanel);
        finisherPanel.add(discountButton);
        
        fillerPanel.setPreferredSize(new Dimension(25,400));
        fillerPanel.setBackground(Color.WHITE);
        
        leftDiv.setLayout(flow);
        leftDiv.setPreferredSize(new Dimension(1030, 725));
        leftDiv.setBackground(Color.WHITE);
        leftDiv.add(listPanel);
        leftDiv.add(priceComputePanel);
        leftDiv.add(fillerPanel);
        leftDiv.add(keyPadPanel);
        
        add(leftDiv);
    }
    
    public void rightDivElements(){
        goodsBtnPnl.setPreferredSize(new Dimension(300, 90));
        goodsBtnPnl.setBackground(Color.WHITE);
        
        freshGoodsButton.setPreferredSize(new Dimension(140, 70));
        freshGoodsButton.setBackground(new Color(46, 171, 4));
        freshGoodsButton.setForeground(Color.WHITE);
        freshGoodsButton.setFont(pricingFont);
        frozenGoodsButton.setPreferredSize(new Dimension(140, 70));
        frozenGoodsButton.setBackground(new Color(247, 148, 30));
        frozenGoodsButton.setForeground(Color.WHITE);
        frozenGoodsButton.setFont(pricingFont);
        
        goodsBtnPnl.add(freshGoodsButton);
        goodsBtnPnl.add(frozenGoodsButton);
        
        applesButton.setPreferredSize(new Dimension(125, 107));
        applesButton.setBackground(new Color(240,240,240,240));
        avocadoButton.setPreferredSize(new Dimension(125, 107));
        avocadoButton.setBackground(new Color(240,240,240,240));
        cauliFlowerButton.setPreferredSize(new Dimension(125, 107));
        cauliFlowerButton.setBackground(new Color(240,240,240,240));
        beetrootButton.setPreferredSize(new Dimension(125, 107));
        beetrootButton.setBackground(new Color(240,240,240,240));
        celeryButton.setPreferredSize(new Dimension(125, 107));
        celeryButton.setBackground(new Color(240,240,240,240));
        eggPlantButton.setPreferredSize(new Dimension(125, 107));
        eggPlantButton.setBackground(new Color(240,240,240,240));
        lettuceButton.setPreferredSize(new Dimension(125, 107));
        lettuceButton.setBackground(new Color(240,240,240,240));
        potatoesButton.setPreferredSize(new Dimension(125, 107));
        potatoesButton.setBackground(new Color(240,240,240,240));
        redChiliButton.setPreferredSize(new Dimension(125, 107));
        redChiliButton.setBackground(new Color(240,240,240,240));
        tomatoesButton.setPreferredSize(new Dimension(125, 107));
        tomatoesButton.setBackground(new Color(240,240,240,240));
        greenBeansBtn.setPreferredSize(new Dimension(125, 107));
        greenBeansBtn.setBackground(new Color(240,240,240,240));
        gingerBtn.setPreferredSize(new Dimension(125, 107));
        gingerBtn.setBackground(new Color(240,240,240,240));

        freshGoodsPanel.setPreferredSize(new Dimension(267, 780));
        freshGoodsPanel.setBackground(Color.WHITE);
        freshGoodsPanel.add(applesButton);
        freshGoodsPanel.add(avocadoButton);
        freshGoodsPanel.add(cauliFlowerButton);
        freshGoodsPanel.add(beetrootButton);
        freshGoodsPanel.add(celeryButton);
        freshGoodsPanel.add(eggPlantButton);
        freshGoodsPanel.add(lettuceButton);
        freshGoodsPanel.add(potatoesButton);
        freshGoodsPanel.add(redChiliButton);
        freshGoodsPanel.add(tomatoesButton);
        freshGoodsPanel.add(greenBeansBtn);
        freshGoodsPanel.add(gingerBtn);
        freshGoodsScroll = new JScrollPane(freshGoodsPanel);
        freshGoodsScroll.setPreferredSize(new Dimension(285, 700));    
        
        frozenGoodsPanel.setPreferredSize(new Dimension(267, 780));
        frozenGoodsPanel.setBackground(Color.WHITE);
        
        beefCattleBtn.setPreferredSize(new Dimension(125, 107));
        beefCattleBtn.setBackground(new Color(240,240,240,240));
        chickenWingsBtn.setPreferredSize(new Dimension(125, 107));
        chickenWingsBtn.setBackground(new Color(240,240,240,240));
        crabMeatBtn.setPreferredSize(new Dimension(125, 107));
        crabMeatBtn.setBackground(new Color(240,240,240,240));
        fishBtn.setPreferredSize(new Dimension(125, 107));
        fishBtn.setBackground(new Color(240,240,240,240));
        lambMeatBtn.setPreferredSize(new Dimension(125, 107));
        lambMeatBtn.setBackground(new Color(240,240,240,240));
        porkMeatBtn.setPreferredSize(new Dimension(125, 107));
        porkMeatBtn.setBackground(new Color(240,240,240,240));
        prawnBtn.setPreferredSize(new Dimension(125, 107));
        prawnBtn.setBackground(new Color(240,240,240,240));
        sausageBtn.setPreferredSize(new Dimension(125, 107));
        sausageBtn.setBackground(new Color(240,240,240,240));
        squidBtn.setPreferredSize(new Dimension(125, 107));
        squidBtn.setBackground(new Color(240,240,240,240));
        wholeChickenBtn.setPreferredSize(new Dimension(125, 107));
        wholeChickenBtn.setBackground(new Color(240,240,240,240));
        chickenDrumBtn.setPreferredSize(new Dimension(125, 107));
        chickenDrumBtn.setBackground(new Color(240,240,240,240));
        rawSalmonBtn.setPreferredSize(new Dimension(125, 107));
        rawSalmonBtn.setBackground(new Color(240,240,240,240));
        
        frozenGoodsPanel.add(beefCattleBtn);
        frozenGoodsPanel.add(chickenWingsBtn);
        frozenGoodsPanel.add(crabMeatBtn);
        frozenGoodsPanel.add(fishBtn);
        frozenGoodsPanel.add(lambMeatBtn);
        frozenGoodsPanel.add(porkMeatBtn);
        frozenGoodsPanel.add(prawnBtn);
        frozenGoodsPanel.add(sausageBtn);
        frozenGoodsPanel.add(squidBtn);
        frozenGoodsPanel.add(wholeChickenBtn);
        frozenGoodsPanel.add(chickenDrumBtn);
        frozenGoodsPanel.add(rawSalmonBtn);
        frozenGoodsScroll = new JScrollPane(frozenGoodsPanel);
        frozenGoodsScroll.setPreferredSize(new Dimension(285, 700));
        this.getContentPane().add(frozenGoodsScroll, BorderLayout.CENTER);
        
        //BY DEFAULT, FROZEN GOODS IS HIDDEN.
        freshGoodsPanel.setVisible(true);
        freshGoodsScroll.setVisible(true);
        
        frozenGoodsPanel.setVisible(false);
        frozenGoodsScroll.setVisible(false);
        
        flow.setAlignment(FlowLayout.CENTER);
        rightDiv.setLayout(flow);
        rightDiv.setPreferredSize(new Dimension(285, 695));
        rightDiv.setBackground(Color.WHITE);
        rightDiv.add(goodsBtnPnl);
        rightDiv.add(freshGoodsScroll);
        rightDiv.add(frozenGoodsScroll);
        
        add(rightDiv);
    }
    
    public void addActionListeners(){
        proceedButton.addActionListener(this);
        discountButton.addActionListener(this);
        
        num1.addActionListener(this);
        num2.addActionListener(this);
        num3.addActionListener(this);
        num4.addActionListener(this);
        num5.addActionListener(this);
        num6.addActionListener(this);
        num7.addActionListener(this);
        num8.addActionListener(this);
        num9.addActionListener(this);
        num0.addActionListener(this);
        num00.addActionListener(this);
        dotButton.addActionListener(this);
        deleteButton.addActionListener(this);
        voidButton.addActionListener(this);
        computeButton.addActionListener(this);
        logoutButton.addActionListener(this);
        
        freshGoodsButton.addActionListener(this);
        frozenGoodsButton.addActionListener(this);
        
        applesButton.addActionListener(this);
        avocadoButton.addActionListener(this);
        cauliFlowerButton.addActionListener(this);
        beetrootButton.addActionListener(this);
        celeryButton.addActionListener(this);
        eggPlantButton.addActionListener(this);
        lettuceButton.addActionListener(this);
        potatoesButton.addActionListener(this);
        redChiliButton.addActionListener(this);
        tomatoesButton.addActionListener(this);
        greenBeansBtn.addActionListener(this);
        gingerBtn.addActionListener(this);
        
        beefCattleBtn.addActionListener(this);
        chickenWingsBtn.addActionListener(this);
        crabMeatBtn.addActionListener(this);
        fishBtn.addActionListener(this);
        lambMeatBtn.addActionListener(this);
        porkMeatBtn.addActionListener(this);
        prawnBtn.addActionListener(this);
        sausageBtn.addActionListener(this);
        squidBtn.addActionListener(this);
        wholeChickenBtn.addActionListener(this);
        chickenDrumBtn.addActionListener(this);
        rawSalmonBtn.addActionListener(this);
        
        prompt.voidYes.addActionListener(this);
        prompt.voidNo.addActionListener(this);
        prompt.logOutYes.addActionListener(this);
        prompt.logOutNo.addActionListener(this);
        prompt.discountYes.addActionListener(this);
        prompt.discountNo.addActionListener(this);
        prompt.deleteYes.addActionListener(this);
        prompt.deleteNo.addActionListener(this);
        prompt.proceedPayment.addActionListener(this);
        prompt.enter.addActionListener(this);
        prompt.goBack.addActionListener(this);
    }
    
    public void scanGoods(String foodName){
        DefaultTableModel model= (DefaultTableModel) priceList.getModel();
        double valueHold = 0;
        foodItems[] foodStock = {fresh, frozen};
        for(foodItems x: foodStock){
            for(int i = 0; i < 12; i++){
                if(x.addFood(i, 0).equals(foodName)){
                    x.setTotalPerItem(i);
                    model.addRow(new Object[]{x.addFood(i, 0), x.addFood(i, 1), x.getFoodQuantity(), x.getTotalPerItem()});
                    for(int j = 0; j < model.getRowCount(); j++){
                        String itmSubTtl = model.getValueAt(j, 3).toString();
                        x.setSubTotal(valueHold+=Double.parseDouble(itmSubTtl));
                        subTotalCompute.setText("P"+ df.format(x.getSubtotal()));
                        taxCompute.setText("P"+df.format(x.getTax()));
                        totalCompute.setText("P"+df.format(x.getTotal()));
                    }
                }
            }
        }
    }
    
    public void numFunction(int quantity){
        DefaultTableModel model= (DefaultTableModel) priceList.getModel();
        foodItems[] foodStock = {fresh, frozen};
        for(foodItems x: foodStock){
            x.setItemQuantity(quantity);
            model.setValueAt(x.getFoodQuantity(), priceList.getSelectedRow(), 2);
            for (int i = 0; i < 12; i++){
                if(x.addFood(i, 0).equals(model.getValueAt(priceList.getSelectedRow(), 0))){
                    x.setTotalPerItem(i);
                    model.setValueAt(x.getTotalPerItem(), priceList.getSelectedRow(), 3);
                    //x.setItemQuantity(1);
                }
            }
            x.setItemQuantity(1);
        }
    }
    
    public void actionPerformed(ActionEvent press){
        DefaultTableModel model= (DefaultTableModel) priceList.getModel();
        
        if(press.getSource() == applesButton){
            scanGoods("Apples (1kg)");
        }else if(press.getSource() == avocadoButton){
            scanGoods("Avocado (1kg)");
        }else if(press.getSource() == cauliFlowerButton){
            scanGoods("Cauliflower (1kg)");
        }else if(press.getSource() == beetrootButton){
            scanGoods("Beetroot (1kg)");
        }else if(press.getSource() == celeryButton){
            scanGoods("Celery (1kg)");
        }else if(press.getSource() == eggPlantButton){
            scanGoods("Eggplant (1kg)");
        }else if(press.getSource() == lettuceButton){
            scanGoods("Lettuce (1kg)");
        }else if(press.getSource() == potatoesButton){
            scanGoods("Potatoes (1kg)");
        }else if(press.getSource() == redChiliButton){
            scanGoods("Red chili (1kg)");
        }else if(press.getSource() == tomatoesButton){
            scanGoods("Tomatoes (1kg)");
        }else if(press.getSource() == greenBeansBtn){
            scanGoods("Green beans (1kg)");
        }else if(press.getSource() == gingerBtn){
            scanGoods("Ginger (1kg)");
        }else if(press.getSource() == beefCattleBtn){
            scanGoods("Beef cattle (1kg)");
        }else if(press.getSource() == chickenWingsBtn){
            scanGoods("Chicken wings (1kg)");
        }else if(press.getSource() == crabMeatBtn){
            scanGoods("Crab meat (1kg)");
        }else if(press.getSource() == fishBtn){
            scanGoods("Fish (1kg)");
        }else if(press.getSource() == lambMeatBtn){
            scanGoods("Lamb meat (1kg)");
        }else if(press.getSource() == porkMeatBtn){
            scanGoods("Pork meat (1kg)");
        }else if(press.getSource() == prawnBtn){
            scanGoods("Prawns (1kg)");
        }else if(press.getSource() == sausageBtn){
            scanGoods("Sausage (1kg)");
        }else if(press.getSource() == squidBtn){
            scanGoods("Squid (1kg)");
        }else if(press.getSource() == wholeChickenBtn){
            scanGoods("Whole chicken (1kg)");
        }else if(press.getSource() == chickenDrumBtn){
            scanGoods("Chicken drumsticks (1kg)");
        }else if(press.getSource() == rawSalmonBtn){
            scanGoods("Fresh salmon (1kg)");
        }
        
        else if(press.getSource() == freshGoodsButton){
            frozenGoodsPanel.setVisible(false);
            frozenGoodsScroll.setVisible(false);
            freshGoodsPanel.setVisible(true);
            freshGoodsScroll.setVisible(true);
        }
        
        else if(press.getSource() == frozenGoodsButton){
            freshGoodsPanel.setVisible(false);
            freshGoodsScroll.setVisible(false);
            frozenGoodsPanel.setVisible(true);
            frozenGoodsScroll.setVisible(true);
        }
        
        else if(press.getSource() == deleteButton){
            prompt.deleteFN();
        }
        
        else if(press.getSource() == prompt.deleteYes){
            double valueHold = 0;
            model.removeRow(priceList.getSelectedRow());
            for(int j = 0; j < model.getRowCount(); j++){
                String itmSubTtl = model.getValueAt(j, 3).toString();
                fresh.setSubTotal(valueHold+=Double.parseDouble(itmSubTtl));
                subTotalCompute.setText("P"+ df.format(fresh.getSubtotal()));
                taxCompute.setText("P"+df.format(fresh.getTax()));
                totalCompute.setText("P"+df.format(fresh.getTotal()));
            }
            if(priceList.getRowCount() == 0){
                subTotalCompute.setText("P0.00");
                taxCompute.setText("P0.00");
                totalCompute.setText("P0.00");
            }
            prompt.deleteFrame.dispose();
        }
        
         else if(press.getSource() == prompt.deleteNo){
             prompt.deleteFrame.dispose();
         }
        
        else if(press.getSource() == voidButton){
            prompt.voidFn();
            
        }
        else if(press.getSource() == prompt.voidYes){
            model.setRowCount(0);
            subTotalCompute.setText("P0.00");
            taxCompute.setText("P0.00");
            discountCompute.setText("P.00");
            totalCompute.setText("P0.00");
            discountButton.setEnabled(true);
            paymentCompute.setText("P0.00");
            prompt.voidFrame.dispose();
        }
        
        else if (press.getSource() == prompt.voidNo){
            prompt.voidFrame.dispose();
        }
        
        else if(press.getSource() == logoutButton){
            prompt.logoutFN();
        }
        
        else if(press.getSource() == prompt.logOutYes){
            prompt.logOutFrame.dispose();
            this.dispose();
            new LoginModule();
        }
        
        else if(press.getSource() == prompt.logOutNo){
            prompt.logOutFrame.dispose();
        }
        
        else if(press.getSource() == discountButton){
            prompt.discountFN();
        }
        
        else if(press.getSource() == prompt.discountYes){
            double valueHold = 0.0;            
            for(int j = 0; j < model.getRowCount(); j++){
                String itmSubTtl = model.getValueAt(j, 3).toString();
                fresh.setSubTotal(valueHold+=Double.parseDouble(itmSubTtl));
                subTotalCompute.setText("P"+ df.format(fresh.getSubtotal()));
                taxCompute.setText("P"+df.format(fresh.getTax()));
                fresh.setDiscount(0.20);
                discountCompute.setText("P"+df.format(fresh.getDiscount()));
                totalCompute.setText("P"+df.format(fresh.getTotalwDiscount()));
            }
            fresh.setDiscount(0.20);
            discountButton.setEnabled(false);
            prompt.discountFrame.dispose();
        }
        else if(press.getSource() == prompt.discountNo){
            prompt.discountFrame.dispose();
        }
        
        else if(press.getSource() == proceedButton){
            prompt.proceedFN();
        }
        
        else if(press.getSource() == prompt.enter && discountButton.isEnabled()){
            double total = 0.0;
            double tax = 0.0;
            foodItems[] foodStock = {fresh, frozen};
            for(foodItems x: foodStock){
                int count = 1;
                if (count == 1){
                    for (int i = 0; i < model.getRowCount(); i++){
                        String itmSubTtl = model.getValueAt(i, 3).toString();
                        x.setSubTotal(total+=Double.parseDouble(itmSubTtl));
                    }
                    total = x.getTotal();
                    tax = x.getTax();
                }
                break;
            }
            double payment = Double.parseDouble(prompt.proceedPayment.getText());
            if(payment < total){
                prompt.insufficientFN();
                prompt.proceedPayment.setText("");
            }
            
            else if(payment > total){
                paymentCompute.setText(prompt.proceedPayment.getText());
                summary.receiptHeadFN();
                
                    for (int i = 0; i < model.getRowCount(); i++){
                        summary.head.setText(summary.head.getText() + "\n" + "   " + model.getValueAt(i, 0) + "\t" + model.getValueAt(i, 2) + "\t" + model.getValueAt(i, 3)); 
                    }
                    summary.head.setText(summary.head.getText() + "\n\n    *****************************************************************");
             
                double balance = payment - total;
                summary.receiptFooterFN("NOT APPLICABLE", "P "+df.format(tax), "P "+df.format(total), "P "+prompt.proceedPayment.getText(), "P "+df.format(balance));
                prompt.proceedFrame.dispose();
                model.setRowCount(0);
                subTotalCompute.setText("P0.00");
                taxCompute.setText("P0.00");
                discountCompute.setText("P.00");
                totalCompute.setText("P0.00");
                paymentCompute.setText("P0.00");
                prompt.proceedPayment.setText("");
                discountButton.setEnabled(true);
            }
        }
        
        else if (press.getSource() == prompt.enter && (!discountButton.isEnabled())){
            double totalWDiscount = 0.0;
            double tax = 0.0;
            double discount = 0.0;
            foodItems[] foodStock = {fresh, frozen};
            for(foodItems x: foodStock){
                
                    for (int i = 0; i < model.getRowCount(); i++){
                        String itmSubTtl = model.getValueAt(i, 3).toString();
                        x.setSubTotal(totalWDiscount+=Double.parseDouble(itmSubTtl));
                    }
                    
                    totalWDiscount = x.getTotalwDiscount();
                    tax = x.getTax();
                    discount = x.getDiscount();
                
                break;
            }
            double payment = Double.parseDouble(prompt.proceedPayment.getText());
            if(payment < totalWDiscount){
                prompt.insufficientFN();
                prompt.proceedPayment.setText("");
            }
            
            else if(payment > totalWDiscount){
                paymentCompute.setText(prompt.proceedPayment.getText());
                summary.receiptHeadFN();
                for (int j = 0; j < 1; j++){
                    for (int i = 0; i < model.getRowCount(); i++){
                        summary.head.setText(summary.head.getText() + "\n" + "   " + model.getValueAt(i, 0) + "\t" + model.getValueAt(i, 2) + "\t" + model.getValueAt(i, 3)); 
                    }
                    summary.head.setText(summary.head.getText() + "\n\n    *****************************************************************");
                }//
                double balance = payment - totalWDiscount;
                summary.receiptFooterFN("P "+df.format(discount), "P "+df.format(tax), "P "+df.format(totalWDiscount), "P "+prompt.proceedPayment.getText(), "P "+df.format(balance));
                prompt.proceedFrame.dispose();
                model.setRowCount(0);
                subTotalCompute.setText("P0.00");
                taxCompute.setText("P0.00");
                discountCompute.setText("P.00");
                totalCompute.setText("P0.00");
                paymentCompute.setText("P0.00");
                prompt.proceedPayment.setText("");
                discountButton.setEnabled(true);
            }
        }
        
        else if(press.getSource() == prompt.goBack){
            prompt.insufficentFrame.dispose();
        }
        
        else if(press.getSource() == num1){
            numFunction(1);
        }else if(press.getSource() == num2){
            numFunction(2);
        } else if(press.getSource() == num3){
            numFunction(3);
        }else if(press.getSource() == num4){
            numFunction(4);
        }else if(press.getSource() == num5){
            numFunction(5);
        }else if(press.getSource() == num6){
            numFunction(6);
        }else if(press.getSource() == num7){
            numFunction(7);
        }else if(press.getSource() == num8){
            numFunction(8);
        }else if(press.getSource() == num9){
            numFunction(9);
        }
        
        else if(press.getSource() == computeButton){
            double valueHold = 0.0;
            for(int j = 0; j < model.getRowCount(); j++){
                String itmSubTtl = model.getValueAt(j, 3).toString();
                fresh.setSubTotal(valueHold+=Double.parseDouble(itmSubTtl));
                subTotalCompute.setText("P"+ df.format(fresh.getSubtotal()));
                taxCompute.setText("P"+df.format(fresh.getTax()));
                totalCompute.setText("P"+df.format(fresh.getTotal()));
            }
        }
    }    
}