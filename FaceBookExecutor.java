class FaceBookExecutor{
  public static void main(String[] args){
     boolean accountDetails=Facebook.createAccount("Harish", "Raj","HR@123", null, null, null);
	 accountDetails=Facebook.createAccount("Tarun", "Raj","TR@123", null, null, null);
	 System.out.println(accountDetails);
	 //Facebook.getAccountDetails();
	}
}