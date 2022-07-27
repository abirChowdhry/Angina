package classes.sell.catagories;//declaring package

import classes.sell.catagories.Shirt;//importing necessary classes

public class TShirt extends Shirt{ //multilevel inheritance
	
	public TShirt()//empty constructor
	{
		
	}
	
	public TShirt(String sellerName, String sellerPhn, String    catagory,char gender, String size, double price, String colour, int pieces, String code, String sleeves)//parameterized constructor 
	{
		super(sellerName, sellerPhn, catagory, gender, size, price, colour, pieces, code, sleeves);
	}
	
	public void showDetails()//display function to show the informations
	{
		super.showDetails();
	}
}