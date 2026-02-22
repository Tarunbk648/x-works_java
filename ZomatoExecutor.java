class ZomatoExecutor{
public static void main(String[] args){
	String foodName="Burger";
	System.out.print("Location and price details of Burger");
	double items=Zomato.Search(foodName);
	Zomato.getZomatoDetails(items);
	
	System.out.println();
	foodName="Vada";
	System.out.println("Location and price details of Vada");
	items=Zomato.Search(foodName);
	Zomato.getZomatoDetails(items);

	System.out.println();
	foodName="Vada";
	System.out.println("Location and price details of vada is");
	items=Zomato.Search(foodName, 2);
	Zomato.getZomatoDetails(items);
	 
}
}
