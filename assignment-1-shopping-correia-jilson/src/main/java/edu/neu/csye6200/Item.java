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
		
        Cart myCart = new Cart(20); // Initialize Cart with $20
        Item item1 = new Item("Pizza" , 10.99);
        Item item2 = new Item("Bread Sticks" , 4.99);
        Item item3 = new Item("Candy" , 1.99);

        double change1 = myCart.sillyCheckout(myCart.getMyCash(), item1.getItemCost(), myCart.getMyTotal(), myCart.getMyChange());
        double change2 = myCart.sillyCheckout(myCart.getMyCash(), item2.getItemCost(), myCart.getMyTotal(), myCart.getMyChange());
        double change3 = myCart.sillyCheckout(myCart.getMyCash(), item3.getItemCost(), myCart.getMyTotal(), myCart.getMyChange());
        
        
        System.out.println("______________________________");
		System.out.println("\n*******Reciept*******\n");
		
        System.out.println("Date & Time : " +dateTime);
        
        System.out.println(item1.getItemId() + ": $" + item1.getItemCost() + " - Change: $" + change1);
        System.out.println(item2.getItemId() + ": $" + item2.getItemCost() + " - Change: $" + change2);
        System.out.println(item3.getItemId() + ": $" + item3.getItemCost() + " - Change: $" + change3);
        
        System.out.println("Total: $" + 20 );
        System.out.println("Remaining Change: $" + myCart.getMyChange()+"\n");
        System.out.println("\nThank You for Shopping\n\nDo Visit Again");
        System.out.println("______________________________");
		
		
	    
		
    }
	
}
