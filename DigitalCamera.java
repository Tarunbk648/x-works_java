class DigitalCamera{
static String str[]={"0", "1"};
static int index=0;
static String onOrOff(){
  if(index==0){
	 index=1;
	 System.out.println("The camera is on");
	}
  else if(index==1){
      index=0;
	  System.out.println("The camera is off");
	 }
	return str[index];
  }
 }