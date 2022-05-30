
package vpaysystem;


public class CartItemObject {
    String ItemName;
    int quantity;
    int price;
    int totalPrice;

    public CartItemObject(String ItemName, int quantity, int price) {
        this.ItemName = ItemName;
        this.quantity = quantity;
        this.price = price;
        this.totalPrice=price*quantity;
    }
    

    
}
