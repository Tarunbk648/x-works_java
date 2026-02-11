class PortableProjector{
static byte by[]={2,4};
static int index=0;
static byte moveOrNotMove(){
	if(index==0){
		index=1;
		System.out.println("The projector can move");
	}
	else if(index==1){
		index=0;
		System.out.println("The projector can't move");
	}
	return by[index];
}
}