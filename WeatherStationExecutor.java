class WeatherStationExecutor {

	public static void main(String[] args) {

		WeatherStation ref = new WeatherStation();

		System.out.println("Before invoking stationId: " + ref.stationId);
		ref.stationId = 101;
		System.out.println("After invoking stationId: " + ref.stationId);

		System.out.println("Before invoking location: " + ref.location);
		ref.location = "Airport Area";
		System.out.println("After invoking location: " + ref.location);

		System.out.println("Before invoking temperature: " + ref.temperature);
		ref.temperature = 28.5;
		System.out.println("After invoking temperature: " + ref.temperature);

		System.out.println("Before invoking humidity: " + ref.humidity);
		ref.humidity = 65.2;
		System.out.println("After invoking humidity: " + ref.humidity);

		System.out.println("Before invoking windSpeed: " + ref.windSpeed);
		ref.windSpeed = 12.5;
		System.out.println("After invoking windSpeed: " + ref.windSpeed);

		System.out.println("Before invoking rainfall: " + ref.rainfall);
		ref.rainfall = 5.3;
		System.out.println("After invoking rainfall: " + ref.rainfall);

		System.out.println("Before invoking pressure: " + ref.pressure);
		ref.pressure = 1012.4;
		System.out.println("After invoking pressure: " + ref.pressure);

		System.out.println("Before invoking isOperational: " + ref.isOperational);
		ref.isOperational = true;
		System.out.println("After invoking isOperational: " + ref.isOperational);

		System.out.println("Before invoking stationType: " + ref.stationType);
		ref.stationType = "Automatic";
		System.out.println("After invoking stationType: " + ref.stationType);

		System.out.println("Before invoking installedBy: " + ref.installedBy);
		ref.installedBy = "Meteorological Department";
		System.out.println("After invoking installedBy: " + ref.installedBy);

		System.out.println("Before invoking sensorType: " + ref.sensorType);
		ref.sensorType = "Digital Sensor";
		System.out.println("After invoking sensorType: " + ref.sensorType);

		System.out.println("Before invoking dataTransmission: " + ref.dataTransmission);
		ref.dataTransmission = "Wireless";
		System.out.println("After invoking dataTransmission: " + ref.dataTransmission);

		System.out.println("Before invoking powerSource: " + ref.powerSource);
		ref.powerSource = "Solar";
		System.out.println("After invoking powerSource: " + ref.powerSource);

		System.out.println("Before invoking installationYear: " + ref.installationYear);
		ref.installationYear = 2019;
		System.out.println("After invoking installationYear: " + ref.installationYear);

		System.out.println("Before invoking maintenanceCycle: " + ref.maintenanceCycle);
		ref.maintenanceCycle = 6;
		System.out.println("After invoking maintenanceCycle: " + ref.maintenanceCycle);

		System.out.println("Before invoking sensorCount: " + ref.sensorCount);
		ref.sensorCount = 10;
		System.out.println("After invoking sensorCount: " + ref.sensorCount);

		System.out.println("Before invoking altitude: " + ref.altitude);
		ref.altitude = 920.5;
		System.out.println("After invoking altitude: " + ref.altitude);

		System.out.println("Before invoking latitude: " + ref.latitude);
		ref.latitude = 12.97;
		System.out.println("After invoking latitude: " + ref.latitude);

		System.out.println("Before invoking longitude: " + ref.longitude);
		ref.longitude = 77.59;
		System.out.println("After invoking longitude: " + ref.longitude);

		System.out.println("Before invoking hasSolarPanel: " + ref.hasSolarPanel);
		ref.hasSolarPanel = true;
		System.out.println("After invoking hasSolarPanel: " + ref.hasSolarPanel);

		System.out.println("Before invoking hasBatteryBackup: " + ref.hasBatteryBackup);
		ref.hasBatteryBackup = true;
		System.out.println("After invoking hasBatteryBackup: " + ref.hasBatteryBackup);

		System.out.println("Before invoking hasRainGauge: " + ref.hasRainGauge);
		ref.hasRainGauge = true;
		System.out.println("After invoking hasRainGauge: " + ref.hasRainGauge);

		System.out.println("Before invoking country: " + ref.country);
		ref.country = "India";
		System.out.println("After invoking country: " + ref.country);

		System.out.println("Before invoking region: " + ref.region);
		ref.region = "South India";
		System.out.println("After invoking region: " + ref.region);

		System.out.println("Before invoking city: " + ref.city);
		ref.city = "Bangalore";
		System.out.println("After invoking city: " + ref.city);

	}
}