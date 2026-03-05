class MobileExecutor {

	public static void main(String[] args) {

		Mobile ref = new Mobile();

		System.out.println("Before invoking mobileId: " + ref.mobileId);
		ref.mobileId = 1001;
		System.out.println("After invoking mobileId: " + ref.mobileId);

		System.out.println("Before invoking brand: " + ref.brand);
		ref.brand = "Samsung";
		System.out.println("After invoking brand: " + ref.brand);

		System.out.println("Before invoking model: " + ref.model);
		ref.model = "Galaxy S23";
		System.out.println("After invoking model: " + ref.model);

		System.out.println("Before invoking price: " + ref.price);
		ref.price = 75000;
		System.out.println("After invoking price: " + ref.price);

		System.out.println("Before invoking processor: " + ref.processor);
		ref.processor = "Snapdragon";
		System.out.println("After invoking processor: " + ref.processor);

		System.out.println("Before invoking ram: " + ref.ram);
		ref.ram = 12;
		System.out.println("After invoking ram: " + ref.ram);

		System.out.println("Before invoking storage: " + ref.storage);
		ref.storage = 256;
		System.out.println("After invoking storage: " + ref.storage);

		System.out.println("Before invoking color: " + ref.color);
		ref.color = "Black";
		System.out.println("After invoking color: " + ref.color);

		System.out.println("Before invoking screenSize: " + ref.screenSize);
		ref.screenSize = 6.5;
		System.out.println("After invoking screenSize: " + ref.screenSize);

		System.out.println("Before invoking batteryCapacity: " + ref.batteryCapacity);
		ref.batteryCapacity = 5000;
		System.out.println("After invoking batteryCapacity: " + ref.batteryCapacity);

		System.out.println("Before invoking has5G: " + ref.has5G);
		ref.has5G = true;
		System.out.println("After invoking has5G: " + ref.has5G);

		System.out.println("Before invoking hasFingerprint: " + ref.hasFingerprint);
		ref.hasFingerprint = true;
		System.out.println("After invoking hasFingerprint: " + ref.hasFingerprint);

		System.out.println("Before invoking hasFaceUnlock: " + ref.hasFaceUnlock);
		ref.hasFaceUnlock = true;
		System.out.println("After invoking hasFaceUnlock: " + ref.hasFaceUnlock);

		System.out.println("Before invoking isWaterProof: " + ref.isWaterProof);
		ref.isWaterProof = true;
		System.out.println("After invoking isWaterProof: " + ref.isWaterProof);

		System.out.println("Before invoking operatingSystem: " + ref.operatingSystem);
		ref.operatingSystem = "Android";
		System.out.println("After invoking operatingSystem: " + ref.operatingSystem);

		System.out.println("Before invoking cameraType: " + ref.cameraType);
		ref.cameraType = "Triple Camera";
		System.out.println("After invoking cameraType: " + ref.cameraType);

		System.out.println("Before invoking chargerType: " + ref.chargerType);
		ref.chargerType = "USB-C";
		System.out.println("After invoking chargerType: " + ref.chargerType);

		System.out.println("Before invoking simType: " + ref.simType);
		ref.simType = "Dual SIM";
		System.out.println("After invoking simType: " + ref.simType);

		System.out.println("Before invoking manufactureYear: " + ref.manufactureYear);
		ref.manufactureYear = 2024;
		System.out.println("After invoking manufactureYear: " + ref.manufactureYear);

		System.out.println("Before invoking warrantyYears: " + ref.warrantyYears);
		ref.warrantyYears = 1;
		System.out.println("After invoking warrantyYears: " + ref.warrantyYears);

		System.out.println("Before invoking countryOfOrigin: " + ref.countryOfOrigin);
		ref.countryOfOrigin = "India";
		System.out.println("After invoking countryOfOrigin: " + ref.countryOfOrigin);

		System.out.println("Before invoking buildMaterial: " + ref.buildMaterial);
		ref.buildMaterial = "Glass";
		System.out.println("After invoking buildMaterial: " + ref.buildMaterial);

		System.out.println("Before invoking speakerType: " + ref.speakerType);
		ref.speakerType = "Stereo";
		System.out.println("After invoking speakerType: " + ref.speakerType);

		System.out.println("Before invoking rating: " + ref.rating);
		ref.rating = 4.6;
		System.out.println("After invoking rating: " + ref.rating);

		System.out.println("Before invoking stock: " + ref.stock);
		ref.stock = 50;
		System.out.println("After invoking stock: " + ref.stock);

	}
}