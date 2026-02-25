class MedicalStore {

    static String medicineName;
    static String manufacturer;
    static String type;
    static int price;
    static String expiryDate;
    static String dosage;
    static boolean prescriptionRequired;

    public static boolean createMedicine(
            String mn,
            String mf,
            String t,
            int p,
            String ed,
            String d,
            boolean pr) {

        boolean isCreated = false;

        boolean v1=false,v2=false,v3=false,
                v4=false,v5=false,v6=false;

        if(mn!=null && !mn.isEmpty()){
            System.out.println("Medicine validated : " + mn);
            medicineName=mn; v1=true;
        }else{ System.out.println("Medicine invalid"); }

        if(mf!=null && !mf.isEmpty()){
            System.out.println("Manufacturer validated : " + mf);
            manufacturer=mf; v2=true;
        }else{ System.out.println("Manufacturer invalid"); }

        if(t!=null && !t.isEmpty()){
            System.out.println("Type validated : " + t);
            type=t; v3=true;
        }else{ System.out.println("Type invalid"); }

        if(p>0){
            System.out.println("Price validated : " + p);
            price=p; v4=true;
        }else{ System.out.println("Price invalid"); }

        if(ed!=null && !ed.isEmpty()){
            System.out.println("Expiry validated : " + ed);
            expiryDate=ed; v5=true;
        }else{ System.out.println("Expiry invalid"); }

        if(d!=null && !d.isEmpty()){
            System.out.println("Dosage validated : " + d);
            dosage=d; v6=true;
        }else{ System.out.println("Dosage invalid"); }

        if(v1 && v2 && v3 && v4 && v5 && v6){
            prescriptionRequired=pr;
            System.out.println("All Medicine Details Validated\n");
            isCreated=true;
        }else{
            System.out.println("Medicine Details Invalidated\n");
        }

        return isCreated;
    }

    public static void getMedicineDetails(){

        System.out.println("----- Last Medicine Stored -----");
        System.out.println("Medicine : " + medicineName);
        System.out.println("Manufacturer : " + manufacturer);
        System.out.println("Type : " + type);
        System.out.println("Price : " + price);
        System.out.println("Expiry Date : " + expiryDate);
        System.out.println("Dosage : " + dosage);
        System.out.println("Prescription Required : " + prescriptionRequired);
    }
}