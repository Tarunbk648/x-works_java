class AirConditionerExecutor{
public static void main(String[] args){
	AirConditioner ac = new AirConditioner();
	
	ac.brand="Noise";
	System.out.println("The brand of air conditioner is:" +ac.brand);
	
	ac.model="NS17";
	System.out.println("The model of air conditioner is:" +ac.model);
	
	ac.price=17000;
	System.out.println("The price of air conditioner is:" +ac.price);
	
	ac.type="NSB";
	System.out.println("The type of air conditioner is:" +ac.type);
	
	ac.weight=17;
	System.out.println("The weight of air conditioner is:" +ac.weight);
	
	String[] colors={"Blue", "Green", "Black"};
	System.out.println("Lists of AirConditioner colors:");
	ac.colors=colors;
	for(String lists:ac.colors){
	   System.out.println(lists + " ");
	   }
	  
	ac.warranty=17;
	System.out.println("Warranty of AirConditioner in years:" +ac.warranty);
	
	boolean working=true;
	ac.working=working;
	System.out.println("Status of AirConditioner is:" +ac.working);
	}
	}