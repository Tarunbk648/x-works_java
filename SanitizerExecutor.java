class SanitizerExecutor {

	public static void main(String[] args) {

		Sanitizer ref = new Sanitizer();

		ref.sanitizerId = 901;
		ref.brand = "Dettol";
		ref.price = 99.0;
		ref.quantity = 3;
		ref.fragrance = "Lemon";
		ref.isAvailable = true;
		ref.isAlcoholBased = true;
		ref.isPocketSize = true;

		System.out.println("The sanitizerId is: " + ref.sanitizerId);
		System.out.println("The brand is: " + ref.brand);
		System.out.println("The price is: " + ref.price);
		System.out.println("The quantity is: " + ref.quantity);
		System.out.println("The fragrance is: " + ref.fragrance);
		System.out.println("Is available: " + ref.isAvailable);
		System.out.println("Is alcohol based: " + ref.isAlcoholBased);
		System.out.println("Is pocket size: " + ref.isPocketSize);
	}
}