
class Pavithra{
public static void getDetails(){
	String name="Pavithra Veg";
	String location="Chikkamagaluru";
	String items[]={"idli", "coffee", "vada"};
	String managers[]={"Ramesh Rao", "Harish"};
	
	System.out.println("Name is:" +name);
	System.out.println("Location is:" +location);
	for(String item: items){
		System.out.println("Items list:" +item);
	}
	for(String manager: managers){
		System.out.println("Managers list:" +manager);
	}
}
}