package edu.neu.csye6200;

public class Cart {
	
	private double myCash;
    
	private double myTotal;
    private double myChange;
    
    public Cart(double cash) {
    	
    	myCash = cash;
    	myTotal= 0.0;
    	myChange = 0.0;
    	
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
    
    public void setMyCash(double myCash) {
		this.myCash = myCash;
	}

	public void setMyTotal(double myTotal) {
		this.myTotal = myTotal;
	}

	public void setMyChange(double myChange) {
		this.myChange = myChange;
	}

    
    
    

    public void sillyCheckout(double cash,double price,double total, double change) {
        double tempCash = cash;
        double tempTotal = total;
        double tempChange = change;

        if (tempCash >= price) {
            tempTotal = tempTotal + price;
            tempChange = tempCash - price;
            tempCash = tempCash - tempTotal;
        }
        
        System.out.println("Item Price: $" + price);
        System.out.println("Total: $" + tempTotal + ", Change: $" + String.format("%.2f", tempChange));

    }

    
    
    
    public double checkout(Cart myCart, Item myItem) {

        if (myCart.getMyCash() >= myItem.getItemCost()) {
            myCart.setMyTotal(myCart.getMyTotal() + myItem.getItemCost());
            myCart.setMyChange(myCart.getMyCash() - myItem.getItemCost());
            myCart.setMyCash(getMyChange());
        }
        
        System.out.println("Item Name: $" + myItem.getItemId() +"Item Price: $" + myItem.getItemCost());

      return myCart.getMyChange();
  }

    public String toString() {
        return "Cash: $" + myCash + ", Total: $" + myTotal + ", Change: $" +String.format("%.2f", myChange);
    }
}
