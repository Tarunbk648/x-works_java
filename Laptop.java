class Laptop {

	int laptopId;
	String brand;
	String model;
	double price;
	String processor;
	int ram;
	int storage;
	String color;

	double screenSize;
	double weight;

	boolean isTouchScreen;
	boolean hasBacklitKeyboard;
	boolean hasFingerprint;
	boolean hasWebcam;

	String operatingSystem;
	String graphicsCard;
	String batteryType;
	String chargerType;

	int warrantyYears;
	int manufactureYear;

	String countryOfOrigin;
	String keyboardType;
	String buildMaterial;

	double rating;
	int stock;

	Laptop(){
		System.out.println("Constructor using non static variables");
	}
}