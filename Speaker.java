class Speaker{
static boolean isConnected;  //declration of variable
static boolean onOrOff(){
	if(isConnected==false){
		isConnected=true;
		System.out.println("The Speaker is on");
	}
	else if(isConnected==true){
		isConnected=false;
		System.out.println("The speaker is Off");
	}
	return isConnected;
}
}