class ChatShopOrTeaShop{
	public static void main(String[] args){
        String[] masalaChats = {"Pani Puri","Masala Puri","Sev Puri","Dahi Puri","Bhel Puri","Aloo Chaat","Papdi Chaat","Raj Kachori","Samosa Chaat","Kachori Chaat","Corn Chaat","Fruit Chaat","Chana Chaat","Matar Chaat","Peanut Chaat","Palak Chaat","Cheese Puri","Butter Puri","Special Chaat","Dry Puri","Curd Chaat","Mint Chaat","Onion Chaat","Tomato Chaat","Spicy Chaat"};

        String[] streetSnacks = {"Samosa","Kachori","Vada","Bonda","Pakoda","Mirchi Bajji","Cutlet","Egg Puff","Veg Puff","Paneer Puff","Roll","Frankie","Spring Roll","Bread Roll","Cheese Ball","Chicken Roll","Veg Roll","Aloo Roll","Corn Roll","Mushroom Roll","Noodles","Manchurian","Chow Chow Bajji","Gobi Bajji","Onion Pakoda"};

        String[] southIndianChats = {"Thatte Idli","Rava Idli","Mini Idli","Masala Dosa","Plain Dosa","Set Dosa","Open Dosa","Neer Dosa","Benne Dosa","Onion Dosa","Uttapam","Tomato Uttapam","Onion Uttapam","Podi Idli","Fried Idli","Idli Fry","Dosa Roll","Cheese Dosa","Butter Dosa","Paneer Dosa","Ghee Dosa","Special Dosa","Veg Dosa","Egg Dosa","Mysore Dosa"};

        String[] teaVarieties = {"Normal Tea","Strong Tea","Masala Tea","Ginger Tea","Elaichi Tea","Lemon Tea","Green Tea","Black Tea","Tulsi Tea","Honey Tea","Kashmiri Tea","Irani Tea","Cutting Tea","Saffron Tea","Mint Tea","Rose Tea","Cinnamon Tea","Chocolate Tea","Vanilla Tea","Butter Tea","Cardamom Tea","Spiced Tea","Herbal Tea","Iced Tea","Special Tea"};

        String[] coffeeVarieties = {"Filter Coffee","Black Coffee","Cold Coffee","Cappuccino","Latte","Espresso","Americano","Mocha","Irish Coffee","Affogato","Macchiato","Flat White","Vienna Coffee","Caramel Coffee","Hazelnut Coffee","Vanilla Coffee","Chocolate Coffee","Iced Latte","Frappe","Turkish Coffee","South Indian Coffee","Strong Coffee","Milk Coffee","Special Coffee","Double Shot Coffee"};

        String[] milkshakes = {"Chocolate Shake","Vanilla Shake","Strawberry Shake","Mango Shake","Banana Shake","Oreo Shake","KitKat Shake","Blueberry Shake","Pineapple Shake","Apple Shake","Dry Fruit Shake","Chikoo Shake","Papaya Shake","Custard Apple Shake","Butterscotch Shake","Caramel Shake","Coffee Shake","Rose Shake","Blackcurrent Shake","Dates Shake","Almond Shake","Cashew Shake","Pista Shake","Mixed Fruit Shake","Special Shake"};

        String[] juices = {"Orange Juice","Apple Juice","Pineapple Juice","Grape Juice","Watermelon Juice","Mosambi Juice","Carrot Juice","Beetroot Juice","Tomato Juice","Pomegranate Juice","Mango Juice","Papaya Juice","Guava Juice","Kiwi Juice","Lemon Juice","Mint Juice","Amla Juice","Cucumber Juice","Mixed Juice","Sugarcane Juice","Strawberry Juice","Blueberry Juice","Peach Juice","Plum Juice","Special Juice"};

        String[] sandwiches = {"Veg Sandwich","Grilled Sandwich","Cheese Sandwich","Paneer Sandwich","Corn Sandwich","Club Sandwich","Mumbai Sandwich","Chocolate Sandwich","Butter Sandwich","Jam Sandwich","Egg Sandwich","Chicken Sandwich","Mayo Sandwich","Coleslaw Sandwich","Veg Grilled Sandwich","Spicy Sandwich","Special Sandwich","Cheese Corn Sandwich","Double Decker","Healthy Sandwich","Mint Sandwich","Garlic Sandwich","Pepper Sandwich","Italian Sandwich","Mexican Sandwich"};

        String[] rolls = {"Veg Roll","Egg Roll","Chicken Roll","Paneer Roll","Cheese Roll","Aloo Roll","Corn Roll","Mushroom Roll","Kathi Roll","Frankie Roll","Spring Roll","Schezwan Roll","Manchurian Roll","Gobi Roll","Noodles Roll","Butter Roll","Spicy Roll","Tandoori Roll","Special Roll","Mexican Roll","Italian Roll","Chinese Roll","Masala Roll","Street Roll","Fusion Roll"};

        String[] momos = {"Veg Momos","Chicken Momos","Paneer Momos","Cheese Momos","Corn Momos","Fried Momos","Steam Momos","Tandoori Momos","Butter Momos","Schezwan Momos","Chocolate Momos","Peri Peri Momos","Mushroom Momos","Spinach Momos","Garlic Momos","Pepper Momos","Spicy Momos","Special Momos","Mini Momos","Jumbo Momos","Chinese Momos","Italian Momos","Mexican Momos","Fusion Momos","Street Momos"};

        String[] chaatsSpecials = {"Special Pani Puri","Special Dahi Puri","Special Sev Puri","Special Bhel","Butter Chaat","Cheese Chaat","Curd Special","Mint Special","Spicy Special","Dry Special","Onion Special","Tomato Special","Corn Special","Fruit Special","Mixed Special","Chat House Special","Signature Chaat","Premium Chaat","Classic Chaat","Desi Chaat","Fusion Chaat","Royal Chaat","Street Chaat","Express Chaat","Ultimate Chaat"};

        String[] snacksEvenings = {"Evening Tea","Evening Coffee","Evening Snacks","Evening Pakoda","Evening Bajji","Evening Samosa","Evening Cutlet","Evening Roll","Evening Sandwich","Evening Chat","Evening Juice","Evening Shake","Evening Momos","Evening Fries","Evening Corn","Evening Peanuts","Evening Bhel","Evening Puffs","Evening Special","Evening Combo","Evening Delight","Evening Treat","Evening Express","Evening Crunch","Evening Bite"};

        String[] fries = {"French Fries","Peri Peri Fries","Cheese Fries","Masala Fries","Salted Fries","Curly Fries","Crinkle Fries","Loaded Fries","Garlic Fries","Butter Fries","Spicy Fries","Chilli Fries","Corn Fries","Veggie Fries","Potato Wedges","Sweet Potato Fries","Classic Fries","Crispy Fries","Street Fries","Fusion Fries","Mexican Fries","Italian Fries","Indian Fries","Special Fries","Jumbo Fries"};

        String[] desserts = {"Gulab Jamun","Rasgulla","Jalebi","Rabri","Kheer","Ice Cream","Kulfi","Falooda","Brownie","Pastry","Cup Cake","Donut","Chocolate Cake","Vanilla Cake","Fruit Cake","Cheese Cake","Pudding","Mousse","Trifle","Payasam","Halwa","Carrot Halwa","Badam Halwa","Kesari","Special Dessert"};

        String[] combos = {"Tea Combo","Coffee Combo","Chat Combo","Snack Combo","Evening Combo","Special Combo","Family Combo","Friends Combo","Kids Combo","Office Combo","Quick Combo","Budget Combo","Premium Combo","Street Combo","Mini Combo","Maxi Combo","Saver Combo","Party Combo","Weekend Combo","Festival Combo","Classic Combo","Deluxe Combo","Value Combo","Express Combo","Ultimate Combo"};

        String[] beveragesColds = {"Cold Tea","Cold Coffee","Iced Latte","Iced Mocha","Cold Brew","Milk Cold","Rose Milk","Badam Milk","Chocolate Milk","Vanilla Milk","Strawberry Milk","Buttermilk","Lassi","Sweet Lassi","Salt Lassi","Mango Lassi","Mint Lassi","Dry Fruit Milk","Ice Milk","Special Beverage","Fusion Drink","Energy Drink","Cooling Drink","Summer Drink","Chill Drink"};

        String[] quickBites = {"Quick Snack","Quick Chat","Quick Roll","Quick Sandwich","Quick Tea","Quick Coffee","Quick Fries","Quick Momos","Quick Juice","Quick Shake","Quick Bite","Quick Combo","Quick Delight","Quick Treat","Quick Meal","Quick Hunger","Quick Break","Quick Fix","Quick Energy","Quick Munch","Quick Street","Quick Taste","Quick Serve","Quick Order","Quick Special"};

        String[] shopSpecials = {"House Special","Chef Special","Today Special","Weekend Special","Festival Special","Morning Special","Evening Special","Night Special","Budget Special","Premium Special","Customer Choice","Best Seller","Hot Item","New Arrival","Limited Special","Signature Dish","Top Rated","Popular Item","Fast Moving","Must Try","Recommended","Special Offer","Combo Special","Value Special","Ultimate Special"};

        String[] seasonalItems = {"Summer Special","Winter Special","Rainy Special","Festival Special","Holiday Special","Mango Special","Strawberry Special","Rose Special","Chocolate Special","Dry Fruit Special","Cooling Special","Hot Special","Spicy Special","Sweet Special","Fusion Special","Traditional Special","Classic Special","Modern Special","Kids Special","Family Special","Office Special","Party Special","Weekend Special","Limited Special","Seasonal Delight"};
	
		String[] iceCreamVarieties = {"Vanilla Ice Cream","Chocolate Ice Cream","Strawberry Ice Cream","Butterscotch Ice Cream","Mango Ice Cream","Black Currant Ice Cream","Pista Ice Cream","Kesar Pista","American Nuts","Dry Fruit Delight","Cookies and Cream","Choco Chips","Chocolate Fudge","Caramel Swirl","Coffee Ice Cream","Mint Choco Chip","Rocky Road","Belgian Chocolate","Fruit Overload","Rainbow Ice Cream","Kulfi Ice Cream","Falooda Ice Cream","Cassata","Tender Coconut","Special Ice Cream"};
		
		for(String masalaChat:masalaChats){
			System.out.println(masalaChat);
		}
		for(String streetSnack:streetSnacks){
			System.out.println(streetSnack);
		}
		for(String southIndianChat:southIndianChats){
			System.out.println(southIndianChat);
		}
		for(String teaVarietie:teaVarieties){
			System.out.println(teaVarietie);
		}
		for(String coffeeVarietie:coffeeVarieties){
			System.out.println(coffeeVarietie);
		}
		for(String milkshake:milkshakes){
			System.out.println(milkshake);
		}
		for(String juice:juices){
			System.out.println(juice);
		}
		for(String sandwiche:sandwiches){
			System.out.println(sandwiche);
		}
		for(String roll:rolls){
			System.out.println(roll);
		}
		for(String momo:momos){
			System.out.println(momo);
		}
		for(String chaatsSpecial:chaatsSpecials){
			System.out.println(chaatsSpecial);
		}
		for(String snacksEvening:snacksEvenings){
			System.out.println(snacksEvening);
		}
		for(String frie:fries){
			System.out.println(frie);
		}
		for(String dessert:desserts){
			System.out.println(dessert);
		}
		for(String combo:combos){
			System.out.println(combo);
		}
		for(String beveragesCold:beveragesColds){
			System.out.println(beveragesCold);
		}
		for(String quickBite:quickBites){
			System.out.println(quickBite);
		}
		for(String shopSpecial:shopSpecials){
			System.out.println(shopSpecial);
		}
		for(String seasonalItem:seasonalItems){
			System.out.println(seasonalItem);
		}
		for(String iceCreamVarietie:iceCreamVarieties){
			System.out.println(iceCreamVarietie);
		}
		
    }
}
