class BunExecutor{
 public static void main(String[] args){
	Bun b = new Bun();
	
	String brand = "devs";
	b.brand=brand;
	System.out.println("The brand of a bun is:" +b.brand);
	
	String flavor = "Chocolate";
	b.flavor = flavor;
	System.out.println("The flavor of bun is:" +b.flavor);
	
	double price = 12;
	b.price = price;
	System.out.println("The price of single bun is:" +b.price);
	
	double weight= 14;
	b.weight = weight;
	System.out.println("The weight of single bun in grams:" +b.weight);
	
	String shape="circle";
	b.shape = shape;
	System.out.println("The shape of a bun is:" +b.shape);
	
	boolean fresh= true;
	b.fresh=fresh;
	System.out.println("Status of a bun is:" +b.fresh);
	
	String manufacturer= "BunBold";
	b.manufacturer = manufacturer;
	System.out.println("Manufacturer status of bun is:" +b.manufacturer);
	
	String expiryDate="22-03-2026";
	b.expiryDate=expiryDate;
	System.out.println("Expiration date of bun is:" +b.expiryDate);
	
	int quantity = 500;
	b.quantity = quantity;
	System.out.println("The quantity of bun is:" +b.quantity);
	
	String packaging = "plastic foil";
	b.packaging = packaging;
	System.out.println("The packaging status of bun is:" +b.packaging);
	
	String[] ingredients = {"Maida", "curd", "jeera", "oil", "water"};
	System.out.println("The ingredients list of bun is:");
	b.ingredients= ingredients;
	for(String lists: b.ingredients){
		System.out.println(lists + " ");
	}
	
	String[] outletNames = {"Rajajinagar", "Vijayanagar", "Yelahanka", "Devanahalli"};
	System.out.println("The bun outlets in:" );
	b.outletNames=outletNames;
	for(String lists: b.outletNames){
		System.out.println(lists + " ");
	}
	
}
}