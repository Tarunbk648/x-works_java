class PowerBank{
static int isBank;
static int getDetails(){
	if(isBank==0){
		isBank=1;
		System.out.println("The power bank is on");
	}
	else if(isBank==1){
		isBank=0;
		System.out.println("The power bank is off");
	}
   return isBank;
  }
 }