class SanitizerExecutor {

	public static void main(String[] args) {

		Sanitizer ref = new Sanitizer();

		System.out.println("Before invoking sanitizerId: " + ref.sanitizerId);
		ref.sanitizerId = 901;
		System.out.println("After invoking sanitizerId: " + ref.sanitizerId);

		System.out.println("Before invoking brand: " + ref.brand);
		ref.brand = "Dettol";
		System.out.println("After invoking brand: " + ref.brand);

		System.out.println("Before invoking price: " + ref.price);
		ref.price = 75.0;
		System.out.println("After invoking price: " + ref.price);

		System.out.println("Before invoking quantity: " + ref.quantity);
		ref.quantity = 10;
		System.out.println("After invoking quantity: " + ref.quantity);

		System.out.println("Before invoking fragrance: " + ref.fragrance);
		ref.fragrance = "Lemon";
		System.out.println("After invoking fragrance: " + ref.fragrance);

		System.out.println("Before invoking isAvailable: " + ref.isAvailable);
		ref.isAvailable = true;
		System.out.println("After invoking isAvailable: " + ref.isAvailable);

		System.out.println("Before invoking isAlcoholBased: " + ref.isAlcoholBased);
		ref.isAlcoholBased = true;
		System.out.println("After invoking isAlcoholBased: " + ref.isAlcoholBased);

		System.out.println("Before invoking isPocketSize: " + ref.isPocketSize);
		ref.isPocketSize = true;
		System.out.println("After invoking isPocketSize: " + ref.isPocketSize);

		System.out.println("Before invoking color: " + ref.color);
		ref.color = "Transparent";
		System.out.println("After invoking color: " + ref.color);

		System.out.println("Before invoking manufacturer: " + ref.manufacturer);
		ref.manufacturer = "Reckitt";
		System.out.println("After invoking manufacturer: " + ref.manufacturer);

		System.out.println("Before invoking packagingType: " + ref.packagingType);
		ref.packagingType = "Bottle";
		System.out.println("After invoking packagingType: " + ref.packagingType);

		System.out.println("Before invoking usageType: " + ref.usageType);
		ref.usageType = "Hand Cleaning";
		System.out.println("After invoking usageType: " + ref.usageType);

		System.out.println("Before invoking bottleType: " + ref.bottleType);
		ref.bottleType = "Pump";
		System.out.println("After invoking bottleType: " + ref.bottleType);

		System.out.println("Before invoking manufactureYear: " + ref.manufactureYear);
		ref.manufactureYear = 2024;
		System.out.println("After invoking manufactureYear: " + ref.manufactureYear);

		System.out.println("Before invoking expiryYear: " + ref.expiryYear);
		ref.expiryYear = 2027;
		System.out.println("After invoking expiryYear: " + ref.expiryYear);

		System.out.println("Before invoking stockQuantity: " + ref.stockQuantity);
		ref.stockQuantity = 50;
		System.out.println("After invoking stockQuantity: " + ref.stockQuantity);

		System.out.println("Before invoking volume: " + ref.volume);
		ref.volume = 100;
		System.out.println("After invoking volume: " + ref.volume);

		System.out.println("Before invoking rating: " + ref.rating);
		ref.rating = 4.5;
		System.out.println("After invoking rating: " + ref.rating);

		System.out.println("Before invoking discount: " + ref.discount);
		ref.discount = 10;
		System.out.println("After invoking discount: " + ref.discount);

		System.out.println("Before invoking isGel: " + ref.isGel);
		ref.isGel = true;
		System.out.println("After invoking isGel: " + ref.isGel);

		System.out.println("Before invoking isLiquid: " + ref.isLiquid);
		ref.isLiquid = false;
		System.out.println("After invoking isLiquid: " + ref.isLiquid);

		System.out.println("Before invoking isHerbal: " + ref.isHerbal);
		ref.isHerbal = false;
		System.out.println("After invoking isHerbal: " + ref.isHerbal);

		System.out.println("Before invoking countryOfOrigin: " + ref.countryOfOrigin);
		ref.countryOfOrigin = "India";
		System.out.println("After invoking countryOfOrigin: " + ref.countryOfOrigin);

		System.out.println("Before invoking batchNumber: " + ref.batchNumber);
		ref.batchNumber = "SAN4589";
		System.out.println("After invoking batchNumber: " + ref.batchNumber);

		System.out.println("Before invoking ingredient: " + ref.ingredient);
		ref.ingredient = "Alcohol";
		System.out.println("After invoking ingredient: " + ref.ingredient);

	}
}