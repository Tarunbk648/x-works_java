class Waiter{
  public static void takeOrder(String foodname){
      System.out.println("Waiter take the order");
	  System.out.println("Guest order food is:" +foodname);
	  OrderSystem.sendToKitchen("chicken lolipop");
	  System.out.println("Waiter task is done");
	 }
	}
  