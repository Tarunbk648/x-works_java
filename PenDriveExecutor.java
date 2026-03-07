class PenDriveExecutor{
 public static void main(String[] args){
	PenDrive pd = new PenDrive();
	
	String brand = "SunDisk";
	pd.brand = brand;
	System.out.println("The brand of pendrive is:" +pd.brand);
	
	int capacity = 500;
	pd.capacity = capacity;
	System.out.println("The capacity of pendrive in MWatt:" +pd.capacity);
	
	double price = 4500.89;
	pd.price = price;
	System.out.println("The price of a pendrive is:" +pd.price);
	
	String type = "Noise";
	pd.type = type;
	System.out.println("The type of pendrive is:" +pd.type);

	boolean working = true;
	pd.working = working;
	System.out.println("The status of pendrive is:" +pd.working);
	
	String[] colors = {"Blue", "Balck", "White"};
	System.out.println("List of pendrive colors are:");
	pd.colors=colors;
	for(String lists: colors){
		System.out.println(lists + " ");
	}
	
	String[] supportedDevices = {"Nokia", "Samsung", "Mi"};
	System.out.println("Lists of supportedDevices are:");
	pd.supportedDevices=supportedDevices;
	for(String lists: supportedDevices){
		System.out.println(lists + " ");
	}
	
	String[] vendors = {"boAt", "Noise", "trip"};
	System.out.println("Lists of vendors:");
	pd.vendors = vendors;
	for(String lists: pd.vendors){
		System.out.println(lists + " ");
  }
}
}