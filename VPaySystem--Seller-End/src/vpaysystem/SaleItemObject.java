
package vpaysystem;


public class SaleItemObject {
    String ItemName;
    int quantity;
    int price;
    int totalPrice;
    String CustomerName;
    String Date;
    public SaleItemObject(String ItemName, int quantity, int price,String CustomerName, String Date) {
        this.ItemName = ItemName;
        this.quantity = quantity;
        this.price = price;
        this.totalPrice=price*quantity;
        this.CustomerName=CustomerName;
        this.Date=Date;
    }

  
    

    
}
