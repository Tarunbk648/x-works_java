class Spotify{

static void getDetails(String email, long phoneNumber){
	System.out.println("The email of user is:" +email);
	System.out.println("The phoneNumber of user is:" +phoneNumber);
	}
public static void main(String[] args){
	getDetails("tarunbk@gmail.com", 12345667899L);
}
}