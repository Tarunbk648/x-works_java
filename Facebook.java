//Method overloading
class Facebook{
    public static void login(String userName, String password){
		System.out.println("Usrname:" +userName+","+ "Password:" +password);
			}
	public static void login(long number, String password){
		System.out.println("Phone number:" +number+","+ "Password:" +password);
		}
 
public static void main(String[] args){
     Facebook.login("Tarun", "123@789");
	 Facebook.login(973103456L, "123@789");

	}
}
