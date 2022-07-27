package classes.sell.catagories;//declaring package

import classes.sell.Sell;//importing necessary classes

public class Pant extends Sell{ //single inheritance
    
	private String pantType;
	private String length;
	
	public Pant()//empty constructor
	{
		
	}
	
	public Pant(String sellerName, String sellerPhn, String catagory, char gender, String size, double price, String colour, int pieces, String code, String pantType, String length)//parameterized constructor 
	{
		super(sellerName, sellerPhn, catagory, gender, size, price, colour, pieces, code);
		this.pantType = pantType;
		this.length = length;
	}
	
	//setter methods to set the values
	public void setPantType(String pantType){
		this.pantType = pantType;
	}
	public void setLength(String length){
		this.length = length;
	}
	
	//getter method to get the values
	public String getPantType(){
		return pantType;
	}
	public String getLength(){
		return length;
	}
	
	public void showDetails()//display function to show the informations
	{
		super.showDetails();
		System.out.println("\t\t\t 9.Pant Type        :" +pantType);
		System.out.println("\t\t\t10.Length           :" +length);
		System.out.println();
	}
}