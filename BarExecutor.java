class BarExecutor {

	public static void main(String[] args) {

		Bar ref = new Bar();

		ref.barId = 201;
		ref.barName = "Sky Lounge";
		ref.location = "Mysore";
		ref.totalStaff = 15;
		ref.rating = 4.2;
		ref.isOpen = true;
		ref.servesAlcohol = true;
		ref.hasDanceFloor = false;

		System.out.println("The barId is: " + ref.barId);
		System.out.println("The barName is: " + ref.barName);
		System.out.println("The location is: " + ref.location);
		System.out.println("The totalStaff is: " + ref.totalStaff);
		System.out.println("The rating is: " + ref.rating);
		System.out.println("Is bar open: " + ref.isOpen);
		System.out.println("Serves alcohol: " + ref.servesAlcohol);
		System.out.println("Has dance floor: " + ref.hasDanceFloor);
	}
}