//DataTypes
//Primitive datatypes: int,float,char,double,long
// Non-primitive datatypes: Array, classes, objects, interface

class DataTypes{
	public static void main(String[] args){
		int i=10000;
		short s=3000;
		long l= 10000L;
		double d= 3.143256783;
		char c= 'A';
		float f=3.14f;
		byte b= 1;
		boolean flag= true;
		
		String str= "Hello,hi";
		int[] W={1,2,3,4,5};
		Integer wraperInt= Integer.valueOf(50);
		String strg= new String("Java");
		System.out.println("int:" +i);
		System.out.println("short:" +s);
		System.out.println("long:" +l);
		System.out.println("double:" +d);
		System.out.println("char:" +c);
		System.out.println("float:" +f);
		System.out.println("byte:" +b);
		System.out.println("boolean:" +flag);
		System.out.println("String:" +str);
			for (int z=0; z<W.length; z++){
				System.out.println("Array:" +W[z]);
			}
		System.out.println("Wraper Integer:" +wraperInt);
		System.out.println("string:" +strg);
	}
}
		