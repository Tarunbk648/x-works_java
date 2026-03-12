class Jacket
{
    String brand;
    String color;
    int size;
    int price;
    String material;

    Jacket()
    {
        System.out.println("Default Constructor Called");
    }

    Jacket(String brand,String color,int size,int price,String material)
    {
        System.out.println("Parameterized constructor called...");
        this.brand=brand;
        this.color=color;
        this.size=size;
        this.price=price;
        this.material=material;
    }
}