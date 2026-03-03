class ColinExecutor {

	public static void main(String[] args) {

		Colin ref = new Colin();

		ref.productId = 301;
		ref.brand = "Colin";
		ref.type = "Glass Cleaner";
		ref.price = 85.50;
		ref.quantity = 10;
		ref.isAvailable = true;
		ref.isLiquid = true;
		ref.isNewStock = true;

		System.out.println("The productId is: " + ref.productId);
		System.out.println("The brand is: " + ref.brand);
		System.out.println("The type is: " + ref.type);
		System.out.println("The price is: " + ref.price);
		System.out.println("The quantity is: " + ref.quantity);
		System.out.println("Is available: " + ref.isAvailable);
		System.out.println("Is liquid: " + ref.isLiquid);
		System.out.println("Is new stock: " + ref.isNewStock);
	}
}