class TrafficSignal{

	int signalId;
	String location;
	int redDuration;
	int yellowDuration;
	int greenDuration;
	boolean hasCamera;
	boolean hasSensor;
	boolean isOperational;

	String areaName;
	String signalType;
	String installedBy;
	String powerSource;
	String controllerType;

	int installationYear;
	int maintenanceInterval;
	int laneCount;

	double voltage;
	double brightnessLevel;
	double rating;

	boolean hasTimerDisplay;
	boolean hasPedestrianButton;
	boolean isSolarPowered;

	String country;
	String city;
	String junctionName;

	TrafficSignal(){
		System.out.println("Constructor using non static variables");
	}
}