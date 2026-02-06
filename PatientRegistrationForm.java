class PatientRegistrationForm {
    static String patientName = "Suresh M";
    static int age = 45;
    static String gender = "Male";
    static String contactNumber = "9123456789";
    static String bloodGroup = "B+";
    static String department = "Cardiology";
    static String doctorAssigned = "Dr. Meena";
    static String appointmentDate = "10-Feb-2026";
    static boolean insuranceAvailable = true;
    static String patientId = "PAT1023";

    public static void main(String[] args) {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Contact: " + contactNumber);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Department: " + department);
        System.out.println("Doctor: " + doctorAssigned);
        System.out.println("Date: " + appointmentDate);
        System.out.println("Insurance: " + insuranceAvailable);
        System.out.println("Patient ID: " + patientId);
    }
}
