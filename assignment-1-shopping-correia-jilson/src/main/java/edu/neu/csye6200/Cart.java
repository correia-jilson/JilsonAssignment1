package edu.neu.csye6200;

public class Cart {
	
	private double myCash;
    private double myTotal;
    private double myChange;
    
    public Cart(double cash) {
    	
    	myCash = cash;
    	myTotal = 0;
    	myChange = 0;
    	
    }
    
    public double getMyCash() {
        return myCash;
    }
    
    public double getMyChange() {
        return myChange;
    }
    
    public double getMyTotal() {
    	return myTotal;
    }
    
    
    

	public void sillyCheckout(double price) {
        double remainingChange = myCash - myTotal - price;
        if (remainingChange >= 0) {
            myTotal += price;
            myChange += remainingChange;
        }
		
    }

    
    public double checkout(Cart myCart, Item myItem) {
        double change = myCart.getMyCash() - myCart.getMyTotal() - myItem.getItemCost();
        if (change >= 0) {
            myCart.myTotal += myItem.getItemCost();
            myCart.myChange += change;
        }
        return change;
    }

    public String toString() {
        return "Cash: $" + myCash + ", Total: $" + myTotal + ", Change: $" + myChange;
    }
}
