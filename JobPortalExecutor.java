class JobPortalExecutor{

public static void main(String[] args){

    String companyName="Google";
    System.out.println("Job details of Google");
    String[] jobs=JobPortal.searchJobsByCompany(companyName);
    JobPortal.displayJobNames(jobs);

    System.out.println();

    companyName="Microsoft";
    System.out.println("Job details of Microsoft");
    jobs=JobPortal.searchJobsByCompany(companyName);
    JobPortal.displayJobNames(jobs);

    System.out.println();

    companyName="Amazon";
    System.out.println("Job details of Amazon");
    jobs=JobPortal.searchJobsByCompany(companyName);
    JobPortal.displayJobNames(jobs);

    System.out.println();

    companyName="TCS";
    System.out.println("Job details of TCS");
    jobs=JobPortal.searchJobsByCompany(companyName);
    JobPortal.displayJobNames(jobs);

    System.out.println();

    companyName="Infosys";
    System.out.println("Job details of Infosys");
    jobs=JobPortal.searchJobsByCompany(companyName);
    JobPortal.displayJobNames(jobs);

}
}