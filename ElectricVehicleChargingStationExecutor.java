class ElectricVehicleChargingStationExecutor {

	public static void main(String[] args) {

		ElectricVehicleChargingStation ref = new ElectricVehicleChargingStation();

		System.out.println("Before invoking stationId: " + ref.stationId);
		ref.stationId = 1101;
		System.out.println("After invoking stationId: " + ref.stationId);

		System.out.println("Before invoking stationName: " + ref.stationName);
		ref.stationName = "GreenCharge Station";
		System.out.println("After invoking stationName: " + ref.stationName);

		System.out.println("Before invoking location: " + ref.location);
		ref.location = "MG Road";
		System.out.println("After invoking location: " + ref.location);

		System.out.println("Before invoking operatorName: " + ref.operatorName);
		ref.operatorName = "EV Power Ltd";
		System.out.println("After invoking operatorName: " + ref.operatorName);

		System.out.println("Before invoking connectorType: " + ref.connectorType);
		ref.connectorType = "CCS";
		System.out.println("After invoking connectorType: " + ref.connectorType);

		System.out.println("Before invoking chargingPower: " + ref.chargingPower);
		ref.chargingPower = 60;
		System.out.println("After invoking chargingPower: " + ref.chargingPower);

		System.out.println("Before invoking pricePerKwh: " + ref.pricePerKwh);
		ref.pricePerKwh = 18.5;
		System.out.println("After invoking pricePerKwh: " + ref.pricePerKwh);

		System.out.println("Before invoking voltage: " + ref.voltage);
		ref.voltage = 400;
		System.out.println("After invoking voltage: " + ref.voltage);

		System.out.println("Before invoking current: " + ref.current);
		ref.current = 150;
		System.out.println("After invoking current: " + ref.current);

		System.out.println("Before invoking isOperational: " + ref.isOperational);
		ref.isOperational = true;
		System.out.println("After invoking isOperational: " + ref.isOperational);

		System.out.println("Before invoking supportsFastCharging: " + ref.supportsFastCharging);
		ref.supportsFastCharging = true;
		System.out.println("After invoking supportsFastCharging: " + ref.supportsFastCharging);

		System.out.println("Before invoking hasSolarPanels: " + ref.hasSolarPanels);
		ref.hasSolarPanels = false;
		System.out.println("After invoking hasSolarPanels: " + ref.hasSolarPanels);

		System.out.println("Before invoking hasParkingSpace: " + ref.hasParkingSpace);
		ref.hasParkingSpace = true;
		System.out.println("After invoking hasParkingSpace: " + ref.hasParkingSpace);

		System.out.println("Before invoking chargerCount: " + ref.chargerCount);
		ref.chargerCount = 10;
		System.out.println("After invoking chargerCount: " + ref.chargerCount);

		System.out.println("Before invoking availableChargers: " + ref.availableChargers);
		ref.availableChargers = 6;
		System.out.println("After invoking availableChargers: " + ref.availableChargers);

		System.out.println("Before invoking occupiedChargers: " + ref.occupiedChargers);
		ref.occupiedChargers = 4;
		System.out.println("After invoking occupiedChargers: " + ref.occupiedChargers);

		System.out.println("Before invoking paymentMethod: " + ref.paymentMethod);
		ref.paymentMethod = "UPI/Card";
		System.out.println("After invoking paymentMethod: " + ref.paymentMethod);

		System.out.println("Before invoking networkProvider: " + ref.networkProvider);
		ref.networkProvider = "ChargeNet";
		System.out.println("After invoking networkProvider: " + ref.networkProvider);

		System.out.println("Before invoking installationDate: " + ref.installationDate);
		ref.installationDate = "10-01-2024";
		System.out.println("After invoking installationDate: " + ref.installationDate);

		System.out.println("Before invoking energyDeliveredToday: " + ref.energyDeliveredToday);
		ref.energyDeliveredToday = 450;
		System.out.println("After invoking energyDeliveredToday: " + ref.energyDeliveredToday);

		System.out.println("Before invoking energyDeliveredTotal: " + ref.energyDeliveredTotal);
		ref.energyDeliveredTotal = 25000;
		System.out.println("After invoking energyDeliveredTotal: " + ref.energyDeliveredTotal);

		System.out.println("Before invoking city: " + ref.city);
		ref.city = "Bangalore";
		System.out.println("After invoking city: " + ref.city);

		System.out.println("Before invoking country: " + ref.country);
		ref.country = "India";
		System.out.println("After invoking country: " + ref.country);

		System.out.println("Before invoking rating: " + ref.rating);
		ref.rating = 4.4;
		System.out.println("After invoking rating: " + ref.rating);

		System.out.println("Before invoking hasAppSupport: " + ref.hasAppSupport);
		ref.hasAppSupport = true;
		System.out.println("After invoking hasAppSupport: " + ref.hasAppSupport);

	}
}