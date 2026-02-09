// class JioCinema{
//     public static void main(String[] args){
//         String[] jioCinemaOriginals = {"Asur","She","Raktanchal","Illegal","Sandham","Bose Dead Alive","The Test Case","City of Dreams","Code M","A Simple Murder","Undekhi","JL50","Rudra","Human","Broken But Beautiful","Flesh","Bhaukaal","Hello Mini","Apharan","Your Honor"};

//         String[] movies = {"Brahmastra","Gangubai","Bhool Bhulaiyaa 2","Drishyam 2","RRR","KGF 2","Pathaan","War","Dangal","Sanju","PK","Bajrangi Bhaijaan","Sultan","Tiger Zinda Hai","Chennai Express","Kalank","Raees","Jawan","Animal","Fighter"};

//         String[] webSeries = {"Asur","Criminal Justice","Mirzapur","Paatal Lok","Sacred Games","The Family Man","Farzi","Guns and Gulaabs","Aarya","Rudra","Delhi Crime","She","Aranyak","Jubilee","Rocket Boys","Bhaukaal","Undekhi","Hostages","Grahan","Human"};

//         String[] sports = {"IPL","ISL","Pro Kabaddi","FIFA World Cup","UEFA Champions League","Premier League","La Liga","Serie A","Bundesliga","Ligue 1","Formula 1","MotoGP","NBA","NFL","NHL","Wimbledon","US Open","Australian Open","French Open","Asia Cup"};

//         String[] kidsContents = {"Chhota Bheem","Motu Patlu","Little Singham","Shiva","Roll No 21","Mighty Raju","Bal Ganesh","Krishna","Hanuman","Chorr Police","Tom and Jerry","Scooby Doo","Pokemon","Doraemon","Shin Chan","Ben 10","Mr Bean","Jungle Book","DuckTales","Mickey Mouse"};
		
// 		for(String jioCinemaOriginal:jioCinemaOriginals){
// 			System.out.println(jioCinemaOriginal);
// 		}
// 		for(String movie:movies){
// 			System.out.println(movie);
// 		}
// 		for(String webSerie:webSeries){
// 			System.out.println(webSerie);
// 		}
// 		for(String sport:sports){
// 			System.out.println(sport);
// 		}
// 		for(String kidsContent:kidsContents){
// 			System.out.println(kidsContent);
// 		}
		
//     }
// }

//Using methods 

class JioCinema{
	public static void main(String[] args){
		JioCinemaDetails("Asur","Brahmastra","Asur","IPL","Chhota Bheem");
	}
	static void JioCinemaDetails(String jioCinemaOriginals, String movies, String webSeries, String sports, String kidsContents){
		System.out.println("Jio Cinema Originals: "+jioCinemaOriginals);
		System.out.println("Movies: "+movies);
		System.out.println("Web Series: "+webSeries);
		System.out.println("Sports: "+sports);
		System.out.println("Kids Contents: "+kidsContents);

	}
}