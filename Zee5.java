// class Zee5{
//     public static void main(String[] args){
//         String[] zeeOriginals = {"Abhay","Rangbaaz","Sunflower","Tripling","Kaafir","Taj","Duranga","Pitchers","Code M","Mithya","Jeet Ki Zid","State of Siege","Bicchoo Ka Khel","Break Point","Never Kiss","Cartel","Qubool Hai 2.0","Bloody Brothers","The Verdict","The Broken News"};

//         String[] regionalMovies = {"Kantara","Charlie","Lucia","Ugramm","RangiTaranga","Dia","Garuda Gamana","Bell Bottom","Love Mocktail","Kirik Party","Drishyam","Premam","Jai Bhim","Asuran","Vikram","96","Soorarai Pottru","Kaithi","Master","Leo"};

//         String[] comedyShows = {"TVF Pitchers","Permanent Roommates","Cubicles","Aspirants","Flames","Panchayat","Gullak","Tripling","Humorously Yours","Little Things","Adulting","College Romance","Bang Baaja","Yeh Meri Family","Please Find","Pushpavalli","What the Folks","Barely Speaking","Die Trying","Minus One"};

//         String[] horrorShows = {"Kaali","Ghoul","Typewriter","Bhram","Betaal","Aafat","Raat Baaki","Ek Thi Begum","Pariwar","Ghost Stories","Dark 7 White","Crimes and Confessions","The Wife","Haunted Nights","Aahat","Fear Files","Pishachini","Shaitaan","Ek Raat","Darr"};

//         String[] realityShows = {"Sa Re Ga Ma Pa","Dance India Dance","Indian Idol","Super Singer","Little Champs","India’s Best Dramebaaz","DID Super Moms","Zee Cine Awards","Zee Comedy Show","Zee Rishtey","Zee Heroes","Zee Talkies","Zee Yuva","Zee Bangla","Zee Tamil","Zee Kannada","Zee Telugu","Zee Marathi","Zee Cinema","Zee Anmol"};
//     }
// }

//using methods

class Zee5{
    public static void main(String[] args){
        Zee5Details("Abhay","Kantara","TVF Pitchers","Kaali","Sa Re Ga Ma Pa");
    }
    static void Zee5Details(String zeeOriginals, String regionalMovies, String comedyShows, String horrorShows, String realityShows){
        System.out.println("Zee Originals: "+zeeOriginals);
        System.out.println("Regional Movies: "+regionalMovies);
        System.out.println("Comedy Shows: "+comedyShows);
        System.out.println("Horror Shows: "+horrorShows);
        System.out.println("Reality Shows: "+realityShows);
    }
}