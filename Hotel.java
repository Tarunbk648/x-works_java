// //Using mixture of variables and array

// class Hotel{
// 	public static void main(String[] args){
// 	  String name="Sri Annaporneshwari Hotel";
// 	  String owner="Rajesh";
// 	  String location="Bhashyam circle";
// 	  String branches[]={"Bhashyam circle", "BTM", "Vijayanagar"};
// 	  String managers[]={"Rajesh", "Tarun", "Lokesh"};
	  
// 	  System.out.println("The Name of Daba is:" +name);
// 	  System.out.println("The Owner name is:" +owner);
// 	  System.out.println("The Location/Address of Daba is:" +location); 
// 	  System.out.println("The list of branches are:" +branches[0]+","+branches[1]+","+branches[2]); 
// 	  System.out.println("The list of managers are :" +managers[0]+","+managers[1]+","+managers[2]); 
	  
// 	  int len=branches.length;
// 	  System.out.println("Number of branches are:" +len);
// 	  for(String branch:branches){
// 		System.out.println(branch);
// 	  }
		
// 	  int man=managers.length;
// 	  System.out.println("Number of managers are:" +man);
// 	  for(String manager:managers){
// 		System.out.println(manager);
// 	  }
	  
// 	}
	  
// }
	  
		
//using methods
class Hotel{
	public static void main(String[] args){
		hotelDetails("Sri Annaporneshwari Hotel","Rajesh","Bhashyam circle","Bhashyam circle, BTM, Vijayanagar","Rajesh, Tarun, Lokesh");
	}
	static void hotelDetails(String name, String owner, String location, String branches, String managers){
		System.out.println("The Name of Daba is:" +name);
		System.out.println("The Owner name is:" +owner);
		System.out.println("The Location/Address of Daba is:" +location); 
		System.out.println("The list of branches are:" +branches); 
		System.out.println("The list of managers are :" +managers); 
	}
}