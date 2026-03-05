class AirportSecuritySystemExecutor {

	public static void main(String[] args) {

		AirportSecuritySystem ref = new AirportSecuritySystem();

		System.out.println("Before invoking systemId: " + ref.systemId);
		ref.systemId = 1001;
		System.out.println("After invoking systemId: " + ref.systemId);

		System.out.println("Before invoking airportName: " + ref.airportName);
		ref.airportName = "Kempegowda International Airport";
		System.out.println("After invoking airportName: " + ref.airportName);

		System.out.println("Before invoking terminalName: " + ref.terminalName);
		ref.terminalName = "Terminal 1";
		System.out.println("After invoking terminalName: " + ref.terminalName);

		System.out.println("Before invoking securityZone: " + ref.securityZone);
		ref.securityZone = "Departure Gate";
		System.out.println("After invoking securityZone: " + ref.securityZone);

		System.out.println("Before invoking controlRoomLocation: " + ref.controlRoomLocation);
		ref.controlRoomLocation = "Main Security Room";
		System.out.println("After invoking controlRoomLocation: " + ref.controlRoomLocation);

		System.out.println("Before invoking isActive: " + ref.isActive);
		ref.isActive = true;
		System.out.println("After invoking isActive: " + ref.isActive);

		System.out.println("Before invoking hasCCTV: " + ref.hasCCTV);
		ref.hasCCTV = true;
		System.out.println("After invoking hasCCTV: " + ref.hasCCTV);

		System.out.println("Before invoking hasBiometricScanner: " + ref.hasBiometricScanner);
		ref.hasBiometricScanner = true;
		System.out.println("After invoking hasBiometricScanner: " + ref.hasBiometricScanner);

		System.out.println("Before invoking hasMetalDetector: " + ref.hasMetalDetector);
		ref.hasMetalDetector = true;
		System.out.println("After invoking hasMetalDetector: " + ref.hasMetalDetector);

		System.out.println("Before invoking hasXRayScanner: " + ref.hasXRayScanner);
		ref.hasXRayScanner = true;
		System.out.println("After invoking hasXRayScanner: " + ref.hasXRayScanner);

		System.out.println("Before invoking securityStaffCount: " + ref.securityStaffCount);
		ref.securityStaffCount = 50;
		System.out.println("After invoking securityStaffCount: " + ref.securityStaffCount);

		System.out.println("Before invoking checkpointCount: " + ref.checkpointCount);
		ref.checkpointCount = 10;
		System.out.println("After invoking checkpointCount: " + ref.checkpointCount);

		System.out.println("Before invoking emergencyExitCount: " + ref.emergencyExitCount);
		ref.emergencyExitCount = 6;
		System.out.println("After invoking emergencyExitCount: " + ref.emergencyExitCount);

		System.out.println("Before invoking scannerSensitivityLevel: " + ref.scannerSensitivityLevel);
		ref.scannerSensitivityLevel = 8.5;
		System.out.println("After invoking scannerSensitivityLevel: " + ref.scannerSensitivityLevel);

		System.out.println("Before invoking cameraResolution: " + ref.cameraResolution);
		ref.cameraResolution = 1080;
		System.out.println("After invoking cameraResolution: " + ref.cameraResolution);

		System.out.println("Before invoking alarmVolumeLevel: " + ref.alarmVolumeLevel);
		ref.alarmVolumeLevel = 90;
		System.out.println("After invoking alarmVolumeLevel: " + ref.alarmVolumeLevel);

		System.out.println("Before invoking surveillanceSoftware: " + ref.surveillanceSoftware);
		ref.surveillanceSoftware = "SecureVision";
		System.out.println("After invoking surveillanceSoftware: " + ref.surveillanceSoftware);

		System.out.println("Before invoking monitoringAgency: " + ref.monitoringAgency);
		ref.monitoringAgency = "Airport Security Force";
		System.out.println("After invoking monitoringAgency: " + ref.monitoringAgency);

		System.out.println("Before invoking operatingCompany: " + ref.operatingCompany);
		ref.operatingCompany = "Airport Authority";
		System.out.println("After invoking operatingCompany: " + ref.operatingCompany);

		System.out.println("Before invoking securityProtocol: " + ref.securityProtocol);
		ref.securityProtocol = "Level 2";
		System.out.println("After invoking securityProtocol: " + ref.securityProtocol);

		System.out.println("Before invoking threatLevel: " + ref.threatLevel);
		ref.threatLevel = "Low";
		System.out.println("After invoking threatLevel: " + ref.threatLevel);

		System.out.println("Before invoking lastInspectionDate: " + ref.lastInspectionDate);
		ref.lastInspectionDate = "01-02-2026";
		System.out.println("After invoking lastInspectionDate: " + ref.lastInspectionDate);

		System.out.println("Before invoking incidentReportCount: " + ref.incidentReportCount);
		ref.incidentReportCount = 3;
		System.out.println("After invoking incidentReportCount: " + ref.incidentReportCount);

		System.out.println("Before invoking hasFireAlarmSystem: " + ref.hasFireAlarmSystem);
		ref.hasFireAlarmSystem = true;
		System.out.println("After invoking hasFireAlarmSystem: " + ref.hasFireAlarmSystem);

		System.out.println("Before invoking hasFacialRecognition: " + ref.hasFacialRecognition);
		ref.hasFacialRecognition = true;
		System.out.println("After invoking hasFacialRecognition: " + ref.hasFacialRecognition);

	}
}