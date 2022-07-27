package classes.sell;//declaring package

public class Sell{
	 
	protected String sellerName;
	protected String sellerPhn;
	protected String catagory;
    protected char gender;
    protected String size;
    protected double price;
    protected String colour;
    protected int pieces;	
	protected String code;
	
	public Sell()//empty constructor
	{
		
	}
	
	public Sell(String sellerName, String sellerPhn, String catagory, char gender, String size, double price, String colour, int pieces, String code)//parameterized constructor 
	{
		this.sellerName = sellerName;
		this.sellerPhn = sellerPhn;
		this.catagory = catagory;
		this.gender = gender;
		this.size = size;
		this.price = price;
		this.colour = colour;
		this.pieces = pieces;
		this.code = code;
	}
	
	//setter methods to set the values
	public void setSellerName(String sellerName){
		this.sellerName = sellerName;
	}
	public void sellerPhn(String sellerPhn){
		this.sellerPhn = sellerPhn;
	}
	public void setCatagory(String catagory){
		this.catagory = catagory;
	}
	public void setGender(char gender){
		this.gender = gender;
	}
	public void setSize(String size){
		this.size = size;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public void setColour(String colour){
		this.colour = colour;
	}
	public void setPieces(int pieces){
		this.pieces = pieces;
	}
	public void setCode(String code){
		this.code = code;
	}
	
	//getter method to get the values
	public String getSellerName(){
		return sellerName;
	}
	public String getSellerPhn(){
		return sellerPhn;
	}
	public String getCatagory(){
		return catagory;
	}
	public char getGender(){
		return gender;
	}
	public String getSize(){
		return size;
	}
	public double getPrice(){
		return price;
	}
	public String getColour(){
		return colour;
	}
	public int getPieces(){
		return pieces;
	}
	public String getCode(){
		return code;
	}
	
	public void AddPieces(int x)//method to add new pieces 
	{
		pieces = pieces + x;
	}
	
	public void RemovePieces(int y)//method to remove pieces
	{
		pieces = pieces - y;
	}
	
	public void showDetails()//display function to show the informations
	{
		System.out.println();
		System.out.println("\t\t\t 1.Seller Name      :" +sellerName);
        System.out.println("\t\t\t 2.Seller Phone     :" +sellerPhn);
        System.out.println("\t\t\t 3.Catagory         :" +catagory);
		System.out.println("\t\t\t 4.For              :" +gender);
		System.out.println("\t\t\t 5.Size             :" +size);
		System.out.println("\t\t\t 6.Price            :" +price);
		System.out.println("\t\t\t 7.Colour           :" +colour);
		System.out.println("\t\t\t 8.Pieces           :" +pieces);
	}
}