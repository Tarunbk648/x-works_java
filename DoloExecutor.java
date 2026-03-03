class DoloExecutor {

	public static void main(String[] args) {

		Dolo ref = new Dolo();

		ref.medicineId = 501;
		ref.medicineName = "Dolo 650";
		ref.price = 30.0;
		ref.expiryDate = "12-2026";
		ref.quantity = 20;
		ref.isAvailable = true;
		ref.isTablet = true;
		ref.requiresPrescription = false;

		System.out.println("The medicineId is: " + ref.medicineId);
		System.out.println("The medicineName is: " + ref.medicineName);
		System.out.println("The price is: " + ref.price);
		System.out.println("The expiryDate is: " + ref.expiryDate);
		System.out.println("The quantity is: " + ref.quantity);
		System.out.println("Is available: " + ref.isAvailable);
		System.out.println("Is tablet: " + ref.isTablet);
		System.out.println("Requires prescription: " + ref.requiresPrescription);
	}
}