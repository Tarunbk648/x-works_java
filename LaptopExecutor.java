class LaptopExecutor{

	public static void main(String[] args){

		Laptop ref = new Laptop();

		System.out.println("Before invoking laptopId: "+ref.laptopId);
		ref.laptopId=101;
		System.out.println("After invoking laptopId: "+ref.laptopId);

		System.out.println("Before invoking brand: "+ref.brand);
		ref.brand="Dell";
		System.out.println("After invoking brand: "+ref.brand);

		System.out.println("Before invoking model: "+ref.model);
		ref.model="Inspiron";
		System.out.println("After invoking model: "+ref.model);

		System.out.println("Before invoking price: "+ref.price);
		ref.price=65000;
		System.out.println("After invoking price: "+ref.price);

		System.out.println("Before invoking processor: "+ref.processor);
		ref.processor="i5";
		System.out.println("After invoking processor: "+ref.processor);

		System.out.println("Before invoking ram: "+ref.ram);
		ref.ram=16;
		System.out.println("After invoking ram: "+ref.ram);

		System.out.println("Before invoking storage: "+ref.storage);
		ref.storage=512;
		System.out.println("After invoking storage: "+ref.storage);

		System.out.println("Before invoking color: "+ref.color);
		ref.color="Black";
		System.out.println("After invoking color: "+ref.color);

		System.out.println("Before invoking screenSize: "+ref.screenSize);
		ref.screenSize=15.6;
		System.out.println("After invoking screenSize: "+ref.screenSize);

		System.out.println("Before invoking weight: "+ref.weight);
		ref.weight=1.8;
		System.out.println("After invoking weight: "+ref.weight);

		System.out.println("Before invoking isTouchScreen: "+ref.isTouchScreen);
		ref.isTouchScreen=false;
		System.out.println("After invoking isTouchScreen: "+ref.isTouchScreen);

		System.out.println("Before invoking hasBacklitKeyboard: "+ref.hasBacklitKeyboard);
		ref.hasBacklitKeyboard=true;
		System.out.println("After invoking hasBacklitKeyboard: "+ref.hasBacklitKeyboard);

		System.out.println("Before invoking hasFingerprint: "+ref.hasFingerprint);
		ref.hasFingerprint=true;
		System.out.println("After invoking hasFingerprint: "+ref.hasFingerprint);

		System.out.println("Before invoking hasWebcam: "+ref.hasWebcam);
		ref.hasWebcam=true;
		System.out.println("After invoking hasWebcam: "+ref.hasWebcam);

		System.out.println("Before invoking operatingSystem: "+ref.operatingSystem);
		ref.operatingSystem="Windows";
		System.out.println("After invoking operatingSystem: "+ref.operatingSystem);

		System.out.println("Before invoking graphicsCard: "+ref.graphicsCard);
		ref.graphicsCard="Nvidia";
		System.out.println("After invoking graphicsCard: "+ref.graphicsCard);

		System.out.println("Before invoking batteryType: "+ref.batteryType);
		ref.batteryType="Lithium";
		System.out.println("After invoking batteryType: "+ref.batteryType);

		System.out.println("Before invoking chargerType: "+ref.chargerType);
		ref.chargerType="65W";
		System.out.println("After invoking chargerType: "+ref.chargerType);

		System.out.println("Before invoking warrantyYears: "+ref.warrantyYears);
		ref.warrantyYears=2;
		System.out.println("After invoking warrantyYears: "+ref.warrantyYears);

		System.out.println("Before invoking manufactureYear: "+ref.manufactureYear);
		ref.manufactureYear=2024;
		System.out.println("After invoking manufactureYear: "+ref.manufactureYear);

		System.out.println("Before invoking countryOfOrigin: "+ref.countryOfOrigin);
		ref.countryOfOrigin="India";
		System.out.println("After invoking countryOfOrigin: "+ref.countryOfOrigin);

		System.out.println("Before invoking keyboardType: "+ref.keyboardType);
		ref.keyboardType="QWERTY";
		System.out.println("After invoking keyboardType: "+ref.keyboardType);

		System.out.println("Before invoking buildMaterial: "+ref.buildMaterial);
		ref.buildMaterial="Aluminium";
		System.out.println("After invoking buildMaterial: "+ref.buildMaterial);

		System.out.println("Before invoking rating: "+ref.rating);
		ref.rating=4.5;
		System.out.println("After invoking rating: "+ref.rating);

		System.out.println("Before invoking stock: "+ref.stock);
		ref.stock=20;
		System.out.println("After invoking stock: "+ref.stock);

	}
}