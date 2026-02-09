// class Netflix{
//     public static void main(String[] args){
//         String[] thrillerShows = {"Dark","Mindhunter","Ozark","You","Money Heist", "The Night Agent","1899","The Watcher","Black Mirror","Lupin", "Narcos","Safe","Clickbait","The Rain","The Innocent","Alice in Borderland","Bodies","The Stranger","Archive 81","Beef"};

//         String[] comedyShows = {"Friends","Brooklyn Nine-Nine","The Office","Sex Education","Big Mouth", "Never Have I Ever","Atypical","Grace and Frankie","The Good Place","Master of None","Arrested Development","BoJack Horseman","Kim’s Convenience","Community","F is Family","Disenchantment","Schitt’s Creek","Santa Clarita Diet","Unbreakable Kimmy","After Life"};

//         String[] actionMovies = {"Extraction","Extraction 2","The Gray Man","Red Notice","6 Underground","Kate","Project Power","Spenser Confidential","Triple Frontier","Bright","Polar","The Old Guard","Outside the Wire","Army of the Dead","Havoc","The Killer","Point Blank","Wheelman","Close","Blood Red Sky"};

//         String[] horrorMovies = {"Bird Box","The Platform","Cam","In the Tall Grass","Apostle", "1922","The Ritual","Eli","The Babysitter","His House", "The Silence","Veronica","Fear Street 1","Fear Street 2","Fear Street 3","Incantation","Choose or Die","Malevolent","Things Heard","No One Gets Out"};

//         String[] documentaries = {"Our Planet","Tiger King","Making a Murderer","The Social Dilemma","Formula 1", "Night on Earth","Our Father","The Tinder Swindler","Bad Vegan","Take Your Pills", "Dirty Money","Jeffrey Epstein","American Factory","Inside Bill's Brain","Downfall", "The Great Hack","Don’t F**k With Cats","Seaspiracy","Cocaine Cowboys","Spycraft"};
		
// 		String movies= thrillerShows[0];
		
// 		String movies1= thrillerShows[1];
		
// 		System.out.println(movies +" "+movies1); 
		
// 		for(String thrillerShow: thrillerShows){
// 			System.out.println(thrillerShow);
// 		}
// 		for(String actionMovie:actionMovies){
// 			System.out.println(actionMovie);
// 		}
// 		for(String horrorMovie:horrorMovies ){
// 			System.out.println(horrorMovie);
// 		}
// 		for(String documentarie:documentaries ){
// 			System.out.println(documentarie);
// 		}
// 		for(String comedyShow: comedyShows){
// 			System.out.println(comedyShow);
// 		}
//     }
	
// }

//using methods 

class Netflix{
	public static void main(String[] args){
		netflixDetails("Dark","Friends","Extraction","Bird Box","Our Planet");
	}
	static void netflixDetails(String thrillerShows, String comedyShows, String actionMovies, String horrorMovies, String documentaries){
		System.out.println("Thriller Shows: "+thrillerShows);
		System.out.println("Comedy Shows: "+comedyShows);
		System.out.println("Action Movies: "+actionMovies);
		System.out.println("Horror Movies: "+horrorMovies);
		System.out.println("Documentaries: "+documentaries);

	}
}