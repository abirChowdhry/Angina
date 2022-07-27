package classes.sell.catagories;//declaring package

import classes.sell.Sell;//importing necessary classes

public class SalwarKameez extends Sell{ //single inheritance
	
	private String salwarKameezType;
	private String whatToGet;
	
	public SalwarKameez()//empty constructor
	{
		
	}
	
	public SalwarKameez(String sellerName, String sellerPhn, String catagory, char gender, String size, double price, String colour, int pieces, String code, String salwarKameezType, String whatToGet)//parameterized constructor 
	{
		super(sellerName, sellerPhn, catagory, gender, size, price, colour, pieces, code);
		this.salwarKameezType = salwarKameezType;
		this.whatToGet = whatToGet;
	}
	
	//setter methods to set the values
	public void setSalwarKameezType (String salwarKameezType){
		this.salwarKameezType = salwarKameezType;
	}
	public void setWhatToGet (String whatToGet){
		this.whatToGet = whatToGet;
	}
	
	//getter method to get the values
	public String getSalwarKameezType(){
		return salwarKameezType;
	}
	public String getWhatToGet (){
		return whatToGet;
	}
	
	public void showDetails()//display function to show the informations
	{
		super.showDetails();
		System.out.println("\t\t\t 9.SalwarKameez Type:" +salwarKameezType);
		System.out.println("\t\t\t10.What To Get      :" +whatToGet);
		System.out.println();
	}
}