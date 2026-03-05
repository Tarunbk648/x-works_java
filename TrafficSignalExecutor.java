class TrafficSignalExecutor{

	public static void main(String[] args){

		TrafficSignal ref=new TrafficSignal();

		System.out.println("Before invoking signalId: "+ref.signalId);
		ref.signalId=1;
		System.out.println("After invoking signalId: "+ref.signalId);

		System.out.println("Before invoking location: "+ref.location);
		ref.location="MG Road";
		System.out.println("After invoking location: "+ref.location);

		System.out.println("Before invoking redDuration: "+ref.redDuration);
		ref.redDuration=60;
		System.out.println("After invoking redDuration: "+ref.redDuration);

		System.out.println("Before invoking yellowDuration: "+ref.yellowDuration);
		ref.yellowDuration=5;
		System.out.println("After invoking yellowDuration: "+ref.yellowDuration);

		System.out.println("Before invoking greenDuration: "+ref.greenDuration);
		ref.greenDuration=40;
		System.out.println("After invoking greenDuration: "+ref.greenDuration);

		System.out.println("Before invoking hasCamera: "+ref.hasCamera);
		ref.hasCamera=true;
		System.out.println("After invoking hasCamera: "+ref.hasCamera);

		System.out.println("Before invoking hasSensor: "+ref.hasSensor);
		ref.hasSensor=true;
		System.out.println("After invoking hasSensor: "+ref.hasSensor);

		System.out.println("Before invoking isOperational: "+ref.isOperational);
		ref.isOperational=true;
		System.out.println("After invoking isOperational: "+ref.isOperational);

		System.out.println("Before invoking areaName: "+ref.areaName);
		ref.areaName="Central";
		System.out.println("After invoking areaName: "+ref.areaName);

		System.out.println("Before invoking signalType: "+ref.signalType);
		ref.signalType="Automatic";
		System.out.println("After invoking signalType: "+ref.signalType);

		System.out.println("Before invoking installedBy: "+ref.installedBy);
		ref.installedBy="City Corporation";
		System.out.println("After invoking installedBy: "+ref.installedBy);

		System.out.println("Before invoking powerSource: "+ref.powerSource);
		ref.powerSource="Electric";
		System.out.println("After invoking powerSource: "+ref.powerSource);

		System.out.println("Before invoking controllerType: "+ref.controllerType);
		ref.controllerType="Digital";
		System.out.println("After invoking controllerType: "+ref.controllerType);

		System.out.println("Before invoking installationYear: "+ref.installationYear);
		ref.installationYear=2020;
		System.out.println("After invoking installationYear: "+ref.installationYear);

		System.out.println("Before invoking maintenanceInterval: "+ref.maintenanceInterval);
		ref.maintenanceInterval=6;
		System.out.println("After invoking maintenanceInterval: "+ref.maintenanceInterval);

		System.out.println("Before invoking laneCount: "+ref.laneCount);
		ref.laneCount=4;
		System.out.println("After invoking laneCount: "+ref.laneCount);

		System.out.println("Before invoking voltage: "+ref.voltage);
		ref.voltage=220;
		System.out.println("After invoking voltage: "+ref.voltage);

		System.out.println("Before invoking brightnessLevel: "+ref.brightnessLevel);
		ref.brightnessLevel=90;
		System.out.println("After invoking brightnessLevel: "+ref.brightnessLevel);

		System.out.println("Before invoking rating: "+ref.rating);
		ref.rating=4.2;
		System.out.println("After invoking rating: "+ref.rating);

		System.out.println("Before invoking hasTimerDisplay: "+ref.hasTimerDisplay);
		ref.hasTimerDisplay=true;
		System.out.println("After invoking hasTimerDisplay: "+ref.hasTimerDisplay);

		System.out.println("Before invoking hasPedestrianButton: "+ref.hasPedestrianButton);
		ref.hasPedestrianButton=true;
		System.out.println("After invoking hasPedestrianButton: "+ref.hasPedestrianButton);

		System.out.println("Before invoking isSolarPowered: "+ref.isSolarPowered);
		ref.isSolarPowered=false;
		System.out.println("After invoking isSolarPowered: "+ref.isSolarPowered);

		System.out.println("Before invoking country: "+ref.country);
		ref.country="India";
		System.out.println("After invoking country: "+ref.country);

		System.out.println("Before invoking city: "+ref.city);
		ref.city="Bangalore";
		System.out.println("After invoking city: "+ref.city);

		System.out.println("Before invoking junctionName: "+ref.junctionName);
		ref.junctionName="Brigade Junction";
		System.out.println("After invoking junctionName: "+ref.junctionName);

	}
}