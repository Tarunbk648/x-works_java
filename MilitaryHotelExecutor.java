class MilitaryHotelExecutor {

	public static void main(String[] args) {

		MilitaryHotel ref = new MilitaryHotel();

		System.out.println("Before invoking hotelId: " + ref.hotelId);
		ref.hotelId = 101;
		System.out.println("After invoking hotelId: " + ref.hotelId);

		System.out.println("Before invoking hotelName: " + ref.hotelName);
		ref.hotelName = "Sri Military Hotel";
		System.out.println("After invoking hotelName: " + ref.hotelName);

		System.out.println("Before invoking location: " + ref.location);
		ref.location = "Bangalore";
		System.out.println("After invoking location: " + ref.location);

		System.out.println("Before invoking totalTables: " + ref.totalTables);
		ref.totalTables = 25;
		System.out.println("After invoking totalTables: " + ref.totalTables);

		System.out.println("Before invoking rating: " + ref.rating);
		ref.rating = 4.5;
		System.out.println("After invoking rating: " + ref.rating);

		System.out.println("Before invoking isOpen: " + ref.isOpen);
		ref.isOpen = true;
		System.out.println("After invoking isOpen: " + ref.isOpen);

		System.out.println("Before invoking isVeg: " + ref.isVeg);
		ref.isVeg = false;
		System.out.println("After invoking isVeg: " + ref.isVeg);

		System.out.println("Before invoking hasParking: " + ref.hasParking);
		ref.hasParking = true;
		System.out.println("After invoking hasParking: " + ref.hasParking);

		System.out.println("Before invoking totalStaff: " + ref.totalStaff);
		ref.totalStaff = 15;
		System.out.println("After invoking totalStaff: " + ref.totalStaff);

		System.out.println("Before invoking totalFloors: " + ref.totalFloors);
		ref.totalFloors = 2;
		System.out.println("After invoking totalFloors: " + ref.totalFloors);

		System.out.println("Before invoking establishedYear: " + ref.establishedYear);
		ref.establishedYear = 2005;
		System.out.println("After invoking establishedYear: " + ref.establishedYear);

		System.out.println("Before invoking dailyCustomers: " + ref.dailyCustomers);
		ref.dailyCustomers = 300;
		System.out.println("After invoking dailyCustomers: " + ref.dailyCustomers);

		System.out.println("Before invoking totalRooms: " + ref.totalRooms);
		ref.totalRooms = 5;
		System.out.println("After invoking totalRooms: " + ref.totalRooms);

		System.out.println("Before invoking averageMealPrice: " + ref.averageMealPrice);
		ref.averageMealPrice = 150.5;
		System.out.println("After invoking averageMealPrice: " + ref.averageMealPrice);

		System.out.println("Before invoking yearlyIncome: " + ref.yearlyIncome);
		ref.yearlyIncome = 2500000;
		System.out.println("After invoking yearlyIncome: " + ref.yearlyIncome);

		System.out.println("Before invoking discountPercentage: " + ref.discountPercentage);
		ref.discountPercentage = 10;
		System.out.println("After invoking discountPercentage: " + ref.discountPercentage);

		System.out.println("Before invoking ownerName: " + ref.ownerName);
		ref.ownerName = "Ramesh";
		System.out.println("After invoking ownerName: " + ref.ownerName);

		System.out.println("Before invoking famousDish: " + ref.famousDish);
		ref.famousDish = "Chicken Biryani";
		System.out.println("After invoking famousDish: " + ref.famousDish);

		System.out.println("Before invoking contactNumber: " + ref.contactNumber);
		ref.contactNumber = "9876543210";
		System.out.println("After invoking contactNumber: " + ref.contactNumber);

		System.out.println("Before invoking openingTime: " + ref.openingTime);
		ref.openingTime = "7 AM";
		System.out.println("After invoking openingTime: " + ref.openingTime);

		System.out.println("Before invoking closingTime: " + ref.closingTime);
		ref.closingTime = "11 PM";
		System.out.println("After invoking closingTime: " + ref.closingTime);

		System.out.println("Before invoking hasHomeDelivery: " + ref.hasHomeDelivery);
		ref.hasHomeDelivery = true;
		System.out.println("After invoking hasHomeDelivery: " + ref.hasHomeDelivery);

		System.out.println("Before invoking hasOnlineBooking: " + ref.hasOnlineBooking);
		ref.hasOnlineBooking = true;
		System.out.println("After invoking hasOnlineBooking: " + ref.hasOnlineBooking);

		System.out.println("Before invoking hasAC: " + ref.hasAC);
		ref.hasAC = true;
		System.out.println("After invoking hasAC: " + ref.hasAC);

		System.out.println("Before invoking hasWifi: " + ref.hasWifi);
		ref.hasWifi = true;
		System.out.println("After invoking hasWifi: " + ref.hasWifi);

	}
}