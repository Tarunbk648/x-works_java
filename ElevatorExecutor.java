class ElevatorExecutor {

    public static void main(String[] args) {

        Elevator.createElevator("Otis","Passenger",10,15,"Fast","Mall",true);
        Elevator.createElevator("Kone","Service",12,20,"Medium","Hospital",true);
        Elevator.createElevator("Schindler","Passenger",8,10,"Fast","Apartment",true);
        Elevator.createElevator("ThyssenKrupp","Cargo",20,25,"Slow","Warehouse",false);
        Elevator.createElevator("Johnson","Passenger",6,8,"Medium","Office",true);

        Elevator.createElevator("Otis","Panoramic",10,18,"Fast","Hotel",true);
        Elevator.createElevator("Kone","Passenger",12,22,"Fast","ITPark",true);
        Elevator.createElevator("Schindler","Service",15,30,"Medium","Factory",false);
        Elevator.createElevator("Johnson","Cargo",25,35,"Slow","Industry",false);
        Elevator.createElevator("ThyssenKrupp","Passenger",10,12,"Fast","Mall",true);

        Elevator.createElevator("Otis","Passenger",8,14,"Medium","Metro",true);
        Elevator.createElevator("Kone","Glass",6,9,"Fast","Airport",true);
        Elevator.createElevator("Schindler","Passenger",10,16,"Fast","Tower",true);
        Elevator.createElevator("Johnson","Service",18,28,"Medium","Hospital",true);
        Elevator.createElevator("Otis","Cargo",30,40,"Slow","Port",false);

        Elevator.createElevator("Kone","Passenger",14,24,"Fast","TechPark",true);
        Elevator.createElevator("Schindler","Panoramic",10,20,"Fast","Resort",true);
        Elevator.createElevator("Johnson","Passenger",8,12,"Medium","School",true);
        Elevator.createElevator("Otis","Service",16,26,"Medium","Mall",true);
        Elevator.createElevator("Kone","Cargo",22,32,"Slow","Warehouse",false);

        Elevator.createElevator("Schindler","Passenger",9,14,"Fast","Apartment",true);
        Elevator.createElevator("Johnson","Glass",7,11,"Fast","Showroom",true);
        Elevator.createElevator("Otis","Passenger",12,18,"Medium","Hospital",true);
        Elevator.createElevator("Kone","Passenger",15,25,"Fast","Office",true);
        Elevator.createElevator("ThyssenKrupp","Cargo",28,38,"Slow","Factory",false);

        Elevator.createElevator("Otis","Panoramic",10,21,"Fast","Hotel",true);
        Elevator.createElevator("Schindler","Service",13,23,"Medium","Mall",true);
        Elevator.createElevator("Johnson","Passenger",6,10,"Fast","Apartment",true);
        Elevator.createElevator("Kone","Passenger",11,19,"Medium","Metro",true);
        Elevator.createElevator("Otis","Cargo",24,34,"Slow","Industry",false);

        Elevator.createElevator("Schindler","Passenger",8,13,"Fast","Tower",true);
        Elevator.createElevator("Johnson","Service",17,27,"Medium","Airport",true);
        Elevator.createElevator("Kone","Glass",9,15,"Fast","Resort",true);
        Elevator.createElevator("Otis","Passenger",10,17,"Medium","Office",true);
        Elevator.createElevator("ThyssenKrupp","Cargo",26,36,"Slow","Port",false);

        Elevator.createElevator("Schindler","Passenger",12,20,"Fast","Mall",true);
        Elevator.createElevator("Otis","Panoramic",14,22,"Fast","Hotel",true);

        Elevator.getElevatorDetails();
    }
}