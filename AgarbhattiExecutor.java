class AgarbhattiExecutor {

	public static void main(String[] args) {

		Agarbhatti ref = new Agarbhatti();

		ref.productId = 801;
		ref.fragrance = "Rose";
		ref.price = 60.0;
		ref.quantity = 5;
		ref.brand = "Cycle";
		ref.isAvailable = true;
		ref.isHerbal = true;
		ref.isLongLasting = true;

		System.out.println("The productId is: " + ref.productId);
		System.out.println("The fragrance is: " + ref.fragrance);
		System.out.println("The price is: " + ref.price);
		System.out.println("The quantity is: " + ref.quantity);
		System.out.println("The brand is: " + ref.brand);
		System.out.println("Is available: " + ref.isAvailable);
		System.out.println("Is herbal: " + ref.isHerbal);
		System.out.println("Is long lasting: " + ref.isLongLasting);
	}
}