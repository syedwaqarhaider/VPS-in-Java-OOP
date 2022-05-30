
package vpaysystem;


public class StockItemObject {
    int ItemID;
    String ItemName;
    int quantity;
    int price;
    

    public StockItemObject(String ItemName, int quantity, int ItemID, int price) {
        this.ItemName = ItemName;
        this.quantity = quantity;
        this.price = price;
        this.ItemID=ItemID;
        
    }
    

    
}
