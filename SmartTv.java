class SmartTv{
static boolean isSwitch;
static boolean onOrOff(){
	if(isSwitch==false){
		isSwitch=true;
		System.out.println("The TV switch is on");
	}
	else if(isSwitch==true){
		 isSwitch=false;
		 System.out.println("The TV switch is off");
		}
	
	 return isSwitch;
}
}