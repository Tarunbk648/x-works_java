class HospitalManagement{
	public static void main(String[] args){
		String hospitalName="City Care Hospital";
		String chiefDoctor="DR.Ramesh";
		String location="Bhashyam Circle";
		String departments[]={"Cardiology","Neurology","Orthopedics"};
		String doctors[]={"DR.Rajesh", "DR.Kumar", "DR.Ravi"};
		
		System.out.println("Hospital Name:" +hospitalName);
		System.out.println("The Chief Doctor Name:" +chiefDoctor);
		System.out.println("Hospital location:" +location);
		
		System.out.println();
		int dept= departments.length;
		System.out.println("Departments:" +dept);
		for(String department:departments){
			System.out.println(department);
		}
		
		System.out.println();
		int doct=doctors.length;
		System.out.println("Available Doctors:" +doct);
		for(String doctor:doctors){
			System.out.println(doctor);
		}
	}
}
		