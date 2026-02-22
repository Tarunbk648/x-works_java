//Method overloading

class FoodDeliveryPage{
   public static String[] getDeliverDetailes(String username, String location){
            String[] deliveryDetails={username, location};
			System.out.println("The username and location of user is:");
			for(String deliveryDetail:deliveryDetails){
				System.out.println(deliveryDetail);
			}
			return deliveryDetails;
   }
	public static String[] getDeliverDetailes(double price, String foodname){
			String[] deliveryDetails={String.valueOf(price), foodname};
			System.out.println("The ordered foodname and price of food:");
			for(String deliveryDetail: deliveryDetails){
			    System.out.println(deliveryDetail);
			}
			return deliveryDetails;
	}
public static void main(String[] args){
    FoodDeliveryPage.getDeliverDetailes("Tarun", "Rajajinagar");
	FoodDeliveryPage.getDeliverDetailes(114.45, "Chicken Sausage");
  }
}
    