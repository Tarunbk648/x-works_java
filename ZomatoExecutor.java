class ZomatoExecutor{
public static void main(String[] args){
	String foodName="Tuna Sub";
	double df=Zomato.Search(foodName);
	System.out.println("The food item is:" +foodName+ ",with price:" +df);
}
}