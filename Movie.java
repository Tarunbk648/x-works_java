class Movie{

    static String name;
    static String hero;
    static String heroine;
    static String director;
    static String language;
    static int year;
    static int duration;

    public static boolean createMovie(String n,String h,String hr,
                                      String d,String l,int y,int du){

        boolean isCreated=false;

        boolean isNameValid=false;
        boolean isHeroValid=false;
        boolean isHeroineValid=false;
        boolean isDirectorValid=false;
        boolean isLanguageValid=false;
        boolean isYearValid=false;
        boolean isDurationValid=false;

        // Movie Name validation
        if(n!=null && !n.isEmpty()){
            System.out.println("Movie Name validated : " + n);
            name=n;
            isNameValid=true;
        }else{
            System.out.println("Movie Name invalid");
        }

        // Hero validation
        if(h!=null && !h.isEmpty()){
            System.out.println("Hero validated : " + h);
            hero=h;
            isHeroValid=true;
        }else{
            System.out.println("Hero invalid");
        }

        // Heroine validation
        if(hr!=null && !hr.isEmpty()){
            System.out.println("Heroine validated : " + hr);
            heroine=hr;
            isHeroineValid=true;
        }else{
            System.out.println("Heroine invalid");
        }

        // Director validation
        if(d!=null && !d.isEmpty()){
            System.out.println("Director validated : " + d);
            director=d;
            isDirectorValid=true;
        }else{
            System.out.println("Director invalid");
        }

        // Language validation
        if(l!=null && !l.isEmpty()){
            System.out.println("Language validated : " + l);
            language=l;
            isLanguageValid=true;
        }else{
            System.out.println("Language invalid");
        }

        // Year validation
        if(y>1900){
            System.out.println("Year validated : " + y);
            year=y;
            isYearValid=true;
        }else{
            System.out.println("Year invalid");
        }

        // Duration validation
        if(du>0){
            System.out.println("Duration validated : " + du);
            duration=du;
            isDurationValid=true;
        }else{
            System.out.println("Duration invalid");
        }

        // Final validation
        if(isNameValid && isHeroValid && isHeroineValid &&
           isDirectorValid && isLanguageValid &&
           isYearValid && isDurationValid){

            System.out.println("All Movie Details Validated\n");
            isCreated=true;
        }
        else{
            System.out.println("Movie Details Invalidated\n");
        }

        return isCreated;
    }

    public static void getMovieDetails(){

        System.out.println("----- Last Movie Stored -----");
        System.out.println("Name : " + name);
        System.out.println("Hero : " + hero);
        System.out.println("Heroine : " + heroine);
        System.out.println("Director : " + director);
        System.out.println("Language : " + language);
        System.out.println("Year : " + year);
        System.out.println("Duration : " + duration);
    }
}