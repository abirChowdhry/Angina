package classes.buy;//declaring package

//importing necessary classes
import classes.sell.Sell;
import method.Methods;

public class Buy implements Methods{ //implementing interface
	
	Sell sells[];
	public static int totalClothes;
	
	public Buy()//empty constructor
	{
		
	}
	
	public Buy(int sizeOfArray)//parameterized constructor 
	{
		sells = new Sell[sizeOfArray];
	}
	
	//overridden
	public void AddClothe (Sell s) //method for adding new clothe 
	{
		int flag = 0;
		for(int i=0; i<sells.length; i++)
		{
			if(sells[i] == null)
			{
				sells[i] = s;
				flag = 1;
				totalClothes++;
				break;
			}
		}
		if(flag == 1){System.out.println("\t\t\t\t **************Clothe Added**************");}
		else {System.out.println("\t\t\t **************Clothe Can Not Be Added**************");}
	}
	
	//overridden
	public void RemoveClothe (String uCode3, String name3) //method for removing clothe 
	{
		int flag =0;
		for(int i=0; i<sells.length; i++)
		{
			if(sells[i].getCode().equals(uCode3) && sells[i].getSellerName().equals(name3))
			{
				sells[i] = null;
				flag = 1;
				totalClothes--;
				break;
			}
		}
		if(flag==1){System.out.println("\t\t\t\t **************Clothe Removed**************");}
		else{System.out.println("\t\t\t **************Clothe Can Not Be Removed**************");}
	}
	
	//overridden
	public void showAllClothes () //method for showing all added clothes
	{
		int flag =0;
		System.out.println("\t\t\t   _ _ _ _ _ _ _ _ Total Clothes-"+totalClothes+"_ _ _ _ _ _ _ _ ");
		System.out.println();
		System.out.println();
		for(int i=0; i<sells.length; i++)
		{ 	
			if(sells[i] != null)
			{
				System.out.println("\t\t --------------Clothe-"+(i+1)+"--------------");
				System.out.println();
				sells[i].showDetails();
				System.out.println();
				flag = 1;
			}
			
		}
		if(flag==0){System.out.println("\t\t **************OOPS! There is no clothe available for sell**************");}
	}
	
	//overridden
	public void showClothesByCatagory(String clotheCatagory) //method for showing all the added clothes of a particular catagory
	{
		int flag =0;
		for(int i=0; i<sells.length; i++)
		{			
			if(sells[i] != null)
			{
				if(sells[i].getCatagory().equals(clotheCatagory))
			   {
				System.out.println("\t\t --------------Clothe-"+(i+1)+"--------------");
				System.out.println();
				sells[i].showDetails();
				System.out.println();
				flag = 1;
			   }
			}
		}
		if(flag==0){System.out.println("\t\t **************OOPS! There is no clothe available for sell**************");}
	}
	
	//overridden
	public void AddNewPieces(String uCode1, String name1, int newPeices) //method for adding new pieces
	{
		int flag =0;
		for(int i=0; i<sells.length; i++) 
		{
			if(sells[i].getCode().equals(uCode1) && sells[i].getSellerName().equals(name1))
			{
				sells[i].AddPieces(newPeices);
				flag = 1;
				break;
			}
		}
		if(flag==1){System.out.println("\t\t\t\t **************New Peices Added**************");}
		else{System.out.println("\t\t\t **************Peices Can Not Be Added**************");}
	}
	
	//overridden
	public void RemovePieces (String uCode2, String name2, int oldPeices) //method for removing pieces
	{
		int flag =0;
		for(int i=0; i<sells.length; i++) 
		{
		    if(sells[i].getCode().equals(uCode2) && sells[i].getSellerName().equals(name2))
			{
				sells[i].RemovePieces(oldPeices);
				flag = 1;
				break;
			}
		}
		if(flag==1){System.out.println("\t\t\t\t **************Peices Removed**************");}
		else{System.out.println("\t\t\t **************Peices Can Not Be Removed**************");}
	}
}