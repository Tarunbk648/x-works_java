class WeatherStation{

	int stationId;
	String location;
	double temperature;
	double humidity;
	double windSpeed;
	double rainfall;
	double pressure;
	boolean isOperational;

	String stationType;
	String installedBy;
	String sensorType;
	String dataTransmission;
	String powerSource;

	int installationYear;
	int maintenanceCycle;
	int sensorCount;

	double altitude;
	double latitude;
	double longitude;

	boolean hasSolarPanel;
	boolean hasBatteryBackup;
	boolean hasRainGauge;

	String country;
	String region;
	String city;

	WeatherStation(){
		System.out.println("Constructor using non static variables");
	}
}