class MatExecutor {

	public static void main(String[] args) {

		Mat ref = new Mat();

		ref.matId = 701;
		ref.type = "Yoga Mat";
		ref.color = "Blue";
		ref.price = 899.0;
		ref.material = "Rubber";
		ref.isAvailable = true;
		ref.isWaterProof = true;
		ref.isFoldable = true;

		System.out.println("The matId is: " + ref.matId);
		System.out.println("The type is: " + ref.type);
		System.out.println("The color is: " + ref.color);
		System.out.println("The price is: " + ref.price);
		System.out.println("The material is: " + ref.material);
		System.out.println("Is available: " + ref.isAvailable);
		System.out.println("Is waterproof: " + ref.isWaterProof);
		System.out.println("Is foldable: " + ref.isFoldable);
	}
}