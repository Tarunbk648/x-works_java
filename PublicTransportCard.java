class PublicTransportCard {

	int cardId;
	String holderName;
	String cardType;
	double balance;
	String issueDate;
	String expiryDate;
	boolean isActive;
	boolean metroAccess;

	boolean busAccess;
	boolean trainAccess;
	String phoneNumber;
	String email;
	String city;

	String country;
	double maxBalanceLimit;
	double dailyTravelLimit;

	int travelCount;
	double lastRechargeAmount;
	String lastTravelDate;

	String cardColor;
	String cardNumber;
	String securityCode;

	boolean hasMonthlyPass;
	double discountRate;
	String issuingAuthority;

	PublicTransportCard(){
		System.out.println("Constructor in java......Using non-static variables");
	}
}