class OnlineShoppingApp{
  public static void main(String[] args){
	String appName="Shop Easy";
	String appFounder="Ankit";
	int launchYear=2008;
	String categories[]= {"Electronics", "Fashion", "Groceries"};
	double discounts[]={10.3, 25.0, 15.0};
	
	System.out.println("Application name:" +appName);
	System.out.println("Application Founder:" +appFounder);
	System.out.println("Application Launch year:" +launchYear);
	
	System.out.println();
	int cat=categories.length;
	System.out.println("Application Categories:" +cat);
	for(String categorie:categories){
		System.out.println(categorie);
	}
	
	System.out.println();
	double dis=discounts.length;
	System.out.println("Product Discounts:" +dis);
	for(double discount:discounts){
		System.out.println(discount);
	}
  }
 }