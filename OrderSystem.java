class OrderSystem{
   public static void sendToKitchen(String foodname){
       System.out.println("Waiter send recipt to kitchen");
	   Kitechen.receiveOrder("Chicken lolipop");
	   System.out.println("Recipt sending to kitchen");
	   }
	  }