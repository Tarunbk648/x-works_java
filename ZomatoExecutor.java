class ZomatoExecutor{
public static void main(String[] args){
	String foodName="Burger";
	System.out.print("Location and price details of Burger");
	String[] items=Zomato.Search(foodName);
	Zomato.getZomatoDetails(items);
	
	System.out.println();
	foodName="Vada";
	System.out.println("Location and price details of Vada");
	items=Zomato.Search(foodName);
	Zomato.getZomatoDetails(items);
	
	System.out.println();
	foodName="coffee";
	System.out.println("Location and price details of Vada");
	items=Zomato.Search(foodName);
	Zomato.getZomatoDetails(items);
	
	System.out.println();
	foodName="rava dose";
	System.out.println("Location and price details of Vada");
	items=Zomato.Search(foodName);
	Zomato.getZomatoDetails(items);
	
	System.out.println();
	foodName="gee rost";
	System.out.println("Location and price details of Vada");
	items=Zomato.Search(foodName);
	Zomato.getZomatoDetails(items);
	
}
}