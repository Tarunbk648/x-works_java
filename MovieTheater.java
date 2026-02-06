class MovieTheater{
 public static void main(String[] args){
	String theaterName="PVR Cinemas";
	String location="Orion Mall";
	int screen=5;
	String movies[]={"Avataar", "Leo", "KGF", "Salaar"};
	String timings[]={"10AM", "1PM" , "4PM", "7PM"};
	
	System.out.println("Theater Name is:" +theaterName);
	System.out.println("Theater Location is:" +location);
	System.out.println("Number of Screens in a theater is:" +screen);
	
	System.out.println();
	int movie=movies.length;
	System.out.println("Movies Running:" +movie);
	for(String movi:movies){
		System.out.println(movi);
	}
	
	System.out.println();
	int time=timings.length;
	System.out.println("Show Timings:" +time);
	for(String timing:timings){
		System.out.println(timing);
   }
  }
}