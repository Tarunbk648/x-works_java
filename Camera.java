class Camera{

    static String brand;
    static String model;
    static int megapixel;
    static int zoom;
    static String color;
    static String lens;
    static String battery;
    static int price;
    static int warranty;
    static boolean wifi;

    public static boolean createCamera(String b,String m,int mp,int z,
                                       String c,String l,String bt,
                                       int p,int w,boolean wf){

        boolean isCreated=false;

        boolean isBrandValid=false;
        boolean isModelValid=false;
        boolean isMpValid=false;
        boolean isZoomValid=false;
        boolean isColorValid=false;
        boolean isLensValid=false;
        boolean isBatteryValid=false;
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

        // Megapixel validation
        if(mp>0){
            System.out.println("Megapixel validated : " + mp);
            megapixel=mp;
            isMpValid=true;
        }else{
            System.out.println("Megapixel invalid");
        }

        // Zoom validation
        if(z>0){
            System.out.println("Zoom validated : " + z);
            zoom=z;
            isZoomValid=true;
        }else{
            System.out.println("Zoom invalid");
        }

        // Color validation
        if(c!=null && !c.isEmpty()){
            System.out.println("Color validated : " + c);
            color=c;
            isColorValid=true;
        }else{
            System.out.println("Color invalid");
        }

        // Lens validation
        if(l!=null && !l.isEmpty()){
            System.out.println("Lens validated : " + l);
            lens=l;
            isLensValid=true;
        }else{
            System.out.println("Lens invalid");
        }

        // Battery validation
        if(bt!=null && !bt.isEmpty()){
            System.out.println("Battery validated : " + bt);
            battery=bt;
            isBatteryValid=true;
        }else{
            System.out.println("Battery invalid");
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
        if(isBrandValid && isModelValid && isMpValid &&
           isZoomValid && isColorValid && isLensValid &&
           isBatteryValid && isPriceValid && isWarrantyValid){

            wifi=wf;
            System.out.println("All Camera Details Validated\n");
            isCreated=true;
        }
        else{
            System.out.println("Camera Details Invalidated\n");
        }

        return isCreated;
    }

    public static void getCameraDetails(){
        System.out.println("----- Last Camera Stored -----");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Megapixel : " + megapixel);
        System.out.println("Zoom : " + zoom);
        System.out.println("Color : " + color);
        System.out.println("Lens : " + lens);
        System.out.println("Battery : " + battery);
        System.out.println("Price : " + price);
        System.out.println("Warranty : " + warranty);
        System.out.println("Wifi : " + wifi);
    }
}