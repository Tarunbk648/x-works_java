class PillowExecutor {

	public static void main(String[] args) {

		Pillow ref = new Pillow();

		ref.pillowId = 601;
		ref.brand = "SleepWell";
		ref.color = "White";
		ref.price = 599.0;
		ref.size = "Medium";
		ref.isSoft = true;
		ref.isAvailable = true;
		ref.isWashable = true;

		System.out.println("The pillowId is: " + ref.pillowId);
		System.out.println("The brand is: " + ref.brand);
		System.out.println("The color is: " + ref.color);
		System.out.println("The price is: " + ref.price);
		System.out.println("The size is: " + ref.size);
		System.out.println("Is soft: " + ref.isSoft);
		System.out.println("Is available: " + ref.isAvailable);
		System.out.println("Is washable: " + ref.isWashable);
	}
}