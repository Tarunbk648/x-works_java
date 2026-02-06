// Taking Array index and store into a varibles and then print
class KukuFM{
	public static void main(String[] args){
		String music[]={"Male nithu", "Mungaru Male", "America-America"};
		String comedy[]={"malayalam", "konkani", "gujurathi"};
		
		String msc= music[0];
		String msc1= music[1];
		String msc2= music[2];
		
		int len=music.length;
		
		System.out.println("The number music available are:" +len);
		System.out.println("The available musics are:" +msc+" ,"+msc1+" ,"+msc2);
		
		
		// Display the statement using for each 
		System.out.println();
		System.out.println("Using for each method");
		for(String m:music){
			System.out.println(m);
		}
		
		System.out.println();
		for(String c:comedy){
			System.out.println(c);
		}
	}
}