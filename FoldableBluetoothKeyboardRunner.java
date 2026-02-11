class FoldableBluetoothKeyboardRunner{
public static void main(String[] args){
	double ref=FoldableBluetoothKeyboard.openOrClose();
	System.out.println("The status of bluetooth is:" +ref);
}
}