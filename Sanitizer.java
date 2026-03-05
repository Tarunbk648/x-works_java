class Sanitizer {

	int sanitizerId;
	String brand;
	double price;
	int quantity;
	String fragrance;
	boolean isAvailable;
	boolean isAlcoholBased;
	boolean isPocketSize;

	String color;
	String manufacturer;
	String packagingType;
	String usageType;
	String bottleType;

	int manufactureYear;
	int expiryYear;
	int stockQuantity;

	double volume;
	double rating;
	double discount;

	boolean isGel;
	boolean isLiquid;
	boolean isHerbal;

	String countryOfOrigin;
	String batchNumber;
	String ingredient;

	Sanitizer() {
		System.out.println("Constructor in java......Using non-static variables");
	}
}