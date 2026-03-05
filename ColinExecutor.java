class ColinExecutor {

	public static void main(String[] args) {

		Colin ref = new Colin();

		System.out.println("Before invoking productId: " + ref.productId);
		ref.productId = 301;
		System.out.println("After invoking productId: " + ref.productId);

		System.out.println("Before invoking brand: " + ref.brand);
		ref.brand = "Colin";
		System.out.println("After invoking brand: " + ref.brand);

		System.out.println("Before invoking type: " + ref.type);
		ref.type = "Glass Cleaner";
		System.out.println("After invoking type: " + ref.type);

		System.out.println("Before invoking price: " + ref.price);
		ref.price = 85.50;
		System.out.println("After invoking price: " + ref.price);

		System.out.println("Before invoking quantity: " + ref.quantity);
		ref.quantity = 10;
		System.out.println("After invoking quantity: " + ref.quantity);

		System.out.println("Before invoking isAvailable: " + ref.isAvailable);
		ref.isAvailable = true;
		System.out.println("After invoking isAvailable: " + ref.isAvailable);

		System.out.println("Before invoking isLiquid: " + ref.isLiquid);
		ref.isLiquid = true;
		System.out.println("After invoking isLiquid: " + ref.isLiquid);

		System.out.println("Before invoking isNewStock: " + ref.isNewStock);
		ref.isNewStock = true;
		System.out.println("After invoking isNewStock: " + ref.isNewStock);

		System.out.println("Before invoking fragrance: " + ref.fragrance);
		ref.fragrance = "Lemon";
		System.out.println("After invoking fragrance: " + ref.fragrance);

		System.out.println("Before invoking color: " + ref.color);
		ref.color = "Blue";
		System.out.println("After invoking color: " + ref.color);

		System.out.println("Before invoking manufactureYear: " + ref.manufactureYear);
		ref.manufactureYear = 2024;
		System.out.println("After invoking manufactureYear: " + ref.manufactureYear);

		System.out.println("Before invoking expiryYear: " + ref.expiryYear);
		ref.expiryYear = 2027;
		System.out.println("After invoking expiryYear: " + ref.expiryYear);

		System.out.println("Before invoking bottleSize: " + ref.bottleSize);
		ref.bottleSize = 500;
		System.out.println("After invoking bottleSize: " + ref.bottleSize);

		System.out.println("Before invoking discount: " + ref.discount);
		ref.discount = 10;
		System.out.println("After invoking discount: " + ref.discount);

		System.out.println("Before invoking isSprayBottle: " + ref.isSprayBottle);
		ref.isSprayBottle = true;
		System.out.println("After invoking isSprayBottle: " + ref.isSprayBottle);

		System.out.println("Before invoking isEcoFriendly: " + ref.isEcoFriendly);
		ref.isEcoFriendly = true;
		System.out.println("After invoking isEcoFriendly: " + ref.isEcoFriendly);

		System.out.println("Before invoking isImported: " + ref.isImported);
		ref.isImported = false;
		System.out.println("After invoking isImported: " + ref.isImported);

		System.out.println("Before invoking isRefillable: " + ref.isRefillable);
		ref.isRefillable = true;
		System.out.println("After invoking isRefillable: " + ref.isRefillable);

		System.out.println("Before invoking manufacturerName: " + ref.manufacturerName);
		ref.manufacturerName = "Reckitt";
		System.out.println("After invoking manufacturerName: " + ref.manufacturerName);

		System.out.println("Before invoking supplierName: " + ref.supplierName);
		ref.supplierName = "ABC Traders";
		System.out.println("After invoking supplierName: " + ref.supplierName);

		System.out.println("Before invoking barcode: " + ref.barcode);
		ref.barcode = "CLN458721";
		System.out.println("After invoking barcode: " + ref.barcode);

		System.out.println("Before invoking packagingType: " + ref.packagingType);
		ref.packagingType = "Plastic Bottle";
		System.out.println("After invoking packagingType: " + ref.packagingType);

		System.out.println("Before invoking usageType: " + ref.usageType);
		ref.usageType = "Glass Surface";
		System.out.println("After invoking usageType: " + ref.usageType);

		System.out.println("Before invoking stockRemaining: " + ref.stockRemaining);
		ref.stockRemaining = 50;
		System.out.println("After invoking stockRemaining: " + ref.stockRemaining);

	}
}