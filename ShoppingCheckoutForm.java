class ShoppingCheckoutForm {
    static String customerName = "Ananya Rao";
    static String email = "ananya@gmail.com";
    static String phoneNumber = "9876543210";
    static String deliveryAddress = "Bangalore";
    static String productName = "Bluetooth Speaker";
    static int quantity = 2;
    static int totalAmount = 2999;
    static String paymentMode = "UPI";
    static boolean orderPlaced = true;
    static String deliveryDate = "15-Feb-2026";

    public static void main(String[] args) {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Address: " + deliveryAddress);
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Amount: " + totalAmount);
        System.out.println("Payment Mode: " + paymentMode);
        System.out.println("Order Placed: " + orderPlaced);
        System.out.println("Delivery Date: " + deliveryDate);
    }
}
