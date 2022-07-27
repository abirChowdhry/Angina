package classes.sell.catagories;//declaring package

import classes.sell.Sell;//importing necessary classes

public class Sari extends Sell{ //single inheritance
    
	private String fabrics;
	
	public Sari()//empty constructor
	{
		
	}
	
	public Sari(String sellerName, String sellerPhn, String catagory, char gender, String size, double price, String colour, int pieces, String code, String fabrics)//parameterized constructor 
	{
		super(sellerName, sellerPhn, catagory, gender, size, price, colour, pieces, code);
		this.fabrics = fabrics;
	}
	
	//setter methods to set the values
	public void setFabrics(String fabrics){
	
    //getter method to get the values	
	}
	public String getFabrics(){
		return fabrics;
	}
	
	public void showDetails()//display function to show the informations
	{
		super.showDetails();
		System.out.println("\t\t\t 9.Fabrics          :" +fabrics);
		System.out.println();
	}
}