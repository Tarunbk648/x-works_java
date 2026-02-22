//Method overloading

class PayingGuestPage{
   public static String[] getDetails(String location, int blocknumber){
			String[] details={location, String.valueOf(blocknumber)};
			System.out.println("The location and blocknumber of pg is:");
			for(String detail:details)
				System.out.println(detail);
			return details;
		}
	public static double[] getDetails(double advance, double rent){
	          double[] details={advance, rent};
			  System.out.println("The advance and the rent amount of pg are:");
			  for(double detail:details)
				System.out.println(detail);
			  return details;
		 }
	public static void main(String[] args){
	     PayingGuestPage.getDetails("Rajajinagar",3);
		 PayingGuestPage.getDetails(2000.00, 7500.00);
		}
	}