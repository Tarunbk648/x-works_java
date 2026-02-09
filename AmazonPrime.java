// class AmazonPrime{
//     public static void main(String[] args){
//         String[] primeOriginals = {"Mirzapur","The Family Man","Panchayat","Farzi","Made in Heaven","Breathe","Inside Edge","Suzhal","Bandish Bandits","Comicstaan","Mumbai Diaries","Hostel Daze","Modern Love","Four More Shots","Reacher","Jack Ryan","The Boys","Citadel","Upload","Carnival Row"};

//         String[] actionMovies = {"KGF","KGF 2","Vikram","Pushpa","RRR","War","Pathaan","Kesari","Shershaah","Raazi","Batla House","Commando","Baaghi","Satyameva Jayate","Dhoom","Sarrainodu","Magadheera","Rangasthalam","Vikrant Rona","Ugramm"};

//         String[] comedyShows = {"Panchayat","Comicstaan","One Mic Stand","Mind the Malhotras","Laakhon Mein Ek","Permanent Roommates","Tripling","Flames","Cubicles","Aspirants","Gullak","Little Things","Yeh Meri Family","TVF Pitchers","Adulting","Humorously Yours","What The Folks","Bang Baaja","Minus One","Pushpavalli"};

//         String[] kidsShows = {"Chhota Bheem","Motu Patlu","Doraemon","Shin Chan","Ben 10","Pokemon","Tom and Jerry","Scooby Doo","Mr Bean","Jungle Book","DuckTales","Mickey Mouse","Kung Fu Panda","Cars","Minions","Peppa Pig","PJ Masks","Bob the Builder","Power Rangers","Noddy"};

//         String[] documentaries = {"The Test","All or Nothing","Free Solo","The Grand Tour","Clarkson’s Farm","Savage Kingdom","Planet Earth","Human","Cosmos","Cold Case Hammer","Generation Wealth","Lucifer Effect","Wild Karnataka","Sons of Soil","Truth Seekers","Indian Idol","Dance Plus","Comicstaan","MasterChef","One Mic Stand"};
		
// 		for(String primeOriginal:primeOriginals){
// 			System.out.println(primeOriginal);
// 		}
// 		for(String actionMovie:actionMovies){
// 			System.out.println(actionMovie);
// 		}
// 		for(String comedyShow:comedyShows){
// 			System.out.println(comedyShow);
// 		}
// 		for(String kidsShow:kidsShows){
// 			System.out.println(kidsShow);
// 		}
// 		for(String documentarie:documentaries){
// 			System.out.println(documentarie);
// 		}
//     }
// }

//Using methods in java

class AmazonPrime{
	public static void main(String[] args){
		AmazonPrimeDetails("Mirzapur","KGF","Panchayat","Chhota Bheem","The Test");
	}
	static void AmazonPrimeDetails(String primeOriginals, String actionMovies, String  comedyShows, String kidsShows, String  documentaries){
		System.out.println("Prime Originals: "+primeOriginals);
		System.out.println("Action Movies: "+actionMovies);
		System.out.println("Comedy Shows: "+comedyShows);
		System.out.println("Kids Shows: "+kidsShows);
		System.out.println("Documentaries: "+documentaries);

	}
}

