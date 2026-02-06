class EventBookingForm {
    static String eventName = "Tech Conference 2026";
    static String participantName = "Arjun Rao";
    static String eventDate = "12-May-2026";
    static String eventLocation = "Bangalore";
    static int ticketCount = 2;
    static int ticketPrice = 3000;
    static String seatCategory = "VIP";
    static boolean foodIncluded = true;
    static String organizerName = "TechWorld";
    static String bookingReference = "EVT4567";

    public static void main(String[] args) {
        System.out.println("Event: " + eventName);
        System.out.println("Participant: " + participantName);
        System.out.println("Date: " + eventDate);
        System.out.println("Location: " + eventLocation);
        System.out.println("Tickets: " + ticketCount);
        System.out.println("Price: " + ticketPrice);
        System.out.println("Category: " + seatCategory);
        System.out.println("Food Included: " + foodIncluded);
        System.out.println("Organizer: " + organizerName);
        System.out.println("Reference: " + bookingReference);
    }
}
