//Method overloading

class SubcriptionPage{
   public static String getdetails(String username){
	      System.out.println("The name of subscriber is:");
          return username;
		 }
	public static String[] getdetails(String username, String location, int price){
			System.out.println("Subscriber subscription details like name, location and password:");
			String[] details={username, location, String.valueOf(price)};
			for(String detail:details)
				System.out.println(detail);
     		return details;
			}
	public static void main(String[] args){
	      System.out.println(SubcriptionPage.getdetails("Tarun"));
		  SubcriptionPage.getdetails("Tarun", "Rajajinagar", 3000);
		 }
	}