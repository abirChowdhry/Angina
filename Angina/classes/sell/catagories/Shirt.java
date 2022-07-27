package classes.sell.catagories;//declaring package

import classes.sell.Sell;//importing necessary classes

public class Shirt extends Sell{ //single inheritance
	
	protected String sleeves;
	
	public Shirt()//empty constructor
	{
		
	}
	
	public Shirt(String sellerName, String sellerPhn, String    catagory,char gender, String size, double price, String colour, int pieces, String code, String sleeves)//parameterized constructor 
	{
		super(sellerName, sellerPhn, catagory, gender, size, price, colour, pieces, code);
		this.sleeves = sleeves;
	}
	
	//setter methods to set the values
	public void setSleeves(String sleeves){
		this.sleeves = sleeves;
	}
	
	//getter method to get the values
	public String getSleeves(){
		return sleeves;
	}
	
	public void showDetails()//display function to show the informations
	{
		super.showDetails();
		System.out.println("\t\t\t 9.Sleeves          :" +sleeves); 
		System.out.println();
	} 
}  