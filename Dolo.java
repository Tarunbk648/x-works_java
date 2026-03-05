class Dolo {

	int medicineId;
	String medicineName;
	double price;
	String expiryDate;
	int quantity;
	boolean isAvailable;
	boolean isTablet;
	boolean requiresPrescription;

	String manufacturer;
	int manufactureYear;
	String batchNumber;
	double dosageMg;
	String packagingType;

	boolean isPainReliever;
	boolean isFeverReducer;
	boolean isAntibiotic;
	boolean isSafeForChildren;

	String storageCondition;
	String color;
	String shape;
	String composition;

	int tabletsPerStrip;
	int stripsPerBox;
	double rating;
	String countryOfOrigin;

	Dolo() {
		System.out.println("Constructor in java......Using non-static variables");
	}
}