class PortableEspressoMaker{
static long ln=123;
static long carryOrNotCarry(){
	if(ln==123){
		ln=234;
		System.out.println("Carriable");
	}
	else if(ln==234){
		ln=123;
		System.out.println("Not Carriable");
	}
	return ln;
  }
 }