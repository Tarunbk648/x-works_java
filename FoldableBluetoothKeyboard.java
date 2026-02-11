class FoldableBluetoothKeyboard{
static double FBK=3.14d;
static double openOrClose(){
	if(FBK==3.14d){
		FBK=3.15d;
		System.out.println("FBK is open");
	}
	else if(FBK==3.15d){
		 FBK=3.14d;
		 System.out.println("FBK is closed");
		}
	return FBK;
	}
  }