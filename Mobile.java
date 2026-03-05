class Mobile{

	int mobileId;
	String brand;
	String model;
	double price;
	String processor;
	int ram;
	int storage;
	String color;

	double screenSize;
	int batteryCapacity;

	boolean has5G;
	boolean hasFingerprint;
	boolean hasFaceUnlock;
	boolean isWaterProof;

	String operatingSystem;
	String cameraType;
	String chargerType;
	String simType;

	int manufactureYear;
	int warrantyYears;

	String countryOfOrigin;
	String buildMaterial;
	String speakerType;

	double rating;
	int stock;

	Mobile(){
		System.out.println("Constructor using non static variables");
	}
}