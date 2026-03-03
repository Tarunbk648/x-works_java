class MysoreSandalSoapExecutor {

	public static void main(String[] args) {

		MysoreSandalSoap ref = new MysoreSandalSoap();

		ref.soapId = 401;
		ref.fragrance = "Sandal";
		ref.weight = 125.0;
		ref.price = 45.0;
		ref.color = "Yellow";
		ref.isAvailable = true;
		ref.isOriginal = true;
		ref.isHerbal = true;

		System.out.println("The soapId is: " + ref.soapId);
		System.out.println("The fragrance is: " + ref.fragrance);
		System.out.println("The weight is: " + ref.weight);
		System.out.println("The price is: " + ref.price);
		System.out.println("The color is: " + ref.color);
		System.out.println("Is available: " + ref.isAvailable);
		System.out.println("Is original: " + ref.isOriginal);
		System.out.println("Is herbal: " + ref.isHerbal);
	}
}