class BankAccountOpeningForm {
    static String accountHolderName = "Ramesh Kumar";
    static String accountType = "Savings";
    static String branchName = "MG Road";
    static String ifscCode = "BANK0001234";
    static String aadhaarNumber = "567812349876";
    static String panNumber = "ABCDE1234F";
    static int initialDeposit = 5000;
    static boolean debitCardRequired = true;
    static String mobileNumber = "9988776655";
    static String accountStatus = "Active";

    public static void main(String[] args) {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Branch: " + branchName);
        System.out.println("IFSC: " + ifscCode);
        System.out.println("Aadhaar: " + aadhaarNumber);
        System.out.println("PAN: " + panNumber);
        System.out.println("Deposit: " + initialDeposit);
        System.out.println("Debit Card: " + debitCardRequired);
        System.out.println("Mobile: " + mobileNumber);
        System.out.println("Status: " + accountStatus);
    }
}
