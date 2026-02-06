class JobApplicationForm {
    static String applicantName = "Sneha Patel";
    static String emailId = "sneha@gmail.com";
    static String qualification = "B.E Computer Science";
    static int experienceYears = 2;
    static String jobRole = "Software Developer";
    static String companyName = "TechNova";
    static String resumeStatus = "Uploaded";
    static boolean interviewScheduled = false;
    static String locationPreference = "Remote";
    static String applicationId = "JOB5678";

    public static void main(String[] args) {
        System.out.println("Applicant Name: " + applicantName);
        System.out.println("Email: " + emailId);
        System.out.println("Qualification: " + qualification);
        System.out.println("Experience: " + experienceYears);
        System.out.println("Role: " + jobRole);
        System.out.println("Company: " + companyName);
        System.out.println("Resume: " + resumeStatus);
        System.out.println("Interview Scheduled: " + interviewScheduled);
        System.out.println("Location: " + locationPreference);
        System.out.println("Application ID: " + applicationId);
    }
}
