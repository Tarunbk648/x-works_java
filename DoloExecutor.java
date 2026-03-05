class DoloExecutor {

	public static void main(String[] args) {

		Dolo ref = new Dolo();

		System.out.println("Before invoking medicineId: " + ref.medicineId);
		ref.medicineId = 501;
		System.out.println("After invoking medicineId: " + ref.medicineId);

		System.out.println("Before invoking medicineName: " + ref.medicineName);
		ref.medicineName = "Dolo 650";
		System.out.println("After invoking medicineName: " + ref.medicineName);

		System.out.println("Before invoking price: " + ref.price);
		ref.price = 30.0;
		System.out.println("After invoking price: " + ref.price);

		System.out.println("Before invoking expiryDate: " + ref.expiryDate);
		ref.expiryDate = "12-2026";
		System.out.println("After invoking expiryDate: " + ref.expiryDate);

		System.out.println("Before invoking quantity: " + ref.quantity);
		ref.quantity = 20;
		System.out.println("After invoking quantity: " + ref.quantity);

		System.out.println("Before invoking isAvailable: " + ref.isAvailable);
		ref.isAvailable = true;
		System.out.println("After invoking isAvailable: " + ref.isAvailable);

		System.out.println("Before invoking isTablet: " + ref.isTablet);
		ref.isTablet = true;
		System.out.println("After invoking isTablet: " + ref.isTablet);

		System.out.println("Before invoking requiresPrescription: " + ref.requiresPrescription);
		ref.requiresPrescription = false;
		System.out.println("After invoking requiresPrescription: " + ref.requiresPrescription);

		System.out.println("Before invoking manufacturer: " + ref.manufacturer);
		ref.manufacturer = "Micro Labs";
		System.out.println("After invoking manufacturer: " + ref.manufacturer);

		System.out.println("Before invoking manufactureYear: " + ref.manufactureYear);
		ref.manufactureYear = 2024;
		System.out.println("After invoking manufactureYear: " + ref.manufactureYear);

		System.out.println("Before invoking batchNumber: " + ref.batchNumber);
		ref.batchNumber = "DL12345";
		System.out.println("After invoking batchNumber: " + ref.batchNumber);

		System.out.println("Before invoking dosageMg: " + ref.dosageMg);
		ref.dosageMg = 650;
		System.out.println("After invoking dosageMg: " + ref.dosageMg);

		System.out.println("Before invoking packagingType: " + ref.packagingType);
		ref.packagingType = "Strip";
		System.out.println("After invoking packagingType: " + ref.packagingType);

		System.out.println("Before invoking isPainReliever: " + ref.isPainReliever);
		ref.isPainReliever = true;
		System.out.println("After invoking isPainReliever: " + ref.isPainReliever);

		System.out.println("Before invoking isFeverReducer: " + ref.isFeverReducer);
		ref.isFeverReducer = true;
		System.out.println("After invoking isFeverReducer: " + ref.isFeverReducer);

		System.out.println("Before invoking isAntibiotic: " + ref.isAntibiotic);
		ref.isAntibiotic = false;
		System.out.println("After invoking isAntibiotic: " + ref.isAntibiotic);

		System.out.println("Before invoking isSafeForChildren: " + ref.isSafeForChildren);
		ref.isSafeForChildren = true;
		System.out.println("After invoking isSafeForChildren: " + ref.isSafeForChildren);

		System.out.println("Before invoking storageCondition: " + ref.storageCondition);
		ref.storageCondition = "Cool and Dry Place";
		System.out.println("After invoking storageCondition: " + ref.storageCondition);

		System.out.println("Before invoking color: " + ref.color);
		ref.color = "White";
		System.out.println("After invoking color: " + ref.color);

		System.out.println("Before invoking shape: " + ref.shape);
		ref.shape = "Round";
		System.out.println("After invoking shape: " + ref.shape);

		System.out.println("Before invoking composition: " + ref.composition);
		ref.composition = "Paracetamol";
		System.out.println("After invoking composition: " + ref.composition);

		System.out.println("Before invoking tabletsPerStrip: " + ref.tabletsPerStrip);
		ref.tabletsPerStrip = 10;
		System.out.println("After invoking tabletsPerStrip: " + ref.tabletsPerStrip);

		System.out.println("Before invoking stripsPerBox: " + ref.stripsPerBox);
		ref.stripsPerBox = 5;
		System.out.println("After invoking stripsPerBox: " + ref.stripsPerBox);

		System.out.println("Before invoking rating: " + ref.rating);
		ref.rating = 4.7;
		System.out.println("After invoking rating: " + ref.rating);

		System.out.println("Before invoking countryOfOrigin: " + ref.countryOfOrigin);
		ref.countryOfOrigin = "India";
		System.out.println("After invoking countryOfOrigin: " + ref.countryOfOrigin);

	}
}