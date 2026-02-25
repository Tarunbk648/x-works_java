class PSFive{

    static String brand;
    static String model;
    static String storage;
    static String color;
    static String edition;
    static int price;
    static int warranty;
    static boolean wirelessController;

    public static boolean createPSFive(String b,String m,String s,
                                       String c,String e,int p,
                                       int w,boolean wc){

        boolean isCreated=false;

        boolean isBrandValid=false;
        boolean isModelValid=false;
        boolean isStorageValid=false;
        boolean isColorValid=false;
        boolean isEditionValid=false;
        boolean isPriceValid=false;
        boolean isWarrantyValid=false;

        // Brand validation
        if(b!=null && !b.isEmpty()){
            System.out.println("Brand validated : " + b);
            brand=b;
            isBrandValid=true;
        }else{
            System.out.println("Brand invalid");
        }

        // Model validation
        if(m!=null && !m.isEmpty()){
            System.out.println("Model validated : " + m);
            model=m;
            isModelValid=true;
        }else{
            System.out.println("Model invalid");
        }

        // Storage validation
        if(s!=null && !s.isEmpty()){
            System.out.println("Storage validated : " + s);
            storage=s;
            isStorageValid=true;
        }else{
            System.out.println("Storage invalid");
        }

        // Color validation
        if(c!=null && !c.isEmpty()){
            System.out.println("Color validated : " + c);
            color=c;
            isColorValid=true;
        }else{
            System.out.println("Color invalid");
        }

        // Edition validation
        if(e!=null && !e.isEmpty()){
            System.out.println("Edition validated : " + e);
            edition=e;
            isEditionValid=true;
        }else{
            System.out.println("Edition invalid");
        }

        // Price validation
        if(p>0){
            System.out.println("Price validated : " + p);
            price=p;
            isPriceValid=true;
        }else{
            System.out.println("Price invalid");
        }

        // Warranty validation
        if(w>=0){
            System.out.println("Warranty validated : " + w);
            warranty=w;
            isWarrantyValid=true;
        }else{
            System.out.println("Warranty invalid");
        }

        // Final validation
        if(isBrandValid && isModelValid && isStorageValid &&
           isColorValid && isEditionValid &&
           isPriceValid && isWarrantyValid){

            wirelessController=wc;
            System.out.println("All PSFive Details Validated\n");
            isCreated=true;
        }
        else{
            System.out.println("PSFive Details Invalidated\n");
        }

        return isCreated;
    }

    public static void getPSFiveDetails(){

        System.out.println("----- Last PSFive Stored -----");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Storage : " + storage);
        System.out.println("Color : " + color);
        System.out.println("Edition : " + edition);
        System.out.println("Price : " + price);
        System.out.println("Warranty : " + warranty);
        System.out.println("Wireless Controller : " + wirelessController);
    }
}