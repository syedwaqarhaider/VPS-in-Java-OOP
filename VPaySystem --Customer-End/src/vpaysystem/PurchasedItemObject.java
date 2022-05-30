
package vpaysystem;


public class PurchasedItemObject {
    String ItemName;
    int quantity;
    int price;
    int totalPrice;
    String ShopName;
    String Date;
    public PurchasedItemObject(String ItemName, int quantity, int price,String ShopName, String Date) {
        this.ItemName = ItemName;
        this.quantity = quantity;
        this.price = price;
        this.totalPrice=price*quantity;
        this.ShopName=ShopName;
        this.Date=Date;
    }
    

    
}
