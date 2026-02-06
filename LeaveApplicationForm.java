class LeaveApplicationForm {
    static String employeeName = "Sneha Rao";
    static String employeeCode = "HR342";
    static String leaveCategory = "Sick Leave";
    static String leaveStartDate = "12-Mar-2026";
    static String leaveEndDate = "14-Mar-2026";
    static int numberOfDays = 3;
    static String leaveReason = "Medical Rest";
    static String appliedDate = "10-Mar-2026";
    static boolean managerApproved = false;
    static String approvalStatus = "Pending";

    public static void main(String[] args) {
        System.out.println(employeeName);
        System.out.println(employeeCode);
        System.out.println(leaveCategory);
        System.out.println(leaveStartDate);
        System.out.println(leaveEndDate);
        System.out.println(numberOfDays);
        System.out.println(leaveReason);
        System.out.println(appliedDate);
        System.out.println(managerApproved);
        System.out.println(approvalStatus);
    }
}
