class MovieSubscriptionForm {
    static String userName = "Neha Sharma";
    static String emailId = "neha@gmail.com";
    static String subscriptionPlan = "Premium";
    static int planDuration = 12;
    static int monthlyCost = 499;
    static String preferredLanguage = "English";
    static boolean autoRenewalEnabled = true;
    static String paymentMethod = "Credit Card";
    static String deviceLimit = "4 Devices";
    static String subscriptionStatus = "Active";

    public static void main(String[] args) {
        System.out.println("User Name: " + userName);
        System.out.println("Email: " + emailId);
        System.out.println("Plan: " + subscriptionPlan);
        System.out.println("Duration (Months): " + planDuration);
        System.out.println("Cost: " + monthlyCost);
        System.out.println("Language: " + preferredLanguage);
        System.out.println("Auto Renewal: " + autoRenewalEnabled);
        System.out.println("Payment: " + paymentMethod);
        System.out.println("Device Limit: " + deviceLimit);
        System.out.println("Status: " + subscriptionStatus);
    }
}
