package edu.neu.csye6200;
import java.util.Date;
public class Item {
	
	private String itemId;
	private double itemCost;
	public Item(String itemId, double itemCost) {
		super();
		this.itemId = itemId;
		this.itemCost = itemCost;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public double getItemCost() {
		return itemCost;
	}
	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}
	
	public static void demo() {
		
		Date dateTime = new Date();
		
        Cart myCart = new Cart(20.00); // Initialize Cart with $20
        Item item1 = new Item("Pizza" , 10.99);
        Item item2 = new Item("Bread Sticks" , 4.99);
        Item item3 = new Item("Candy" , 1.99);

        myCart.sillyCheckout(myCart.getMyCash(), item1.getItemCost(), myCart.getMyTotal(), myCart.getMyChange());
		myCart.sillyCheckout(myCart.getMyCash(), item2.getItemCost(), myCart.getMyTotal(), myCart.getMyChange());
		myCart.sillyCheckout(myCart.getMyCash(), item3.getItemCost(), myCart.getMyTotal(), myCart.getMyChange());
		
        
        System.out.println("______________________________");
		System.out.println("\n*******Reciept*******\n");
		
        System.out.println("Date & Time : " +dateTime);
        
        myCart.checkout(myCart, item1);
        myCart.checkout(myCart, item2);
        myCart.checkout(myCart, item3); 
        
        System.out.println("Total: $" + 20 );
        System.out.println("Remaining Change: $");
        System.out.println(myCart);
        System.out.println("\nThank You for Shopping\n\nDo Visit Again");
        System.out.println("______________________________");
		
		
	    
		
    }
	
}
