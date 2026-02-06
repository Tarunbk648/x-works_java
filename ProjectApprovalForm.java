class ProjectApprovalForm {
    static String projectTitle = "E-Governance Portal";
    static String projectCode = "PRJ9021";
    static String clientName = "State IT Department";
    static double projectBudget = 12500000.00;
    static String projectStartDate = "01-May-2026";
    static int projectDurationMonths = 12;
    static String projectManager = "Anita Desai";
    static String projectPriority = "High";
    static boolean budgetApproved = true;
    static String approvalAuthority = "Board Committee";

    public static void main(String[] args) {
        System.out.println(projectTitle);
        System.out.println(projectCode);
        System.out.println(clientName);
        System.out.println(projectBudget);
        System.out.println(projectStartDate);
        System.out.println(projectDurationMonths);
        System.out.println(projectManager);
        System.out.println(projectPriority);
        System.out.println(budgetApproved);
        System.out.println(approvalAuthority);
    }
}
