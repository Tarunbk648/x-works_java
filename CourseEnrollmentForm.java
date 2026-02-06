class CourseEnrollmentForm {
    static String studentName = "Rahul Kumar";
    static String studentEmail = "rahul@gmail.com";
    static String courseName = "Java Programming";
    static int courseDuration = 6;
    static String instructorName = "Mr. Arjun";
    static String learningMode = "Online";
    static int courseFee = 12000;
    static boolean certificateIncluded = true;
    static String startDate = "01-Mar-2026";
    static String batchTiming = "Evening";

    public static void main(String[] args) {
        System.out.println("Student Name: " + studentName);
        System.out.println("Email: " + studentEmail);
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + courseDuration);
        System.out.println("Instructor: " + instructorName);
        System.out.println("Mode: " + learningMode);
        System.out.println("Fee: " + courseFee);
        System.out.println("Certificate: " + certificateIncluded);
        System.out.println("Start Date: " + startDate);
        System.out.println("Batch Timing: " + batchTiming);
    }
}
