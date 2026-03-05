class ElectricVehicleChargingStation {

	int stationId;
	String stationName;
	String location;
	String operatorName;
	String connectorType;

	double chargingPower;
	double pricePerKwh;
	double voltage;
	double current;

	boolean isOperational;
	boolean supportsFastCharging;
	boolean hasSolarPanels;
	boolean hasParkingSpace;

	int chargerCount;
	int availableChargers;
	int occupiedChargers;

	String paymentMethod;
	String networkProvider;
	String installationDate;

	double energyDeliveredToday;
	double energyDeliveredTotal;

	String city;
	String country;
	double rating;
	boolean hasAppSupport;

	ElectricVehicleChargingStation(){
		System.out.println("Constructor in java......Using non-static variables");
	}
}