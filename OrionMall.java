class OrionMall{
    public static void main(String[] args){
        String[] clothingStores = {"Zara","H&M","Pantaloons","Westside","Allen Solly","Peter England","Levis","Mufti","Spykar","Biba","W","Max","Reliance Trends","UCB","Van Heusen","Jack & Jones","Vero Moda","Only","Forever 21","Marks & Spencer","Louis Philippe","FabIndia","Soch","Manyavar","Pantaloons Kids"};

        String[] footwearStores = {"Nike","Adidas","Puma","Reebok","Skechers","Bata","Woodland","Red Tape","Campus","Fila","Crocs","Clarks","Metro","Mochi","Inc 5","Catwalk","Hush Puppies","Power","Sparx","Liberty","Action","Paragon","Relaxo","Khadims","Lee Cooper"};

        String[] foodCourts = {"McDonalds","KFC","Burger King","Dominos","Pizza Hut","Subway","Taco Bell","Starbucks","CCD","Wow Momo","Chai Point","Barbeque Nation","Punjab Grill","Empire","Meghana Foods","A2B","Sagar","Udupi","Nandhini","California Burrito","FreshMenu","Faasos","Behrouz","Krispy Kreme","Dunkin"};

        String[] electronicsStores = {"Croma","Reliance Digital","Samsung","Apple","OnePlus","Sony","LG","Mi Store","Vivo","Oppo","HP World","Dell Exclusive","Lenovo","Asus","Acer","Boat","Noise","JBL","Panasonic","Canon","Nikon","GoPro","Philips","Haier","Bosch"};

        String[] movieScreens = {"PVR Gold","PVR IMAX","INOX","Cinepolis","PVR Screen 1","PVR Screen 2","PVR Screen 3","PVR Screen 4","PVR Screen 5","INOX Screen A","INOX Screen B","INOX Screen C","Cinepolis Audi 1","Cinepolis Audi 2","Cinepolis Audi 3","IMAX 1","IMAX 2","Kids Screen","Luxury Screen","Couple Screen","Balcony Screen","Dolby Atmos","4DX Screen","Premium Lounge","Mini Theatre"};

        String[] jewelryStores = {"Tanishq","Malabar Gold","Kalyan Jewellers","Bhima","Joyalukkas","PC Jeweller","TBZ","CaratLane","BlueStone","PNG Jewellers","GRT","Senco","ORRA","Reliance Jewels","Candere","Josco","Lalitha","Vijayalakshmi","Alukkas","Anmol","Khazana","Chungath","Swasthi","Shubh","Divine Gold"};

        String[] kidsZones = {"Hamleys","Toy Store","Fun City","Kidzania","Play Arena","Bounce","Trampoline Park","Soft Play","VR Kids","Arcade Zone","Ball Pool","Kids Cafe","Mini Train","Magic Show","Face Painting","Story Zone","Puzzle Area","Board Games","LEGO World","Car Ride","Mini Ferris","Drawing Zone","Craft Corner","Adventure Kids","Toddler Zone"};

        String[] cafes = {"Starbucks","CCD","Third Wave","Blue Tokai","Barista","Costa Coffee","Tim Hortons","Tea Villa","Cafe Coffee Day","The Coffee Bean","Lavazza","Roastery","Cafe Noir","Cafe Pascucci","Cafe Delhi Heights","Cafe Azzure","Cafe Mocha","Cafe Kaara","Cafe Terra","Cafe Aromas","Cafe Brew","Cafe Bliss","Cafe Vibes","Cafe Latte","Cafe Aroma"};

        String[] salons = {"Lakme","Naturals","Green Trends","Tony & Guy","Enrich","Jawed Habib","Looks","VLCC","BBlunt","Monsoon","Style Lounge","Mirror","Bounce","Hair Speak","Bodycraft","Essensuals","Limelite","Glow","Urban Clap","Yes Madam","ULike","Sugar Salon","Makeover Studio","Beauty Hub","Salon X"};

        String[] supermarkets = {"Reliance Smart","Spar","More","Foodhall","Nature’s Basket","Big Bazaar","Star Bazaar","MK Retail","Nilgiris","Easyday","Hypercity","Metro","Udaan","Freshmart","Daily Needs","Organic Store","Health Basket","Green Mart","Super Saver","Quick Mart","Value Mart","City Mart","Budget Store","Smart Choice","Grocery Hub"};
		
		String[] bookstores = {"Crossword","Sapna Book House","Landmark","Oxford Bookstore","Higginbothams","Bookworm","Book Palace","Story Hub","Readers Point","Book World","The Book Stop","Knowledge Tree","Pages & Co","Scholars Store","Elite Books","Book Square","Literature Lounge","Book Café","Mind Tree Books","Novelty Books","EduBooks","Smart Books","Classic Reads","Campus Books","Infinity Books"};

		String[] sportsStores = {"Decathlon","Nike Store","Adidas Store","Puma Store","Reebok Store","Skechers Sports","Yonex","Cosco","Nivia","SG Cricket","SS Sports","MRF Sports","Spartan","Vector X","Strauss","HRX","Asics","Li-Ning","New Balance","Under Armour","Speedo","Arena","Wilson","Head","Babolat"};

		String[] watchStores = {"Titan","Fastrack","Sonata","Casio","Fossil","Daniel Wellington","Rolex","Omega","Tissot","Rado","Timex","Guess","Police","Emporio Armani","Michael Kors","Skagen","Citizen","Seiko","Tommy Hilfiger","Diesel","Victorinox","Swatch","Garmin","G-Shock","Fitbit"};

		String[] eyewearStores = {"Lenskart","Titan Eye+","Specsmakers","Vision Express","Lawrence & Mayo","GKB Opticals","Clear Vision","Eye Wear Studio","Specs World","Focus Optics","Optic Zone","Eye Nation","Spec House","Optical Palace","Perfect Vision","Eye Style","Vision Care","Optical Hub","Lens World","Eye Gallery","Bright Eyes","Eye Planet","Specs Point","Vision Plus","Eye Lounge"};

		String[] gamingZones = {"Timezone","Smaaash","Play Factory","Fun Unlimited","Game Palace","VR World","Laser Tag","Bowling Zone","Arcade Arena","Play Nation","Game Hub","Virtual Reality Park","E-Sports Zone","Console Arena","Gamer’s Den","Joystick Junction","Pixel Play","Game City","Play Zone","Fun Square","NextGen Games","Game Central","Xtreme Play","Play Station","Fun World"};

		String[] furnitureStores = {"IKEA","Pepperfry","Urban Ladder","Home Centre","Durian","Godrej Interio","Nilkamal","Evok","Featherlite","Wakefit","Wooden Street","Hometown","FabIndia Furniture","Stanley","Royaloak","Furniture World","Spacewood","Style Spa","Interio Hub","Comfort Living","Living Spaces","Cozy Homes","Dream Decor","Elite Furniture","Perfect Homes"};

		String[] giftShops = {"Archies","Hallmark","Ferns N Petals","Chumbak","Miniso","Hamleys Gifts","The Gift Studio","Wrap A Smile","Happy Shop","Surprise Hub","Gift Gallery","Lovely Gifts","Magic Moments","Celebration Store","Wish Tree","Gift Corner","Treasure Box","Joy Store","Smile Factory","Token of Love","Fancy Gifts","Dream Gifts","Perfect Present","Gift Express","Moments Store"};

		String[] travelStores = {"Thomas Cook","MakeMyTrip","Yatra","SOTC","Cox & Kings","Cleartrip","EaseMyTrip","Travel Boutique","Holiday Hub","Trip Planner","Journey World","Vacation Store","Wanderlust","Fly Easy","Travel Desk","Global Tours","Dream Holidays","Trip World","Travel Lounge","Tour Factory","Holiday Point","Fly High","Trip Junction","Explore More","Go Vacations"};

		String[] mobileStores = {"Apple Store","Samsung Store","Mi Store","OnePlus Store","Vivo Store","Oppo Store","Realme Store","Motorola Store","Nokia Store","iQOO Store","Infinix Store","Tecno Store","Lava Store","Micromax Store","Nothing Store","Google Pixel","Asus Store","Sony Mobile","Honor Store","HTC Store","Karbonn","Gionee","Panasonic Mobile","BlackBerry","Alcatel"};

		String[] serviceCenters = {"Apple Service","Samsung Service","Mi Service","OnePlus Service","Dell Service","HP Service","Lenovo Service","Acer Service","Asus Service","Sony Service","LG Service","Bosch Service","IFB Service","Whirlpool Service","Panasonic Service","Canon Service","Nikon Service","Epson Service","Boat Service","JBL Service","Noise Service","Philips Service","Haier Service","Godrej Service","Voltas Service"};
    
	}
	
}
