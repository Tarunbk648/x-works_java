class Elevator {

    static String brand;
    static String type;
    static int capacity;
    static int floors;
    static String speed;
    static String location;
    static boolean emergencyAlarm;

    public static boolean createElevator(
            String b, String t, int c,
            int f, String s, String l,
            boolean ea) {

        boolean isCreated = false;

        boolean v1=false,v2=false,v3=false,
                v4=false,v5=false,v6=false;

        if(b!=null && !b.isEmpty()){
            System.out.println("Brand validated : " + b);
            brand=b; v1=true;
        }else{
            System.out.println("Brand invalid");
        }

        if(t!=null && !t.isEmpty()){
            System.out.println("Type validated : " + t);
            type=t; v2=true;
        }else{
            System.out.println("Type invalid");
        }

        if(c>0){
            System.out.println("Capacity validated : " + c);
            capacity=c; v3=true;
        }else{
            System.out.println("Capacity invalid");
        }

        if(f>0){
            System.out.println("Floors validated : " + f);
            floors=f; v4=true;
        }else{
            System.out.println("Floors invalid");
        }

        if(s!=null && !s.isEmpty()){
            System.out.println("Speed validated : " + s);
            speed=s; v5=true;
        }else{
            System.out.println("Speed invalid");
        }

        if(l!=null && !l.isEmpty()){
            System.out.println("Location validated : " + l);
            location=l; v6=true;
        }else{
            System.out.println("Location invalid");
        }

        if(v1 && v2 && v3 && v4 && v5 && v6){
            emergencyAlarm = ea;
            System.out.println("All Elevator Details Validated\n");
            isCreated=true;
        }else{
            System.out.println("Elevator Details Invalidated\n");
        }

        return isCreated;
    }

    public static void getElevatorDetails(){

        System.out.println("----- Last Elevator Stored -----");
        System.out.println("Brand : " + brand);
        System.out.println("Type : " + type);
        System.out.println("Capacity : " + capacity);
        System.out.println("Floors : " + floors);
        System.out.println("Speed : " + speed);
        System.out.println("Location : " + location);
        System.out.println("Emergency Alarm : " + emergencyAlarm);
    }
}