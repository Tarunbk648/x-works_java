class FiberExecutor{
 public static void main(String[] args){
    Fiber fb = new Fiber();
	
	String name="Air1";
	fb.name=name;
	System.out.println("The Fiber name is:" +fb.name);
	
	String name1="Air2";
	fb.name=name1;
	System.out.println(fb.name);
	
	double length=100;
	fb.length=length;
	System.out.println("The length of fiber is:" +fb.length);
	
	String[] vendors={"Airtel", "jio", "BSNL"};
	fb.vendors=vendors;
	System.out.println("List of vendors are:" );
	for(String lists: fb.vendors)
		System.out.println(lists + " ");
 }
}