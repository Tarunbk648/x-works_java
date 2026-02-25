class Facebook{
	static String firstname;
	static String surname;
	static String password;
	static String dateofbirth;
	static String email;
	static String gender;
 public static boolean createAccount(String fname, String sname, String pwd, String dob, String email, String gname){
     boolean isConnected=false;
	 boolean isfnameValid=false;
	 boolean issnameValid=false;
	 boolean ispwdValid=false;
	 
	 if(fname !=null && !fname.isEmpty()){
		System.out.println("Fname validated:" +fname);
		firstname=fname;
		isfnameValid=true;
		}
	else{
		System.out.println("Fname is invalidated");
		}
    
	if(sname !=null && !sname.isEmpty()){
	   System.out.println("Sname validated:" +sname);
	   surname=sname;
	   issnameValid=true;
	   }
	 else{
	     System.out.println("Sname is invalidated:");
		 }
	if(pwd!=null && !pwd.isEmpty()){
	     System.out.println("Password validated:" +pwd);
		 password=pwd;
		 ispwdValid=true;
		 }
	else{
	    System.out.println("Password invalidated");
		}
	
	if(isfnameValid==true && issnameValid==true &&  ispwdValid==true){
	     System.out.println("Details are Validated....");
		 isConnected=true;
	 }
	 else{
	     System.out.println("Detail are Invalidated....");
		}
  return isConnected;
  }
  
  public static void getAccountDetails(){
	  // System.out.println(firstname);
	  // System.out.println(surname);
	  // System.out.println(password);
 }
}
		 
	   
		