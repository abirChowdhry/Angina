//importing necessary classes
import classes.buy.Buy;
import classes.sell.Sell;
import classes.sell.catagories.*;
import java.util.*;

public class Start{
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		
		System.out.println();
		System.out.println("\t\t\t  >>>>>>>>>>>>>>>>>>>>.ANGINA.<<<<<<<<<<<<<<<<<<<<");
		System.out.println("\t\t\t  ------------------------------------------------");
		System.out.println();
		System.out.println();
		
	    char num4 = 'Y';
	    Buy b1 = new Buy(99999999);//array object creation
	while(!(num4 == 'N' || num4 == 'n'))	 //using do while loop to keep the program running until the user wants
	{	
	 try{ //using try block for any kind of exception handling 
		
		System.out.println("\t\t\t   _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		System.out.println("\t\t\t   |                  Main Menu                    |");
		System.out.println("\t\t\t   |                  ---------                    |");
		System.out.println("\t\t\t   |               1.Buy  Clothe                   |");	
	    System.out.println("\t\t\t   |               2.Sell Clothe                   |");
	    System.out.println("\t\t\t   |               3.Exit                          |");
		System.out.println("\t\t\t   - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println();
		System.out.println("\t\t Enter Your Option: ");
		int num = sc2.nextInt();
	
	if(num == 2)
	{
		System.out.println("\t\t\t   _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");	
		System.out.println("\t\t\t   |                  Sell Menu                    |");
		System.out.println("\t\t\t   |                  ---------                    |");
		System.out.println("\t\t\t   |                 1.Add Clothe                  |");
		System.out.println("\t\t\t   |                 2.Modify Your Clothe          |");
		System.out.println("\t\t\t   |                 3.Exit                        |");
		System.out.println("\t\t\t   - - - - - - - - - - - - - - - - - - - - - - - - -");
		
		System.out.println();
		System.out.println("\t\t Enter Your Option: ");	
		int num1 = sc2.nextInt();	
			
	 if(num1 == 1)
	  {
		System.out.println();
		System.out.println("\t\t Enter How Many Clothes You Want To Add? ");
		int num2 = sc2.nextInt();
		
     for(int i=0;i<num2;i++)
	  {
		System.out.println("\t\t\t   _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		System.out.println("\t\t\t   |             Select The Catagory               |");
		System.out.println("\t\t\t   |                   ---------                   |");
		System.out.println("\t\t\t   |                   1.Shirt                     |");
		System.out.println("\t\t\t   |                   2.T-Shirt                   |");
		System.out.println("\t\t\t   |                   3.Pant                      |");
		System.out.println("\t\t\t   |                   4.Sari                      |");
		System.out.println("\t\t\t   |                   5.Salwaar Kameez            |");
		System.out.println("\t\t\t   |                   6.Exit                      |");
	   	System.out.println("\t\t\t   - - - - - - - - - - - - - - - - - - - - - - - - -");
	   
	    System.out.println();
		System.out.println("\t\t Enter Your Option: ");
		int num3 = sc2.nextInt();
		
		if(num3 == 1)
		{
		System.out.println();	
		System.out.println("\t\t 1. Enter seller name:");
		String s1 = sc1.nextLine(); 
			while(!(s1.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			    	System.out.println("\t\t 1. Enter seller name:");
		            s1 = sc1.nextLine();
			    }
		System.out.println();
		System.out.println("\t\t 2. Enter seller phone number:");
		String s2 = sc1.nextLine();
		while(!(s2.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			    	System.out.println("\t\t 2. Enter seller phone number:");
		            s2 = sc1.nextLine();
			    }
		System.out.println();
		String s3 = "Shirt";//pre-assigning catagory
		System.out.println("\t\t 3. Gender(M/F):");
		char s4 = sc2.next().charAt(0); 
		while (!(s4 =='M' || s4 =='m' ||s4 =='F' || s4 =='f')){ //using while to take correct gender input
			        System.out.println();
			    	System.out.println("The Gender is invalid!");
					System.out.println();
			    	System.out.println("\t\t 3. Gender(M/F):");
				    s4 = sc2.next().charAt(0);
			    }
		System.out.println();
		System.out.println("\t\t 4. Size:");
		String s5 = sc1.nextLine();
		while(!(s5.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			    	System.out.println("\t\t 4. Size:");
		            s5 = sc1.nextLine();
			    }
		System.out.println();
		System.out.println("\t\t 5. Price:");
		double s6 = 0.00;
	    s6 = sc2.nextDouble();
		while(s6 == 0.00){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			    	System.out.println("\t\t 5. Price:");
		            s6 = sc2.nextDouble();
			    }
		System.out.println();
		System.out.println("\t\t 6. Colour:");
		String s7 = sc1.nextLine();
		while(!(s7.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			    	System.out.println("\t\t 6. Colour:");
		            s7 = sc1.nextLine();
			    }
		System.out.println();
		System.out.println("\t\t 7. Pieces:");
		int s8 = 0;
	    s8 = sc2.nextInt();
		while(s8==0){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			    	System.out.println("\t\t 7. Pieces:");
		            s8 = sc2.nextInt();
			    }
		System.out.println();
		System.out.println("\t\t 8. Sleeves(Half/Full):");
		String s9 = sc1.nextLine();
		while(!(s9.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			    	System.out.println("\t\t 8. Sleeves(Half/Full):");
		            s9 = sc1.nextLine();
			    }
		System.out.println();
		System.out.println("\t\t 9. Code:");
		String s48 = sc1.nextLine();
		while(!(s48.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 9. Code:");
		            s48 = sc1.nextLine();
			    }
		System.out.println();
		
		Shirt st = new Shirt(s1, s2, s3, s4, s5, s6, s7, s8, s48, s9);//object creation with parameterized constructor
		
		b1.AddClothe(st);//adding clothe with object
		}
		
		else if(num3 == 2)
		{
		System.out.println();
		System.out.println("\t\t 1. Enter seller name:");
		String s10 = sc1.nextLine();
		while(!(s10.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 1. Enter seller name:");
		            s10 = sc1.nextLine();
			    }
		System.out.println();
		System.out.println("\t\t 2. Enter seller number:");
		String s11 = sc1.nextLine();
		while(!(s11.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 2. Enter seller number:");
		            s11 = sc1.nextLine();
			    }
		System.out.println();
		String s12 = "T-Shirt";//pre-assigning catagory
		System.out.println("\t\t 3. Gender(M/F):");
		char s13 = sc2.next().charAt(0);
		while (!(s13 =='M' || s13 =='m' ||s13 =='F' || s13 =='f')){ //using while to take correct gender input
			        System.out.println();
			    	System.out.println("The Gender is invalid!");
					System.out.println();
			    	System.out.println("\t\t 3. Gender(M/F):");
				    s13 = sc2.next().charAt(0);
			    }
		System.out.println();
		System.out.println("\t\t 4. Size:");
		String s14 = sc1.nextLine();
		while(!(s14.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 4. Size:");
		            s14 = sc1.nextLine();
			    }
		System.out.println();
		System.out.println("\t\t 5. Price:");
		double s15 = 0.00;
		s15 = sc2.nextDouble();
		while(s15==0.00){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 5. Price:");
		            s15 = sc2.nextDouble();
			    }
		System.out.println();
		System.out.println("\t\t 6. Colour:");
		String s16 = sc1.nextLine();
		while(!(s16.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 6. Colour:");
		            s16 = sc1.nextLine();
			    }
		System.out.println();
		System.out.println("\t\t 7. Pieces:");
		int s17 = 0;
	    s17 = sc2.nextInt();
		while(s17==0){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 7. Pieces:");
		            s17 = sc2.nextInt();
			    }
		System.out.println();
		System.out.println("\t\t 8. Sleeves(Half/Full):");
		String s18 = sc1.nextLine();
		while(!(s18.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 8. Sleeves(Half/Full):");
		            s18 = sc1.nextLine();
			    }
		System.out.println();
		System.out.println("\t\t 9. Code:");
		String s49 = sc1.nextLine();
		while(!(s49.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 9. Code:");
		            s49 = sc1.nextLine();
			    }
		System.out.println();
		
		TShirt ts = new TShirt(s10, s11, s12, s13, s14, s15, s16, s17, s49, s18);//object creation with parameterized constructor
		
		b1.AddClothe(ts);//adding clothe with object
		}
		
		else if(num3 == 3)
		{
		System.out.println();	
		System.out.println("\t\t 1. Enter seller name:");
		String s19 = sc1.nextLine();
		while(!(s19.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 1. Enter seller name:");
		            s19 = sc1.nextLine();
			    }
		System.out.println();
		System.out.println("\t\t 2. Enter seller number:");
		String s20 = sc1.nextLine();
		while(!(s20.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 2. Enter seller number:");
		            s20 = sc1.nextLine();
			    }
		System.out.println();
		String s21 = "Pant";//pre-assigning catagory
		System.out.println("\t\t 3. Gender(M/F):");
		char s22 = sc2.next().charAt(0);
		while (!(s22 =='M' || s22 =='m' ||s22 =='F' || s22 =='f')){ //using while to take correct gender input
			        System.out.println();
			    	System.out.println("The Gender is invalid!");
					System.out.println();
			    	System.out.println("\t\t 3. Gender(M/F):");
				    s22 = sc2.next().charAt(0);
			    }
		System.out.println();
		System.out.println("\t\t 4. Size:");
		String s23 = sc1.nextLine();
		while(!(s23.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 4. Size:");
		            s23 = sc1.nextLine();
			    }
		System.out.println();
		System.out.println("\t\t 5. Price:");
		double s24 = 0.00;
		s24 = sc2.nextDouble();
		while(s24==0.00){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 5. Price:");
		            s24 = sc2.nextDouble();
			    }
		System.out.println();
		System.out.println("\t\t 6. Colour:");
		String s25 = sc1.nextLine();
		while(!(s25.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 6. Colour:");
		            s25 = sc1.nextLine();
			    }
		System.out.println();
		System.out.println("\t\t 7. Pieces:");
		int s26 = 0;
		s26 = sc2.nextInt();
		while(s26==0.00){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 7. Pieces:");
		            s26 = sc2.nextInt();
			    }
		System.out.println();	
		System.out.println("\t\t 8. Pant Type:");
		String s27 = sc1.nextLine();
		while(!(s27.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 8. Pant Type:");
		            s27 = sc1.nextLine();
			    }
		System.out.println();
		System.out.println("\t\t 9. Length(Short/Full):");
		String s28 = sc1.nextLine();
		while(!(s28.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 9. Length(Short/Full):");
		            s28 = sc1.nextLine();
			    }
		System.out.println();
		System.out.println("\t\t 10. Code:");
		String s50 = sc1.nextLine();
		while(!(s50.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 10. Code:");
		            s50 = sc1.nextLine();
			    }
        System.out.println();	
		
		Pant p = new Pant(s19, s20, s21, s22, s23, s24, s25, s26, s50, s27, s28);//object creation with parameterized constructor
		
		b1.AddClothe(p);//adding clothe with object
		}
		
		else if(num3 == 4)
		{
		System.out.println();	
		System.out.println("\t\t 1. Enter seller name:");
		String s29 = sc1.nextLine();
		while(!(s29.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 1. Enter seller name:");
		            s29 = sc1.nextLine();
			    }
		System.out.println();
		System.out.println("\t\t 2. Enter seller number:");
		String s30 = sc1.nextLine();
		while(!(s30.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 2. Enter seller number:");
		            s30 = sc1.nextLine();
			    }
		System.out.println();
		String s31 = "Sari";//pre-assigning catagory
		char s32 = 'F';//pre-assigning gender
		System.out.println("\t\t 3. Size:");
		String s33 = sc1.nextLine();
		while(!(s33.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 3. Size:");
		            s33 = sc1.nextLine();
			    }
		System.out.println();
		System.out.println("\t\t 4. Price:");
		double s34 = 0.00;
		s34 = sc2.nextDouble();
		while(s34==0.00){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 4. Price:");
		            s34 = sc2.nextDouble();
			    }
		System.out.println();
		System.out.println("\t\t 5. Colour:");
		String s35 = sc1.nextLine();
		while(!(s35.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 5. Colour:");
		            s35 = sc1.nextLine();
			    }
		System.out.println();
		System.out.println("\t\t 6. Pieces:");
		int s36 = 0;
		s36 = sc2.nextInt();
		while(s36==0){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 6. Pieces:");
		            s36 = sc2.nextInt();
			    }
		System.out.println();	
		System.out.println("\t\t 7. Fabrics:");
		String s37 = sc1.nextLine();
		while(!(s37.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 7. Fabrics:");
		            s37 = sc1.nextLine();
			    }
		System.out.println();
		System.out.println("\t\t 8. Code:");
		String s51 = sc1.nextLine();
		while(!(s51.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 8. Code:");
		            s51 = sc1.nextLine();
			    }
        System.out.println();	
		
		Sari sa = new Sari(s29, s30, s31, s32, s33, s34, s35, s36, s51, s37);//object creation with parameterized constructor
		
		b1.AddClothe(sa);//adding clothe with object
		}
		
		else if(num3 == 5)
		{
		System.out.println();	
		System.out.println("\t\t 1. Enter seller name:");
		String s38 = sc1.nextLine();
		while(!(s38.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
		            System.out.println("\t\t 1. Enter seller name:");
		            s38 = sc1.nextLine();
			    }
		System.out.println();
		System.out.println("\t\t 2. Enter seller number:");
		String s39 = sc1.nextLine();
		while(!(s39.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 2. Enter seller number:");
		            s39 = sc1.nextLine();
			    }
		System.out.println();
		String s40 = "Salwaar Kameez"; //pre-assigning catagory
		char s41 = 'F'; //pre-assigning gender
		System.out.println("\t\t 3. Size:");
		String s42 = sc1.nextLine();
		while(!(s42.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 3. Size:");
		            s42 = sc1.nextLine();
			    }
		System.out.println();
		System.out.println("\t\t 4. Price:");
		double s43 = 0.00;
		s43 = sc2.nextDouble();
		while(s43==0){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 4. Price:");
		            s43 = sc2.nextDouble();
			    }
		System.out.println();
		System.out.println("\t\t 5. Colour:");
		String s44 = sc1.nextLine();
		while(!(s44.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 5. Colour:");
		            s44 = sc1.nextLine();
			    }
		System.out.println();
		System.out.println("\t\t 6. Pieces:");
		int s45 = 0;
		s45 = sc2.nextInt();
		while(s45==0){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 6. Pieces:");
		            s45 = sc2.nextInt();
			    }
		System.out.println();		
        System.out.println("\t\t 7. SalwarKameez Type:");
		String s46 = sc1.nextLine();
		while(!(s46.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 7. SalwarKameez Type:");
		            s46 = sc1.nextLine();
			    }
		System.out.println();
		System.out.println("\t\t 8. What To Get(Salwaar/Kameez/Orna):");
		String s47 = sc1.nextLine();
		while(!(s47.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 8. What To Get(Salwaar/Kameez/Orna):");
		            s47 = sc1.nextLine();
			    }
		System.out.println();
		System.out.println("\t\t 9. Code:");
		String s52 = sc1.nextLine();
		while(!(s52.length()>0)){ //using while to avoid any kind of empty input
			        System.out.println();
			    	System.out.println("\t\t You Haven't Entered Any Information");
					System.out.println();
			        System.out.println("\t\t 9. Code:");
		            s52 = sc1.nextLine();
			    }
        System.out.println();
		
        SalwarKameez sk = new SalwarKameez(s38, s39, s40, s41, s42, s43, s44, s45, s52, s46, s47);//object creation with parameterized constructor
		
		b1.AddClothe(sk);//adding clothe with object		
		}
		
		else if(num3 == 6)
		{
			num4='y';
		}
		
		else
		{
		System.out.println("\t\t\t      -------You Entered Wrong Option-------"); 
		}
	   }   
	}
	 
	 else if(num1 == 2)
	 {
		System.out.println("\t\t\t   _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		System.out.println("\t\t\t   |             What You Want To Do               |");
		System.out.println("\t\t\t   |                 -----------                   |");
		System.out.println("\t\t\t   |        1.Add New Peices To Your Clothe        |");
		System.out.println("\t\t\t   |        2.Remove Peices From Your Clothe       |");
		System.out.println("\t\t\t   |        3.Remove Your Clothe                   |");
		System.out.println("\t\t\t   |        4.Exit                                 |");
    	System.out.println("\t\t\t   - - - - - - - - - - - - - - - - - - - - - - - - -");
	 
	    System.out.println();
		System.out.println("\t\t Enter Your Option: ");
		int num7 = sc2.nextInt();
		
	  if(num7 == 1)
	  {
		System.out.println();
		System.out.println("\t\t 1.Enter The Seller Name:");
		String num15 = sc1.nextLine(); 
		System.out.println("\t\t 2.Enter Your Clothe Code:");
		String num8 = sc1.nextLine();  
		System.out.println("\t\t 3.Enter How Many Peices Do You Want To Add:");
		int num9 = sc2.nextInt(); 
		System.out.println();
		
		b1.AddNewPieces(num8, num15, num9); //adding pieces to clothe
	  } 
	  
	  else if(num7 == 2)
	  {
		System.out.println();
		System.out.println("\t\t 1.Enter The Seller Name:");
		String num14 = sc1.nextLine(); 
		System.out.println("\t\t 2.Enter Your Clothe Code:");
		String num10 = sc1.nextLine();  
		System.out.println("\t\t 3.Enter How Many Peices Do You Want To Remove:");
		int num11 = sc2.nextInt(); 
		System.out.println();

        b1.RemovePieces(num10, num14, num11); //removing pieces from clothe		
	  }
	  
	  else if(num7 == 3)
	  {
		System.out.println();
		System.out.println("\t\t 1.Enter The Seller Name:");
		String num13 = sc1.nextLine(); 
		System.out.println("\t\t 2.Enter The Clothe Code Of The Clothe You Want To Remove:");
		String num12 = sc1.nextLine();  
        System.out.println();
		
		b1.RemoveClothe(num12 , num13); //removing clothe
	  }
	  
	  else if(num7 == 4)
	  {
		num4 = 'y';
	  }
	  
	  else
	  {
	System.out.println("\t\t\t      -------You Entered Wrong Option-------");  
	  }
	 }
	 
	 else if(num1 == 3)
	 {
		num4 = 'y'; 
	 }
	 
	 else
	  {
	System.out.println("\t\t\t      -------You Entered Wrong Option-------");  
	  }
	}
	
	else if(num == 1)
	{
	System.out.println("\t\t\t   _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");	
	System.out.println("\t\t\t   |                  Buy Menu                     |");
	System.out.println("\t\t\t   |                 ----------                    |");
	System.out.println("\t\t\t   |             1.See All Clothes                 |");
	System.out.println("\t\t\t   |             2.Search Clothe By Catagory       |");
	System.out.println("\t\t\t   |             3.Exit                            |");
	System.out.println("\t\t\t   - - - - - - - - - - - - - - - - - - - - - - - - -");
	
	System.out.println();
	System.out.println("\t\t Enter Your Option: ");
	int num5 = sc2.nextInt();
	
	if(num5 == 1)
	  { 
       b1.showAllClothes(); //calling display mthod to show the details
      }
	else if(num5 == 2)
	{
	System.out.println("\t\t\t   _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
	System.out.println("\t\t\t   |    Select The Catagory You Want To Search     |");
	System.out.println("\t\t\t   |   ----------------------------------------    |");
	System.out.println("\t\t\t   |                1.Shirt                        |");
	System.out.println("\t\t\t   |                2.T-Shirt                      |");
	System.out.println("\t\t\t   |                3.Pant                         |");
	System.out.println("\t\t\t   |                4.Sari                         |");
	System.out.println("\t\t\t   |                5.Salwaar Kameez               |");
	System.out.println("\t\t\t   |                6.Exit                         |");
	System.out.println("\t\t\t   - - - - - - - - - - - - - - - - - - - - - - - - -");	
	
	System.out.println();
	System.out.println("\t\t Enter Your Option: ");
	int num6 = sc2.nextInt();
	
	//showing details by catagory by calling showClothesByCatagory method
	if(num6 == 1){ b1.showClothesByCatagory("Shirt");}
	else if(num6 == 2){ b1.showClothesByCatagory("T-Shirt");}
	else if(num6 == 3){ b1.showClothesByCatagory("Pant");}
	else if(num6 == 4){ b1.showClothesByCatagory("Sari");}
	else if(num6 == 5){ b1.showClothesByCatagory("Salwaar Kameez");}
	else if(num6 == 6){num4 = 'y';}
	else {System.out.println("\t\t\t      -------You Entered Wrong Option-------"); }  
	
	}
	
	else if(num5 == 3)
	{
		num4 = 'y';
	}
	
	else 
	{
	System.out.println("\t\t\t      -------You Entered Wrong Option-------");   	
	}
   }
	
    else if(num == 3)
	{
	 num4 = 'y';	
	}	
	
	else 
	{
	System.out.println("\t\t\t      -------You Entered Wrong Option-------");  	
	}
   	 
	System.out.println();
	System.out.println("\t\t\t *********Do You Want To Go To The Main Menu(Y/N)*********");
	num4 = sc3.next().charAt(0);
	while (!(num4 =='Y' || num4 =='y' ||num4 =='N' || num4 =='n')){ //using while to avoid unwanted input
			        System.out.println();
			    	System.out.println("\t\t The Choice is invalid!");
					System.out.println();
			    	System.out.println("\t\t\t *********Do You Want To Go To The Main Menu(Y/N)*********");
	                num4 = sc3.next().charAt(0);
			    }
   }
		
	catch(NullPointerException npe)//catch block for NullPointerException
		{
			System.out.println("\t\t\t\t\t *********Clothe Not Found!*********");
		    System.out.println();
			System.out.println("\t\t\t *********Do You Want To Go Back To The Main Menu(Y/N)*********");
			num4 = sc3.next().charAt(0); 
		}
		
	catch(ArrayIndexOutOfBoundsException aie) //catch block for ArrayIndexOutOfBoundsException
		{
			System.out.println("\t\t\t *********ArrayIndexOutOfBoundsException Occured*********");
			System.out.println();
			System.out.println("\t\t\t *********Do You Want To Go Back To The Main Menu(Y/N)*********");
		    num4 = sc3.next().charAt(0); 
		}
		
	catch(InputMismatchException ime)//catch block for InputMismatchException
		{
			System.out.println("\t\t\t\t *********You Entered Wrong Type Of Input*********");
		    System.out.println();
			num4 = 'n';
		}
		
	 }
   }
}