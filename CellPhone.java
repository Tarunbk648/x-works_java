class CellPhone{
	public static long getContactNumber(String contactName){
		//contactName="Baba";
		long contactNo=0L;
		if(contactName=="TBK"){
			contactNo=9731036881L;
			return contactNo;
		}
		else if(contactName=="MBK"){
		    contactNo=9945344239L;
			return contactNo;
		}
		else if(contactName=="Rajesh"){
			 contactNo=987456123L;
			 return contactNo;
		}
		else if(contactName=="Rajeev"){
			contactNo=7894562589L;
			return contactNo;
		}
		else if(contactName=="Fayaz"){
			contactNo=745812698L;
			return contactNo;
		}
		else if(contactName=="pacchu"){
			contactNo=745891236L;
			return contactNo;
		}
		else if(contactName=="earesh"){
			contactNo=7845145822L;
			return contactNo;
		}
		else if(contactName=="eyesh"){
			contactNo=7845145825L;
			return contactNo;
		}
		else if(contactName=="ramesh"){
			contactNo=7845145829L;
			return contactNo;
		}
		else if(contactName=="raju"){
			contactNo=798541263L;
			return contactNo;
		}
		else if(contactName=="harish"){
			contactNo=9845123678L;
			return contactNo;
		}
		else if(contactName=="ambrish"){
			contactNo=94568712L;
			return contactNo;
		}
		else if(contactName=="suresh"){
			contactNo=9482422604L;
			return contactNo;
		}
		else if(contactName=="raveesh"){
			contactNo=9978412563L;
			return contactNo;
		}
		else if(contactName=="raghu"){
			contactNo=8547961235L;
			return contactNo;
		}
		else if(contactName=="janvith"){
			contactNo=974851263L;
			return contactNo;
		}
		else if(contactName=="komlesh"){
			contactNo=7812648523L;
			return contactNo;
		}
		else if(contactName=="satish"){
			contactNo=978541236L;
			return contactNo;
		}
		else if(contactName=="hruthik"){
			contactNo=654789123L;
			return contactNo;
		}
		else if(contactName=="pratheek"){
			contactNo=96478512384L;
			return contactNo;
		}
		else if(contactName=="krishna"){
			contactNo=6363312345L;
			return contactNo;
		}
		else if(contactName=="yusuf"){
			contactNo=7845236912L;
			return contactNo;
		}
		else if(contactName=="chidan"){
			contactNo=854796123L;
			return contactNo;
		}
		else if(contactName=="bharath"){
			contactNo=978456258L;
			return contactNo;
		}
		else if(contactName=="jagadeesh"){
			contactNo=954781263L;
			return contactNo;
		}
		else if(contactName=="rakshith"){
			contactNo=786231458L;
			return contactNo;
		}
		else if(contactName=="ramu"){
			contactNo=874523691L;
			return contactNo;
		}
		else if(contactName=="manjunath"){
			contactNo=984512376L;
			return contactNo;
		}
		else if(contactName=="manoj"){
			contactNo=984125637L;
			return contactNo;
		}
		else if(contactName=="tarun"){
			contactNo=9380659902L;
			return contactNo;
		}
		else if(contactName=="thanushree"){
			contactNo=8745123965L;
			return contactNo;
		}
		else if(contactName=="padmakshi"){
			contactNo=9482502259L;
			return contactNo;
		}
		else if(contactName=="chandregowda"){
			contactNo=9482159180L;
			return contactNo;
		}
		else if(contactName=="Krishnegowda"){
			contactNo=9482422604L;
			return contactNo;
		}
		else if(contactName=="manojganad"){
			contactNo=852147964L;
			return contactNo;
		}
		else if(contactName=="manjukumar"){
			contactNo=6547812394L;
			return contactNo;
		}
		else if(contactName=="prabhu"){
			contactNo=6948751236L;
			return contactNo;
		}
		else if(contactName=="parikshith"){
			contactNo=854791236L;
			return contactNo;
		}
		else if(contactName=="pujith"){
			contactNo=974581263L;
			return contactNo;
		}
		else if(contactName=="chaman"){
			contactNo=9874512368L;
			return contactNo;
		}
		else if(contactName=="vidhwat"){
			contactNo=974512384L;
			return contactNo;
		}
		else if(contactName=="shamanth"){
			contactNo=687451298L;
			return contactNo;
		}
		else if(contactName=="shashank"){
			contactNo=987254786L;
			return contactNo;
		}
		else{
			System.out.println("No contact name is matched");
		}
		return contactNo;
	}
public static void main(String[] args){
 String contactName="tarun";
 long contactNo= CellPhone.getContactNumber(contactName);
 System.out.println("The contact name is:" +contactName+ ",dial number is:" +contactNo);
 }
}