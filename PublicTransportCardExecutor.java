class PublicTransportCardExecutor {

	public static void main(String[] args) {

		PublicTransportCard ref = new PublicTransportCard();

		System.out.println("Before invoking cardId: " + ref.cardId);
		ref.cardId = 501;
		System.out.println("After invoking cardId: " + ref.cardId);

		System.out.println("Before invoking holderName: " + ref.holderName);
		ref.holderName = "Ravi Kumar";
		System.out.println("After invoking holderName: " + ref.holderName);

		System.out.println("Before invoking cardType: " + ref.cardType);
		ref.cardType = "Smart Card";
		System.out.println("After invoking cardType: " + ref.cardType);

		System.out.println("Before invoking balance: " + ref.balance);
		ref.balance = 250.0;
		System.out.println("After invoking balance: " + ref.balance);

		System.out.println("Before invoking issueDate: " + ref.issueDate);
		ref.issueDate = "01-01-2024";
		System.out.println("After invoking issueDate: " + ref.issueDate);

		System.out.println("Before invoking expiryDate: " + ref.expiryDate);
		ref.expiryDate = "01-01-2028";
		System.out.println("After invoking expiryDate: " + ref.expiryDate);

		System.out.println("Before invoking isActive: " + ref.isActive);
		ref.isActive = true;
		System.out.println("After invoking isActive: " + ref.isActive);

		System.out.println("Before invoking metroAccess: " + ref.metroAccess);
		ref.metroAccess = true;
		System.out.println("After invoking metroAccess: " + ref.metroAccess);

		System.out.println("Before invoking busAccess: " + ref.busAccess);
		ref.busAccess = true;
		System.out.println("After invoking busAccess: " + ref.busAccess);

		System.out.println("Before invoking trainAccess: " + ref.trainAccess);
		ref.trainAccess = false;
		System.out.println("After invoking trainAccess: " + ref.trainAccess);

		System.out.println("Before invoking phoneNumber: " + ref.phoneNumber);
		ref.phoneNumber = "9876543210";
		System.out.println("After invoking phoneNumber: " + ref.phoneNumber);

		System.out.println("Before invoking email: " + ref.email);
		ref.email = "ravi@email.com";
		System.out.println("After invoking email: " + ref.email);

		System.out.println("Before invoking city: " + ref.city);
		ref.city = "Bangalore";
		System.out.println("After invoking city: " + ref.city);

		System.out.println("Before invoking country: " + ref.country);
		ref.country = "India";
		System.out.println("After invoking country: " + ref.country);

		System.out.println("Before invoking maxBalanceLimit: " + ref.maxBalanceLimit);
		ref.maxBalanceLimit = 2000;
		System.out.println("After invoking maxBalanceLimit: " + ref.maxBalanceLimit);

		System.out.println("Before invoking dailyTravelLimit: " + ref.dailyTravelLimit);
		ref.dailyTravelLimit = 500;
		System.out.println("After invoking dailyTravelLimit: " + ref.dailyTravelLimit);

		System.out.println("Before invoking travelCount: " + ref.travelCount);
		ref.travelCount = 15;
		System.out.println("After invoking travelCount: " + ref.travelCount);

		System.out.println("Before invoking lastRechargeAmount: " + ref.lastRechargeAmount);
		ref.lastRechargeAmount = 300;
		System.out.println("After invoking lastRechargeAmount: " + ref.lastRechargeAmount);

		System.out.println("Before invoking lastTravelDate: " + ref.lastTravelDate);
		ref.lastTravelDate = "05-03-2026";
		System.out.println("After invoking lastTravelDate: " + ref.lastTravelDate);

		System.out.println("Before invoking cardColor: " + ref.cardColor);
		ref.cardColor = "Blue";
		System.out.println("After invoking cardColor: " + ref.cardColor);

		System.out.println("Before invoking cardNumber: " + ref.cardNumber);
		ref.cardNumber = "PTC123456";
		System.out.println("After invoking cardNumber: " + ref.cardNumber);

		System.out.println("Before invoking securityCode: " + ref.securityCode);
		ref.securityCode = "789";
		System.out.println("After invoking securityCode: " + ref.securityCode);

		System.out.println("Before invoking hasMonthlyPass: " + ref.hasMonthlyPass);
		ref.hasMonthlyPass = true;
		System.out.println("After invoking hasMonthlyPass: " + ref.hasMonthlyPass);

		System.out.println("Before invoking discountRate: " + ref.discountRate);
		ref.discountRate = 10;
		System.out.println("After invoking discountRate: " + ref.discountRate);

		System.out.println("Before invoking issuingAuthority: " + ref.issuingAuthority);
		ref.issuingAuthority = "Metro Transport Authority";
		System.out.println("After invoking issuingAuthority: " + ref.issuingAuthority);

	}
}