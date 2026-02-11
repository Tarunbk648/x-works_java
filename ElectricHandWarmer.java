class ElectricHandWarmer{
static char ch[]={'0','1'};
static int index=0;
static char onOrOff(){
	if(index==0){
		index=1;
		System.out.println("The Warmer is on");
	}
	else if(index==1){
		index=0;
		System.out.println("The warmer is off");
	}
	return ch[index];
  }
 }