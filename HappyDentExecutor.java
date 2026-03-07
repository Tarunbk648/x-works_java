class HappyDentExecutor{
 public static void main(String[] args){
	HappyDent hd = new HappyDent();
	
	String brand = "Dental Fresh";
	hd.brand=brand;
	System.out.println("The brand of happy dent is:" +hd.brand);
	
	String flavor = "Sweet";
	hd.flavor = flavor;
	System.out.println("The flavor of happy dent is:" +hd.flavor);
	
	double price=1.0;
	hd.price=price;
	System.out.println("The price of happy dent is:" +hd.price);
	
	int quantity=1;
	hd.quantity=quantity;
	System.out.println("The per qunatity of happy dent is:" +hd.quantity);
	
	boolean sugarFree=false;
	hd.sugarFree=sugarFree;
	System.out.println("The status of sugar in a happy dent is:" +hd.sugarFree);
	
	String manufacturer="Happy fresh";
	hd.manufacturer=manufacturer;
	System.out.println("The manufacturer of happy dent is:" +hd.manufacturer);
	
	String[] ingredients={"color", "pink jelly", "sugar"};
	System.out.println("The ingredients lists of happy dent is: ");
	hd.ingredients=ingredients;
	for(String lists: hd.ingredients){
		System.out.println(lists + " ");
	}
	
	String[] availableCities={"Rajajinagar", "Yelahanka", "Devanahalli"};
	System.out.println("The available cities are:");
	hd.availableCities=availableCities;
	for(String lists: availableCities){
		System.out.println(lists + " ");
	}
	
 }
 }