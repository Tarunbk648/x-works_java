class JobPortal{
public static String[] searchJobsByCompany(String companyName){

if(companyName.equals("Google")){
    String[] jobs={"Software Engineer","Cloud Engineer","AI Engineer","ML Engineer",
    "Data Scientist","Product Manager","UX Designer","Security Engineer",
    "DevOps Engineer","Android Developer","Site Reliability Engineer",
    "Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","Business Analyst","Technical Program Manager",
    "Database Engineer","System Architect","Research Scientist"};
    return jobs;
}

else if(companyName.equals("Microsoft")){
    String[] jobs={"Software Developer","Azure Engineer","Data Engineer","Cyber Security Analyst",
    "Game Developer","Cloud Architect","Product Manager","UI Developer",
    "Backend Developer","Frontend Developer","Technical Consultant",
    "Support Engineer","DevOps Engineer","QA Analyst","Business Analyst",
    "AI Engineer","ML Engineer","Database Administrator",
    "Network Engineer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Amazon")){
    String[] jobs={"SDE","Cloud Engineer","AWS Architect","DevOps Engineer",
    "Data Scientist","ML Engineer","Operations Manager",
    "Business Analyst","Product Manager","Security Engineer",
    "Support Engineer","QA Engineer","Logistics Manager",
    "Backend Developer","Frontend Developer","Full Stack Developer",
    "Technical Program Manager","Network Engineer",
    "Database Engineer","Systems Engineer"};
    return jobs;
}

else if(companyName.equals("Infosys")){
    String[] jobs={"Systems Engineer","Java Developer","SAP Consultant",
    "Oracle Developer","Test Engineer","DevOps Engineer",
    "Cloud Consultant","Business Analyst","Project Manager",
    "Network Engineer","Database Administrator","Security Analyst",
    "UI Developer","Backend Developer","Full Stack Developer",
    "AI Engineer","Automation Engineer","Technical Lead",
    "Support Analyst","Infrastructure Engineer"};
    return jobs;
}

else if(companyName.equals("TCS")){
    String[] jobs={"Assistant System Engineer","IT Analyst","Mainframe Developer",
    "Cloud Engineer","Cyber Security Engineer","Big Data Engineer",
    "Scrum Master","QA Analyst","Business Consultant",
    "Backend Developer","Frontend Developer","Full Stack Engineer",
    "DevOps Lead","Database Engineer","Network Administrator",
    "Technical Consultant","Product Owner","RPA Developer",
    "Automation Tester","Support Engineer"};
    return jobs;
}

else if(companyName.equals("Wipro")){
    String[] jobs={"Project Engineer","Cloud Consultant","Java Developer",
    "Python Developer","Data Analyst","Cyber Security Engineer",
    "DevOps Engineer","QA Tester","UI Designer",
    "Backend Developer","Frontend Developer","Technical Architect",
    "Support Engineer","Network Engineer","Database Engineer",
    "AI Specialist","Automation Engineer","Scrum Master",
    "Product Analyst","System Administrator"};
    return jobs;
}

else if(companyName.equals("HCL")){
    String[] jobs={"Systems Analyst","Java Developer","SAP Consultant",
    "Cloud Engineer","Security Analyst","DevOps Engineer",
    "QA Engineer","Business Analyst","Data Scientist",
    "Backend Developer","Frontend Developer","Full Stack Developer",
    "Network Engineer","Infrastructure Engineer","Automation Engineer",
    "Technical Lead","Database Administrator","Product Manager",
    "IT Consultant","Support Executive"};
    return jobs;
}

else if(companyName.equals("Accenture")){
    String[] jobs={"Associate Software Engineer","Cloud Architect",
    "SAP Consultant","Oracle Developer","Security Analyst",
    "DevOps Consultant","Data Engineer","AI Engineer",
    "Backend Developer","Frontend Developer","Full Stack Developer",
    "Business Consultant","Project Manager","QA Analyst",
    "Scrum Master","Automation Engineer","Network Engineer",
    "Technical Architect","Support Analyst","Product Owner"};
    return jobs;
}

else if(companyName.equals("Cognizant")){
    String[] jobs={"Programmer Analyst","Java Developer","Python Developer",
    "Cloud Engineer","DevOps Engineer","Security Consultant",
    "QA Engineer","Business Analyst","Data Scientist",
    "Backend Developer","Frontend Developer","Full Stack Developer",
    "Database Engineer","Network Engineer","Technical Lead",
    "Automation Tester","Project Manager","SAP Consultant",
    "UI Developer","Support Engineer"};
    return jobs;
}

else if(companyName.equals("Capgemini")){
    String[] jobs={"Software Engineer","Cloud Consultant","SAP Developer",
    "Oracle DBA","Security Analyst","DevOps Engineer",
    "QA Engineer","Business Analyst","Data Engineer",
    "Backend Developer","Frontend Developer","Full Stack Developer",
    "Network Engineer","Automation Engineer","Technical Lead",
    "Project Manager","UI Designer","Database Administrator",
    "Product Analyst","Support Engineer"};
    return jobs;
}
else if(companyName.equals("Oracle")){
    String[] jobs={"Java Developer","Database Administrator","Cloud Engineer",
    "DevOps Engineer","Security Engineer","Product Manager",
    "Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","Business Analyst","Technical Consultant",
    "AI Engineer","Data Scientist","Network Engineer",
    "System Architect","Automation Engineer","Support Engineer",
    "UI Developer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("IBM")){
    String[] jobs={"Associate Developer","Cloud Engineer","AI Specialist",
    "Data Engineer","Security Consultant","DevOps Engineer",
    "Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","Business Analyst","Project Manager",
    "Technical Lead","Automation Engineer","Database Administrator",
    "Network Engineer","Support Analyst","UI Designer",
    "Product Manager","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Dell")){
    String[] jobs={"Systems Engineer","Cloud Engineer","Security Analyst",
    "DevOps Engineer","Data Analyst","Backend Developer",
    "Frontend Developer","Full Stack Developer","QA Engineer",
    "Business Analyst","Project Manager","Network Engineer",
    "Database Engineer","Automation Engineer","Technical Lead",
    "Support Engineer","UI Developer","Product Owner",
    "Infrastructure Engineer","AI Engineer"};
    return jobs;
}

else if(companyName.equals("HP")){
    String[] jobs={"Software Developer","Cloud Consultant","Security Engineer",
    "DevOps Engineer","Data Scientist","Backend Developer",
    "Frontend Developer","Full Stack Developer","QA Tester",
    "Business Analyst","Project Manager","Network Engineer",
    "Database Administrator","Automation Engineer","Technical Lead",
    "Support Analyst","UI Designer","AI Engineer",
    "Product Manager","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Cisco")){
    String[] jobs={"Network Engineer","Cloud Engineer","Security Analyst",
    "DevOps Engineer","Data Engineer","Backend Developer",
    "Frontend Developer","Full Stack Developer","QA Engineer",
    "Business Consultant","Project Manager","Automation Engineer",
    "Database Engineer","Technical Lead","Support Engineer",
    "UI Developer","AI Specialist","Infrastructure Engineer",
    "Product Manager","System Architect"};
    return jobs;
}

else if(companyName.equals("Intel")){
    String[] jobs={"Hardware Engineer","Embedded Engineer","AI Engineer",
    "ML Engineer","Cloud Engineer","Backend Developer",
    "Frontend Developer","Full Stack Developer","QA Engineer",
    "Business Analyst","Project Manager","Automation Engineer",
    "Database Engineer","Security Analyst","Technical Lead",
    "Support Engineer","UI Designer","Network Engineer",
    "Product Owner","System Architect"};
    return jobs;
}

else if(companyName.equals("Nvidia")){
    String[] jobs={"GPU Engineer","AI Researcher","ML Engineer",
    "Cloud Engineer","Backend Developer","Frontend Developer",
    "Full Stack Developer","QA Engineer","Data Scientist",
    "Project Manager","Security Engineer","Automation Engineer",
    "Database Administrator","Technical Lead","Support Engineer",
    "UI Developer","Network Engineer","Product Manager",
    "Solutions Architect","DevOps Engineer"};
    return jobs;
}

else if(companyName.equals("Adobe")){
    String[] jobs={"Software Engineer","UI Designer","Cloud Engineer",
    "AI Engineer","Backend Developer","Frontend Developer",
    "Full Stack Developer","QA Engineer","Business Analyst",
    "Project Manager","Automation Engineer","Security Analyst",
    "Database Engineer","Technical Lead","Support Engineer",
    "UX Researcher","Network Engineer","Product Manager",
    "Solutions Architect","DevOps Engineer"};
    return jobs;
}

else if(companyName.equals("Salesforce")){
    String[] jobs={"Salesforce Developer","Cloud Engineer","Security Consultant",
    "Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","Business Analyst","Project Manager",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Engineer","UI Developer","Network Engineer",
    "Product Owner","Solutions Architect","DevOps Engineer",
    "AI Engineer","Data Scientist"};
    return jobs;
}

else if(companyName.equals("SAP")){
    String[] jobs={"SAP Consultant","ABAP Developer","Cloud Engineer",
    "Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","Business Analyst","Project Manager",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Engineer","UI Developer","Security Analyst",
    "Product Manager","Solutions Architect","DevOps Engineer",
    "AI Specialist","Data Engineer"};
    return jobs;
}
else if(companyName.equals("PayPal")){
    String[] jobs={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","Security Engineer","Data Scientist","ML Engineer",
    "Product Manager","Business Analyst","DevOps Engineer","QA Engineer",
    "Database Administrator","Network Engineer","Technical Lead",
    "Automation Engineer","Support Engineer","UI Developer",
    "Solutions Architect","Fraud Analyst"};
    return jobs;
}

else if(companyName.equals("Uber")){
    String[] jobs={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Mobile App Developer","Cloud Engineer","DevOps Engineer","Security Engineer",
    "Data Scientist","ML Engineer","Product Manager","Business Analyst",
    "QA Engineer","Automation Engineer","Database Engineer",
    "Network Engineer","Technical Lead","Support Engineer",
    "UI Designer","Operations Manager"};
    return jobs;
}

else if(companyName.equals("Ola")){
    String[] jobs={"Software Developer","Mobile App Developer","Cloud Engineer","Backend Developer",
    "Frontend Developer","Full Stack Developer","QA Engineer","DevOps Engineer",
    "Security Analyst","Data Analyst","ML Engineer","Business Analyst",
    "Project Manager","Automation Engineer","Network Engineer",
    "Database Administrator","Technical Lead","Support Executive",
    "UI Developer","Operations Analyst"};
    return jobs;
}

else if(companyName.equals("Flipkart")){
    String[] jobs={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Data Scientist","ML Engineer",
    "Product Manager","Business Analyst","QA Engineer","Security Engineer",
    "Automation Tester","Database Engineer","Network Engineer",
    "Technical Lead","Support Engineer","UI Designer",
    "Operations Manager","Logistics Manager"};
    return jobs;
}

else if(companyName.equals("Zomato")){
    String[] jobs={"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Engineer","Data Analyst",
    "ML Engineer","Product Manager","QA Engineer","Business Analyst",
    "Automation Engineer","Database Administrator","Network Engineer",
    "Technical Lead","Support Engineer","UI Developer",
    "Operations Manager","Marketing Executive"};
    return jobs;
}

else if(companyName.equals("Swiggy")){
    String[] jobs={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Analyst","Data Scientist",
    "ML Engineer","Product Manager","QA Engineer","Business Analyst",
    "Automation Engineer","Database Engineer","Network Engineer",
    "Technical Lead","Support Executive","UI Designer",
    "Operations Manager","Logistics Executive"};
    return jobs;
}

else if(companyName.equals("PhonePe")){
    String[] jobs={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Engineer","Data Scientist",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Administrator","Network Engineer",
    "Technical Lead","Support Analyst","UI Developer",
    "Fraud Analyst","Risk Analyst"};
    return jobs;
}

else if(companyName.equals("Razorpay")){
    String[] jobs={"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","Security Engineer","DevOps Engineer","Data Analyst",
    "ML Engineer","Product Manager","QA Engineer","Business Analyst",
    "Automation Tester","Database Engineer","Network Engineer",
    "Technical Lead","Support Executive","UI Designer",
    "Risk Analyst","Compliance Officer"};
    return jobs;
}

else if(companyName.equals("Byjus")){
    String[] jobs={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Mobile Developer","Cloud Engineer","DevOps Engineer","QA Engineer",
    "Product Manager","Business Analyst","Data Analyst","ML Engineer",
    "Security Engineer","Automation Engineer","Database Administrator",
    "Technical Lead","Support Executive","UI Designer",
    "Content Manager","Marketing Executive"};
    return jobs;
}

else if(companyName.equals("Unacademy")){
    String[] jobs={"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","QA Engineer","Data Scientist",
    "ML Engineer","Product Manager","Business Analyst","Security Analyst",
    "Automation Engineer","Database Engineer","Network Engineer",
    "Technical Lead","Support Executive","UI Developer",
    "Content Creator","Marketing Analyst"};
    return jobs;
}

else if(companyName.equals("Meesho")){
    String[] jobs={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","QA Engineer","Data Analyst",
    "ML Engineer","Product Manager","Business Analyst","Security Engineer",
    "Automation Tester","Database Engineer","Network Engineer",
    "Technical Lead","Support Executive","UI Designer",
    "Operations Manager","Logistics Coordinator"};
    return jobs;
}

else if(companyName.equals("Myntra")){
    String[] jobs={"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","QA Engineer","Security Analyst",
    "Data Scientist","ML Engineer","Product Manager","Business Analyst",
    "Automation Engineer","Database Administrator","Network Engineer",
    "Technical Lead","Support Executive","UI Designer",
    "Marketing Executive","Brand Manager"};
    return jobs;
}

else if(companyName.equals("Reliance")){
    String[] jobs={"Software Engineer","Cloud Engineer","Security Engineer","Data Analyst",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Product Manager","Business Analyst","Network Engineer",
    "Database Administrator","Automation Engineer","Technical Lead",
    "Support Executive","UI Developer","Operations Manager",
    "Project Manager","System Administrator"};
    return jobs;
}

else if(companyName.equals("Airtel")){
    String[] jobs={"Network Engineer","Cloud Engineer","Security Analyst","Backend Developer",
    "Frontend Developer","Full Stack Developer","QA Engineer","DevOps Engineer",
    "Data Scientist","ML Engineer","Product Manager","Business Analyst",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Designer","Operations Analyst",
    "Telecom Engineer","System Architect"};
    return jobs;
}

else if(companyName.equals("Jio")){
    String[] jobs={"Network Engineer","Cloud Engineer","Security Engineer","Backend Developer",
    "Frontend Developer","Full Stack Developer","QA Engineer","DevOps Engineer",
    "Data Analyst","ML Engineer","Product Manager","Business Analyst",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Developer","Operations Manager",
    "Telecom Engineer","System Administrator"};
    return jobs;
}

else if(companyName.equals("Vodafone")){
    String[] jobs={"Network Engineer","Cloud Engineer","Security Analyst","Backend Developer",
    "Frontend Developer","Full Stack Developer","QA Engineer","DevOps Engineer",
    "Data Scientist","ML Engineer","Product Manager","Business Analyst",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Designer","Operations Analyst",
    "Telecom Specialist","System Architect"};
    return jobs;
}

else if(companyName.equals("L&T")){
    String[] jobs={"Project Engineer","Cloud Engineer","Security Analyst","Backend Developer",
    "Frontend Developer","Full Stack Developer","QA Engineer","DevOps Engineer",
    "Data Analyst","ML Engineer","Product Manager","Business Analyst",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Developer","Operations Manager",
    "Civil Engineer","Mechanical Engineer"};
    return jobs;
}

else if(companyName.equals("Bosch")){
    String[] jobs={"Embedded Engineer","Software Developer","Cloud Engineer","Security Analyst",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Data Scientist","ML Engineer","Business Analyst",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Designer","Mechanical Engineer",
    "Electrical Engineer","Project Manager"};
    return jobs;
}

else if(companyName.equals("Siemens")){
    String[] jobs={"Software Engineer","Embedded Engineer","Cloud Engineer","Security Analyst",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Data Analyst","ML Engineer","Business Analyst",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Developer","Mechanical Engineer",
    "Electrical Engineer","Project Manager"};
    return jobs;
}

else if(companyName.equals("Hitachi")){
    String[] jobs={"Software Developer","Cloud Engineer","Security Engineer","Backend Developer",
    "Frontend Developer","Full Stack Developer","QA Engineer","DevOps Engineer",
    "Data Scientist","ML Engineer","Business Analyst","Product Manager",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Designer","Mechanical Engineer",
    "Electrical Engineer","Project Manager"};
    return jobs;
}
else if(companyName.equals("Sony")){
    String[] jobs={"Software Engineer","Embedded Engineer","Cloud Engineer","Security Analyst",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Data Scientist","ML Engineer","Business Analyst",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Designer","Product Manager",
    "Network Engineer","System Architect"};
    return jobs;
}

else if(companyName.equals("Samsung")){
    String[] jobs={"Software Developer","Hardware Engineer","Cloud Engineer","Security Engineer",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Data Analyst","ML Engineer","Product Manager",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Developer","Network Engineer",
    "Research Engineer","System Architect"};
    return jobs;
}

else if(companyName.equals("LG")){
    String[] jobs={"Software Engineer","Embedded Engineer","Cloud Engineer","Security Analyst",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Data Scientist","ML Engineer","Business Analyst",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Designer","Network Engineer",
    "Product Manager","Project Manager"};
    return jobs;
}

else if(companyName.equals("Panasonic")){
    String[] jobs={"Software Developer","Embedded Engineer","Cloud Engineer","Security Engineer",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Data Analyst","ML Engineer","Business Analyst",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Developer","Network Engineer",
    "Product Manager","System Architect"};
    return jobs;
}

else if(companyName.equals("TataSteel")){
    String[] jobs={"Mechanical Engineer","Electrical Engineer","Software Engineer","Cloud Engineer",
    "Security Analyst","Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","DevOps Engineer","Data Analyst","Business Analyst",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Operations Manager","System Administrator"};
    return jobs;
}

else if(companyName.equals("Mahindra")){
    String[] jobs={"Mechanical Engineer","Electrical Engineer","Software Developer","Cloud Engineer",
    "Security Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","DevOps Engineer","Data Scientist","Business Analyst",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Operations Manager","System Architect"};
    return jobs;
}

else if(companyName.equals("Bajaj")){
    String[] jobs={"Mechanical Engineer","Electrical Engineer","Software Engineer","Cloud Engineer",
    "Security Analyst","Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","DevOps Engineer","Data Analyst","Business Analyst",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Operations Executive","System Administrator"};
    return jobs;
}

else if(companyName.equals("Hero")){
    String[] jobs={"Mechanical Engineer","Electrical Engineer","Software Developer","Cloud Engineer",
    "Security Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","DevOps Engineer","Data Scientist","Business Analyst",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Operations Manager","System Architect"};
    return jobs;
}

else if(companyName.equals("TVS")){
    String[] jobs={"Mechanical Engineer","Electrical Engineer","Software Engineer","Cloud Engineer",
    "Security Analyst","Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","DevOps Engineer","Data Analyst","Business Analyst",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Operations Manager","System Administrator"};
    return jobs;
}

else if(companyName.equals("Hyundai")){
    String[] jobs={"Mechanical Engineer","Electrical Engineer","Software Developer","Cloud Engineer",
    "Security Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","DevOps Engineer","Data Scientist","Business Analyst",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Operations Manager","System Architect"};
    return jobs;
}

else if(companyName.equals("Honda")){
    String[] jobs={"Mechanical Engineer","Electrical Engineer","Software Engineer","Cloud Engineer",
    "Security Analyst","Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","DevOps Engineer","Data Analyst","Business Analyst",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Operations Manager","System Administrator"};
    return jobs;
}

else if(companyName.equals("Toyota")){
    String[] jobs={"Mechanical Engineer","Electrical Engineer","Software Developer","Cloud Engineer",
    "Security Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","DevOps Engineer","Data Scientist","Business Analyst",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Operations Manager","System Architect"};
    return jobs;
}

else if(companyName.equals("Maruti")){
    String[] jobs={"Mechanical Engineer","Electrical Engineer","Software Engineer","Cloud Engineer",
    "Security Analyst","Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","DevOps Engineer","Data Analyst","Business Analyst",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Operations Executive","System Administrator"};
    return jobs;
}

else if(companyName.equals("KPMG")){
    String[] jobs={"Consultant","Business Analyst","Data Analyst","Cloud Engineer",
    "Security Consultant","Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","DevOps Engineer","Product Manager","Automation Engineer",
    "Database Administrator","Technical Lead","Support Executive",
    "UI Developer","Project Manager","Risk Analyst",
    "Compliance Officer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("EY")){
    String[] jobs={"Consultant","Business Analyst","Data Scientist","Cloud Engineer",
    "Security Analyst","Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","DevOps Engineer","Product Manager","Automation Engineer",
    "Database Engineer","Technical Lead","Support Executive",
    "UI Designer","Project Manager","Risk Analyst",
    "Compliance Officer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("PwC")){
    String[] jobs={"Consultant","Business Analyst","Data Analyst","Cloud Engineer",
    "Security Consultant","Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","DevOps Engineer","Product Manager","Automation Engineer",
    "Database Administrator","Technical Lead","Support Executive",
    "UI Developer","Project Manager","Risk Analyst",
    "Compliance Officer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Deloitte")){
    String[] jobs={"Consultant","Business Analyst","Data Scientist","Cloud Engineer",
    "Security Analyst","Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","DevOps Engineer","Product Manager","Automation Engineer",
    "Database Engineer","Technical Lead","Support Executive",
    "UI Designer","Project Manager","Risk Analyst",
    "Compliance Officer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("GoldmanSachs")){
    String[] jobs={"Software Engineer","Quant Analyst","Data Scientist","Cloud Engineer",
    "Security Analyst","Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","DevOps Engineer","Product Manager","Automation Engineer",
    "Database Administrator","Technical Lead","Support Executive",
    "UI Developer","Project Manager","Risk Analyst",
    "Compliance Officer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("JPMorgan")){
    String[] jobs={"Software Developer","Quant Developer","Data Analyst","Cloud Engineer",
    "Security Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","DevOps Engineer","Product Manager","Automation Engineer",
    "Database Engineer","Technical Lead","Support Executive",
    "UI Designer","Project Manager","Risk Analyst",
    "Compliance Officer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("MorganStanley")){
    String[] jobs={"Software Engineer","Quant Analyst","Data Scientist","Cloud Engineer",
    "Security Analyst","Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","DevOps Engineer","Product Manager","Automation Engineer",
    "Database Administrator","Technical Lead","Support Executive",
    "UI Developer","Project Manager","Risk Analyst",
    "Compliance Officer","Solutions Architect"};
    return jobs;
}
else if(companyName.equals("HSBC")){
    String[] jobs={"Software Engineer","Data Analyst","Cloud Engineer","Security Analyst",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Product Manager","Business Analyst","Automation Engineer",
    "Database Administrator","Technical Lead","Support Executive",
    "UI Developer","Project Manager","Risk Analyst",
    "Compliance Officer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("CitiBank")){
    String[] jobs={"Software Developer","Data Scientist","Cloud Engineer","Security Engineer",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Product Manager","Business Analyst","Automation Engineer",
    "Database Engineer","Technical Lead","Support Executive",
    "UI Designer","Project Manager","Risk Analyst",
    "Compliance Officer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("AxisBank")){
    String[] jobs={"Software Engineer","Data Analyst","Cloud Engineer","Security Analyst",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Product Manager","Business Analyst","Automation Engineer",
    "Database Administrator","Technical Lead","Support Executive",
    "UI Developer","Project Manager","Risk Officer",
    "Compliance Officer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("HDFCBank")){
    String[] jobs={"Software Developer","Data Scientist","Cloud Engineer","Security Engineer",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Product Manager","Business Analyst","Automation Engineer",
    "Database Engineer","Technical Lead","Support Executive",
    "UI Designer","Project Manager","Risk Analyst",
    "Compliance Officer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("ICICIBank")){
    String[] jobs={"Software Engineer","Data Analyst","Cloud Engineer","Security Analyst",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Product Manager","Business Analyst","Automation Engineer",
    "Database Administrator","Technical Lead","Support Executive",
    "UI Developer","Project Manager","Risk Officer",
    "Compliance Officer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Kotak")){
    String[] jobs={"Software Developer","Data Scientist","Cloud Engineer","Security Engineer",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Product Manager","Business Analyst","Automation Engineer",
    "Database Engineer","Technical Lead","Support Executive",
    "UI Designer","Project Manager","Risk Analyst",
    "Compliance Officer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Zoho")){
    String[] jobs={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Analyst","Data Scientist",
    "ML Engineer","Product Manager","QA Engineer","Business Analyst",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Network Engineer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Freshworks")){
    String[] jobs={"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Engineer","Data Analyst",
    "ML Engineer","Product Manager","QA Engineer","Business Analyst",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Customer Success Manager","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Mindtree")){
    String[] jobs={"Software Engineer","Cloud Engineer","Security Analyst","Backend Developer",
    "Frontend Developer","Full Stack Developer","QA Engineer","DevOps Engineer",
    "Data Scientist","ML Engineer","Business Analyst","Product Manager",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Network Engineer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Mphasis")){
    String[] jobs={"Software Developer","Cloud Engineer","Security Engineer","Backend Developer",
    "Frontend Developer","Full Stack Developer","QA Engineer","DevOps Engineer",
    "Data Analyst","ML Engineer","Business Analyst","Product Manager",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Network Engineer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Virtusa")){
    String[] jobs={"Software Engineer","Cloud Engineer","Security Analyst","Backend Developer",
    "Frontend Developer","Full Stack Developer","QA Engineer","DevOps Engineer",
    "Data Scientist","ML Engineer","Business Analyst","Product Manager",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Network Engineer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Hexaware")){
    String[] jobs={"Software Developer","Cloud Engineer","Security Engineer","Backend Developer",
    "Frontend Developer","Full Stack Developer","QA Engineer","DevOps Engineer",
    "Data Analyst","ML Engineer","Business Analyst","Product Manager",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Network Engineer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Persistent")){
    String[] jobs={"Software Engineer","Cloud Engineer","Security Analyst","Backend Developer",
    "Frontend Developer","Full Stack Developer","QA Engineer","DevOps Engineer",
    "Data Scientist","ML Engineer","Business Analyst","Product Manager",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Network Engineer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Zensar")){
    String[] jobs={"Software Developer","Cloud Engineer","Security Engineer","Backend Developer",
    "Frontend Developer","Full Stack Developer","QA Engineer","DevOps Engineer",
    "Data Analyst","ML Engineer","Business Analyst","Product Manager",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Network Engineer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Birlasoft")){
    String[] jobs={"Software Engineer","Cloud Engineer","Security Analyst","Backend Developer",
    "Frontend Developer","Full Stack Developer","QA Engineer","DevOps Engineer",
    "Data Scientist","ML Engineer","Business Analyst","Product Manager",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Network Engineer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Lupin")){
    String[] jobs={"Pharma Analyst","Research Scientist","Data Analyst","Cloud Engineer",
    "Security Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","DevOps Engineer","Product Manager","Business Analyst",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Operations Manager","Compliance Officer"};
    return jobs;
}

else if(companyName.equals("DrReddys")){
    String[] jobs={"Research Scientist","Pharma Analyst","Data Scientist","Cloud Engineer",
    "Security Analyst","Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","DevOps Engineer","Product Manager","Business Analyst",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Operations Manager","Compliance Officer"};
    return jobs;
}

else if(companyName.equals("SunPharma")){
    String[] jobs={"Pharma Analyst","Research Engineer","Data Analyst","Cloud Engineer",
    "Security Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","DevOps Engineer","Product Manager","Business Analyst",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Operations Manager","Compliance Officer"};
    return jobs;
}

else if(companyName.equals("Cipla")){
    String[] jobs={"Research Scientist","Pharma Analyst","Data Scientist","Cloud Engineer",
    "Security Analyst","Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","DevOps Engineer","Product Manager","Business Analyst",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Operations Manager","Compliance Officer"};
    return jobs;
}

else if(companyName.equals("Biocon")){
    String[] jobs={"Research Scientist","Pharma Analyst","Data Analyst","Cloud Engineer",
    "Security Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","DevOps Engineer","Product Manager","Business Analyst",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Operations Manager","Compliance Officer"};
    return jobs;
}
else if(companyName.equals("Glenmark")){
    String[] jobs={"Research Scientist","Pharma Analyst","Data Analyst","Cloud Engineer",
    "Security Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","DevOps Engineer","Product Manager","Business Analyst",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Operations Manager","Compliance Officer"};
    return jobs;
}

else if(companyName.equals("Aurobindo")){
    String[] jobs={"Research Scientist","Pharma Analyst","Data Scientist","Cloud Engineer",
    "Security Analyst","Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","DevOps Engineer","Product Manager","Business Analyst",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Operations Manager","Compliance Officer"};
    return jobs;
}

else if(companyName.equals("TataMotors")){
    String[] jobs={"Mechanical Engineer","Electrical Engineer","Software Engineer","Cloud Engineer",
    "Security Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","DevOps Engineer","Data Analyst","Business Analyst",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Operations Manager","System Architect"};
    return jobs;
}

else if(companyName.equals("AshokLeyland")){
    String[] jobs={"Mechanical Engineer","Electrical Engineer","Software Developer","Cloud Engineer",
    "Security Analyst","Backend Developer","Frontend Developer","Full Stack Developer",
    "QA Engineer","DevOps Engineer","Data Scientist","Business Analyst",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Operations Manager","System Administrator"};
    return jobs;
}

else if(companyName.equals("Godrej")){
    String[] jobs={"Software Engineer","Cloud Engineer","Security Engineer","Data Analyst",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Product Manager","Business Analyst","Automation Engineer",
    "Database Administrator","Technical Lead","Support Executive",
    "UI Designer","Project Manager","Operations Manager",
    "Marketing Executive","System Architect"};
    return jobs;
}

else if(companyName.equals("ITC")){
    String[] jobs={"Software Developer","Cloud Engineer","Security Analyst","Data Scientist",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Product Manager","Business Analyst","Automation Engineer",
    "Database Engineer","Technical Lead","Support Executive",
    "UI Developer","Project Manager","Operations Manager",
    "Marketing Manager","Compliance Officer"};
    return jobs;
}

else if(companyName.equals("Nestle")){
    String[] jobs={"Data Analyst","Software Engineer","Cloud Engineer","Security Engineer",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Product Manager","Business Analyst","Automation Engineer",
    "Database Administrator","Technical Lead","Support Executive",
    "UI Designer","Project Manager","Operations Manager",
    "Marketing Executive","Supply Chain Manager"};
    return jobs;
}

else if(companyName.equals("PepsiCo")){
    String[] jobs={"Data Scientist","Software Developer","Cloud Engineer","Security Analyst",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Product Manager","Business Analyst","Automation Engineer",
    "Database Engineer","Technical Lead","Support Executive",
    "UI Developer","Project Manager","Operations Manager",
    "Marketing Manager","Supply Chain Analyst"};
    return jobs;
}

else if(companyName.equals("CocaCola")){
    String[] jobs={"Data Analyst","Software Engineer","Cloud Engineer","Security Engineer",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Product Manager","Business Analyst","Automation Engineer",
    "Database Administrator","Technical Lead","Support Executive",
    "UI Designer","Project Manager","Operations Manager",
    "Marketing Executive","Supply Chain Manager"};
    return jobs;
}

else if(companyName.equals("Britannia")){
    String[] jobs={"Data Scientist","Software Developer","Cloud Engineer","Security Analyst",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Product Manager","Business Analyst","Automation Engineer",
    "Database Engineer","Technical Lead","Support Executive",
    "UI Developer","Project Manager","Operations Manager",
    "Marketing Manager","Supply Chain Analyst"};
    return jobs;
}

else if(companyName.equals("HindustanUnilever")){
    String[] jobs={"Software Engineer","Data Analyst","Cloud Engineer","Security Engineer",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Product Manager","Business Analyst","Automation Engineer",
    "Database Administrator","Technical Lead","Support Executive",
    "UI Designer","Project Manager","Operations Manager",
    "Marketing Executive","Supply Chain Manager"};
    return jobs;
}

else if(companyName.equals("ProcterGamble")){
    String[] jobs={"Software Developer","Data Scientist","Cloud Engineer","Security Analyst",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Product Manager","Business Analyst","Automation Engineer",
    "Database Engineer","Technical Lead","Support Executive",
    "UI Developer","Project Manager","Operations Manager",
    "Marketing Manager","Supply Chain Analyst"};
    return jobs;
}

else if(companyName.equals("Colgate")){
    String[] jobs={"Software Engineer","Data Analyst","Cloud Engineer","Security Engineer",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Product Manager","Business Analyst","Automation Engineer",
    "Database Administrator","Technical Lead","Support Executive",
    "UI Designer","Project Manager","Operations Manager",
    "Marketing Executive","Supply Chain Manager"};
    return jobs;
}

else if(companyName.equals("Walmart")){
    String[] jobs={"Software Developer","Cloud Engineer","Security Analyst","Data Scientist",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Product Manager","Business Analyst","Automation Engineer",
    "Database Engineer","Technical Lead","Support Executive",
    "UI Developer","Project Manager","Operations Manager",
    "Logistics Manager","Supply Chain Analyst"};
    return jobs;
}

else if(companyName.equals("Target")){
    String[] jobs={"Software Engineer","Data Analyst","Cloud Engineer","Security Engineer",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Product Manager","Business Analyst","Automation Engineer",
    "Database Administrator","Technical Lead","Support Executive",
    "UI Designer","Project Manager","Operations Manager",
    "Logistics Executive","Supply Chain Manager"};
    return jobs;
}

else if(companyName.equals("Costco")){
    String[] jobs={"Software Developer","Cloud Engineer","Security Analyst","Data Scientist",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Product Manager","Business Analyst","Automation Engineer",
    "Database Engineer","Technical Lead","Support Executive",
    "UI Developer","Project Manager","Operations Manager",
    "Logistics Manager","Supply Chain Analyst"};
    return jobs;
}

else if(companyName.equals("Spotify")){
    String[] jobs={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Engineer","Data Scientist",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Audio Engineer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Netflix")){
    String[] jobs={"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Analyst","Data Scientist",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Content Manager","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Hotstar")){
    String[] jobs={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Engineer","Data Analyst",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Content Manager","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Meta")){
    String[] jobs={"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Analyst","Data Scientist",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "AR VR Engineer","Solutions Architect"};
    return jobs;
}
else if(companyName.equals("Twitter")){
    String[] jobs={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Engineer","Data Scientist",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Content Moderator","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Snapchat")){
    String[] jobs={"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Analyst","Data Scientist",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "AR Engineer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Pinterest")){
    String[] jobs={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Engineer","Data Analyst",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Content Strategist","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("LinkedIn")){
    String[] jobs={"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Analyst","Data Scientist",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Talent Solutions Manager","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Naukri")){
    String[] jobs={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Engineer","Data Analyst",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "HR Consultant","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Hirect")){
    String[] jobs={"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Analyst","Data Scientist",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Recruitment Manager","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Indeed")){
    String[] jobs={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Engineer","Data Analyst",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "HR Analyst","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Glassdoor")){
    String[] jobs={"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Analyst","Data Scientist",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Employer Branding Specialist","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Upwork")){
    String[] jobs={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Engineer","Data Analyst",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Freelancer Success Manager","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Freelancer")){
    String[] jobs={"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Analyst","Data Scientist",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Marketplace Manager","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("RedHat")){
    String[] jobs={"Software Engineer","Linux Developer","Cloud Engineer","Security Engineer",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Data Scientist","ML Engineer","Product Manager",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Open Source Consultant","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("VMware")){
    String[] jobs={"Software Developer","Cloud Engineer","Security Analyst","Backend Developer",
    "Frontend Developer","Full Stack Developer","QA Engineer","DevOps Engineer",
    "Data Analyst","ML Engineer","Product Manager","Business Analyst",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Virtualization Engineer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("ServiceNow")){
    String[] jobs={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Engineer","Data Scientist",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Platform Engineer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Atlassian")){
    String[] jobs={"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Analyst","Data Scientist",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Agile Coach","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Workday")){
    String[] jobs={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Engineer","Data Analyst",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "HR Systems Consultant","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Stripe")){
    String[] jobs={"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Analyst","Data Scientist",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Payment Systems Engineer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Square")){
    String[] jobs={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Engineer","Data Analyst",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "FinTech Engineer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Paytm")){
    String[] jobs={"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Analyst","Data Scientist",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "FinTech Analyst","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("OYO")){
    String[] jobs={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Engineer","Data Analyst",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Hospitality Manager","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Airbnb")){
    String[] jobs={"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Analyst","Data Scientist",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Travel Operations Manager","Solutions Architect"};
    return jobs;
}
else if(companyName.equals("Booking")){
    String[] jobs={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Engineer","Data Scientist",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Travel Consultant","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Expedia")){
    String[] jobs={"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Analyst","Data Scientist",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Travel Operations Manager","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Tesla")){
    String[] jobs={"Software Engineer","Embedded Engineer","Cloud Engineer","Security Engineer",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Data Scientist","ML Engineer","Product Manager",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Automotive Engineer","System Architect"};
    return jobs;
}

else if(companyName.equals("SpaceX")){
    String[] jobs={"Software Developer","Embedded Engineer","Cloud Engineer","Security Analyst",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Data Scientist","ML Engineer","Product Manager",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Aerospace Engineer","System Architect"};
    return jobs;
}

else if(companyName.equals("BlueOrigin")){
    String[] jobs={"Software Engineer","Embedded Engineer","Cloud Engineer","Security Engineer",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Data Scientist","ML Engineer","Product Manager",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Aerospace Analyst","System Architect"};
    return jobs;
}

else if(companyName.equals("ISRO")){
    String[] jobs={"Scientist","Aerospace Engineer","Software Engineer","Embedded Engineer",
    "Cloud Engineer","Security Analyst","Data Scientist","ML Engineer",
    "Backend Developer","Frontend Developer","QA Engineer","DevOps Engineer",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","Project Manager","Research Analyst",
    "Systems Engineer","Mission Specialist"};
    return jobs;
}

else if(companyName.equals("DRDO")){
    String[] jobs={"Scientist","Research Engineer","Software Developer","Embedded Engineer",
    "Cloud Engineer","Security Engineer","Data Analyst","ML Engineer",
    "Backend Developer","Frontend Developer","QA Engineer","DevOps Engineer",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","Project Manager","Defense Analyst",
    "Systems Engineer","Mission Planner"};
    return jobs;
}

else if(companyName.equals("BARC")){
    String[] jobs={"Research Scientist","Nuclear Engineer","Software Engineer","Embedded Engineer",
    "Cloud Engineer","Security Analyst","Data Scientist","ML Engineer",
    "Backend Developer","Frontend Developer","QA Engineer","DevOps Engineer",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","Project Manager","Systems Engineer",
    "Radiation Analyst","Mission Specialist"};
    return jobs;
}

else if(companyName.equals("NPCI")){
    String[] jobs={"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Engineer","Data Analyst",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "FinTech Analyst","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("IRCTC")){
    String[] jobs={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Analyst","Data Scientist",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Railway Operations Analyst","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("MakeMyTrip")){
    String[] jobs={"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Engineer","Data Analyst",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Travel Consultant","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Cleartrip")){
    String[] jobs={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Analyst","Data Scientist",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Travel Operations Executive","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("PolicyBazaar")){
    String[] jobs={"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Engineer","Data Analyst",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Insurance Analyst","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Cars24")){
    String[] jobs={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Analyst","Data Scientist",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Automotive Analyst","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("UrbanCompany")){
    String[] jobs={"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Engineer","Data Analyst",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Operations Manager","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Quikr")){
    String[] jobs={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Analyst","Data Scientist",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Marketplace Analyst","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("OLX")){
    String[] jobs={"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Engineer","Data Analyst",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Marketplace Manager","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Nykaa")){
    String[] jobs={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
    "Cloud Engineer","DevOps Engineer","Security Analyst","Data Scientist",
    "ML Engineer","Product Manager","Business Analyst","QA Engineer",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Brand Manager","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Boat")){
    String[] jobs={"Software Developer","Embedded Engineer","Cloud Engineer","Security Engineer",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Data Analyst","ML Engineer","Product Manager",
    "Automation Engineer","Database Administrator","Technical Lead",
    "Support Executive","UI Designer","Project Manager",
    "Hardware Engineer","Solutions Architect"};
    return jobs;
}

else if(companyName.equals("Noise")){
    String[] jobs={"Software Engineer","Embedded Engineer","Cloud Engineer","Security Analyst",
    "Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer",
    "DevOps Engineer","Data Scientist","ML Engineer","Product Manager",
    "Automation Engineer","Database Engineer","Technical Lead",
    "Support Executive","UI Developer","Project Manager",
    "Hardware Analyst","Solutions Architect"};
    return jobs;
}
	return null;
}
public static void displayJobNames(String[] jobs){
        for(String job : jobs){
            System.out.println(job);
        }
}
}