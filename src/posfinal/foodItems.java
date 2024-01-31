package posfinal;

import java.util.*;
public abstract class foodItems {
    private String itemName;
    private double itemPrice;
    private final String[][] foodItem;
    private int counter = 0;
    
    private int itemQuantity;
    private double totalPerItem;
    private double total;
    private double subtotal;
    private double tax;
    private double discount;
    
    public abstract void addGoods();
    
    public foodItems(){
        itemName = "N/A";
        itemPrice = 0.00;
        foodItem = new String[12][2];
        
        itemQuantity = 1;
        totalPerItem = 0.00;
        total = 0.00;
        subtotal = 0.0;
        tax = 0.03;
        discount = 0.20;
    }
    
    public boolean setFood(String name, double price){
        this.itemName = name;
        this.itemPrice = price;
        foodItem[counter][0] = itemName;
        foodItem[counter][1] = "P"+itemPrice;
        counter++;
        return true;
    }
    
    public String getFoodName(){
        return itemName;
    }
    
    public Double getFoodPrice(){
        return itemPrice;
    }
   
    public String addFood(int i, int j){
        return foodItem[i][j];
    }

    public void setItemQuantity(int qty){
        this.itemQuantity = qty;
    }
    
    //
    public void setTotalPerItem(int i){
        StringTokenizer st = new StringTokenizer(foodItem[i][1]);  
        String hold = st.nextToken("P");
        totalPerItem = Double.parseDouble(hold);
        totalPerItem = totalPerItem*itemQuantity;
    }
    
    public void setSubTotal(double subtotal){
        this.subtotal = subtotal;
    }
    
    public void setDiscount(double discountPrice){
        this.discount = getSubtotal()*discountPrice;
    }
    
    public int getFoodQuantity(){
        return itemQuantity;
    }
    
    public double getTotalPerItem(){
        return totalPerItem;
    }
    
    public double getSubtotal(){
        return subtotal;
    }
    
    public double getTax(){
        return tax*getSubtotal();
    }
    
    public double getDiscount(){
        return this.discount;
    }
    
    public double getTotal(){
        this.total = getSubtotal() + getTax();
        return total;
    }
    
    public double getTotalwDiscount(){
        this.total = getSubtotal() + getTax() - getDiscount();
        return total;
    }
}