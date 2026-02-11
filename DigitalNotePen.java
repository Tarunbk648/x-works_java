class DigitalNotePen{
static float f;
static float writeNotWrite(){
	if(f==0.0f){
		f=1.0f;
		System.out.println("Pen writes");
	}
	else if(f==1.0f){
		f=0.0f;
		System.out.println("Pen doesn't writes");
	}
	return f;
  }
 }