class MobileStore{
  public static void main(String[] args){
	 String shopName="Mobile World";
	 String ownerName="Suresh";
	 String location="Rajajinagar";
	 String brands[]={"Samsung", "Vivo", "Oppo", "Mi"};
	 int prices[]={16000, 27000, 39000, 78000};
	 
	 System.out.println("Shop name:" +shopName);
	 System.out.println("Owner name:" +ownerName);
	 System.out.println("Shop location:" +location);
	 
	 System.out.println();
	 int brand=brands.length;
	 System.out.println("Available brands:" +brand);
	 for(String bran:brands){
		System.out.println(bran);
	}
	 
	System.out.println();
	int pric=prices.length;
	System.out.println("Price list:" +pric);
	for(int price:prices){
		System.out.println(price);
	}
  }
 }