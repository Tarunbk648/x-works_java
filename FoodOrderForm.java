class FoodOrderForm {
    static String customerName = "Vikram R";
    static String restaurantName = "Spice Hub";
    static String foodItem = "Paneer Biryani";
    static int quantity = 2;
    static int billAmount = 620;
    static String deliveryLocation = "BTM Layout";
    static String deliveryPartner = "Rohit";
    static boolean cashOnDelivery = false;
    static String orderTime = "8:30 PM";
    static String orderStatus = "Out for Delivery";

    public static void main(String[] args) {
        System.out.println("Customer: " + customerName);
        System.out.println("Restaurant: " + restaurantName);
        System.out.println("Item: " + foodItem);
        System.out.println("Quantity: " + quantity);
        System.out.println("Bill: " + billAmount);
        System.out.println("Location: " + deliveryLocation);
        System.out.println("Partner: " + deliveryPartner);
        System.out.println("COD: " + cashOnDelivery);
        System.out.println("Order Time: " + orderTime);
        System.out.println("Status: " + orderStatus);
    }
}
