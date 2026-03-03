class MilitaryHotelExecutor {
	
	public static void main(String[] args) {
		
		MilitaryHotel ref = new MilitaryHotel();
		
		ref.hotelId = 101;
		ref.hotelName = "Sri Military Hotel";
		ref.location = "Bangalore";
		ref.totalTables = 25;
		ref.rating = 4.5;
		ref.isOpen = true;
		ref.isVeg = false;
		ref.hasParking = true;
		
		System.out.println("The hotelId is: " + ref.hotelId);
		System.out.println("The hotelName is: " + ref.hotelName);
		System.out.println("The location is: " + ref.location);
		System.out.println("The totalTables are: " + ref.totalTables);
		System.out.println("The rating is: " + ref.rating);
		System.out.println("Is hotel open: " + ref.isOpen);
		System.out.println("Is Veg hotel: " + ref.isVeg);
		System.out.println("Has parking facility: " + ref.hasParking);
	}
}