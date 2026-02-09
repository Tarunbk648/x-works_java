class RedCrossBlood{

static void createDonarAccount(String emilId, int donorId, String firstName, String lastName, String userName, int zipCode, String password, String confirmPassword){
    System.out.println("The email id of user is:" +emilId);
	System.out.println("The donar id is:" +donorId);
	System.out.println("The first name of user is:" +firstName);
	System.out.println("The last name of user is:" +lastName);
	System.out.println("The user name is:" +userName);
	System.out.println("The zipcode of RedCrossBlood is:" +zipCode);
	System.out.println("The password number is:" +password);
	System.out.println("The confirmation of password is:" +confirmPassword);
	}
	
public static void main(String[] args){
	createDonarAccount("tarunbk@gamil.com", 12345, "tarun", "bk", "TBk",45678, "Tarun@34", "Tarun@34");
}
}