class AirportSecuritySystem {

	int systemId;
	String airportName;
	String terminalName;
	String securityZone;
	String controlRoomLocation;

	boolean isActive;
	boolean hasCCTV;
	boolean hasBiometricScanner;
	boolean hasMetalDetector;
	boolean hasXRayScanner;

	int securityStaffCount;
	int checkpointCount;
	int emergencyExitCount;

	double scannerSensitivityLevel;
	double cameraResolution;
	double alarmVolumeLevel;

	String surveillanceSoftware;
	String monitoringAgency;
	String operatingCompany;

	String securityProtocol;
	String threatLevel;
	String lastInspectionDate;

	int incidentReportCount;
	boolean hasFireAlarmSystem;
	boolean hasFacialRecognition;

	AirportSecuritySystem(){
		System.out.println("Constructor in java......Using non-static variables");
	}
}