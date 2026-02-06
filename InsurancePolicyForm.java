class InsurancePolicyForm {
    static String policyHolderName = "Lakshmi Devi";
    static String policyType = "Health Insurance";
    static int policyTenure = 10;
    static int sumAssured = 500000;
    static int premiumAmount = 12000;
    static String nomineeName = "Suresh";
    static String relationship = "Husband";
    static boolean medicalTestRequired = true;
    static String policyStartDate = "01-Apr-2026";
    static String policyStatus = "Active";

    public static void main(String[] args) {
        System.out.println("Holder: " + policyHolderName);
        System.out.println("Policy Type: " + policyType);
        System.out.println("Tenure: " + policyTenure);
        System.out.println("Sum Assured: " + sumAssured);
        System.out.println("Premium: " + premiumAmount);
        System.out.println("Nominee: " + nomineeName);
        System.out.println("Relation: " + relationship);
        System.out.println("Medical Test: " + medicalTestRequired);
        System.out.println("Start Date: " + policyStartDate);
        System.out.println("Status: " + policyStatus);
    }
}
