class Food{

    static String name;
    static String type;
    static String taste;
    static int price;
    static String restaurant;

    public static boolean createFood(String n,String t,String ta,int p,String r){

        boolean isCreated=false;

        boolean isNameValid=false;
        boolean isTypeValid=false;
        boolean isTasteValid=false;
        boolean isPriceValid=false;
        boolean isRestaurantValid=false;

        if(n!=null && !n.isEmpty()){
            System.out.println("Food Name validated : " + n);
            name=n;
            isNameValid=true;
        }else{
            System.out.println("Food Name invalid");
        }

        if(t!=null && !t.isEmpty()){
            System.out.println("Type validated : " + t);
            type=t;
            isTypeValid=true;
        }else{
            System.out.println("Type invalid");
        }

        if(ta!=null && !ta.isEmpty()){
            System.out.println("Taste validated : " + ta);
            taste=ta;
            isTasteValid=true;
        }else{
            System.out.println("Taste invalid");
        }

        if(p>0){
            System.out.println("Price validated : " + p);
            price=p;
            isPriceValid=true;
        }else{
            System.out.println("Price invalid");
        }

        if(r!=null && !r.isEmpty()){
            System.out.println("Restaurant validated : " + r);
            restaurant=r;
            isRestaurantValid=true;
        }else{
            System.out.println("Restaurant invalid");
        }

        if(isNameValid && isTypeValid && isTasteValid &&
           isPriceValid && isRestaurantValid){

            System.out.println("All Food Details Validated\n");
            isCreated=true;
        }
        else{
            System.out.println("Food Details Invalidated\n");
        }

        return isCreated;
    }

    public static void getFoodDetails(){

        System.out.println("----- Last Food Stored -----");
        System.out.println("Name : " + name);
        System.out.println("Type : " + type);
        System.out.println("Taste : " + taste);
        System.out.println("Price : " + price);
        System.out.println("Restaurant : " + restaurant);
    }
}