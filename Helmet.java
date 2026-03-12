class Helmet
{
    String brand;
    String color;
    int price;

    Helmet()
    {
        System.out.println("Default Constructor Called");
    }

    Helmet(String brand,String color,int price)
    {
        System.out.println("Parameterized constructor called...");
        this.brand=brand;
        this.color=color;
        this.price=price;
    }
}