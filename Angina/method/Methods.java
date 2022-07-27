package method;//declaring package

import classes.sell.Sell;//importing necessary classes

public interface Methods{
	
	//declaring all the methods
	public abstract void AddClothe(Sell s);
	public void RemoveClothe (String uCode3, String name3);
    void showAllClothes ();
    void showClothesByCatagory(String clotheCatagory);
	public abstract void AddNewPieces(String uCode1, String name1, int newPeices);
	public void RemovePieces (String uCode2, String name2, int oldPeices);

}