// class SonyLIV{
//     public static void main(String[] args){
//         String[] sonyOriginals = {"Scam 1992","Rocket Boys","Maharani","Undekhi","Tabbar","JL50","Avrodh","Gullak","Your Honor","College Romance","Kathmandu Connection","Chamak","Project 9191","Freedom at Midnight","Tanaav","The Broken News","United Kacche","Inspector Rishi","Decoupled","Faadu"};

//         String[] crimeShows = {"CID","Crime Patrol","Savdhaan India","Adaalat","Gumrah","FIR","Agent Raghav","SuperCops","Haunted Nights","Aahat","Byomkesh","Detective Didi","Special Squad","Hum Ne Li","India Most Wanted","Code Red","Red Alert","Shaitaan Haveli","Powder","Karamchand"};

//         String[] realityShows = {"Indian Idol","Super Dancer","Shark Tank","Kaun Banega Crorepati","MasterChef","Dance Plus","India’s Got Talent","Kapil Sharma Show","Bigg Boss","Nach Baliye","Roadies","Splitsvilla","MTV Hustle","Sa Re Ga Ma Pa","Comedy Cir","Boogie Woogie","Fear Factor","Khatron Ke Khiladi","Entertainment Ke Liye","India’s Best"};

//         String[] movies = {"Pink","Badla","Andhadhun","Article 15","Drishyam","Vikram Vedha","Tumbbad","Stree","Newton","Talvar","Raazi","Kahaani","No One Killed Jessica","A Wednesday","Ugly","Mulk","Section 375","Batla House","Kesari","Mission Mangal"};

//         String[] kidsContents = {"Motu Patlu","Chhota Bheem","Little Singham","Krishna","Roll No 21","Mighty Raju","Selfie with Bajrangi","Bal Ganesh","Hanuman","Kumbh Karan","Chorr Police","Super Bheem","Gattu Battu","Lamput","Keymon Ache","Vir The Robot","Pakdam Pakdai","Eena Meena","Shiva","Bandbudh"};
		
// 		for(String sonyOriginal: sonyOriginals){
// 			System.out.println(sonyOriginal);
// 		}
// 		for(String realityShow: realityShows){
// 			System.out.println(realityShow);
// 		}
// 		for(String movie: movies){
// 			System.out.println(movie);
// 		}
// 		for(String sonyOriginal: sonyOriginals){
// 			System.out.println(sonyOriginal);
// 		}
// 		for(String kidsContent: kidsContents){
// 			System.out.println(kidsContent);
// 		}
		
//     }
// }

//using methods

class SonyLIV{
	public static void main(String[] args){
		SonyLIVDetails("Scam 1992","CID","Indian Idol","Pink","Motu Patlu");
	}
	static void SonyLIVDetails(String sonyOriginals, String crimeShows, String realityShows, String movies, String kidsContents){
		System.out.println("Sony LIV Originals: "+sonyOriginals);
		System.out.println("Crime Shows: "+crimeShows);
		System.out.println("Reality Shows: "+realityShows);
		System.out.println("Movies: "+movies);
		System.out.println("Kids Contents: "+kidsContents);

	}
}