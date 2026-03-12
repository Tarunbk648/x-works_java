class Blanket
{
    String brand;
    String color;
    String material;
    int size;
    int price;
    String season;

    Blanket()
    {
        System.out.println("Default Constructor Called");
    }

    Blanket(String brand,String color,String material,int size,int price,String season)
    {
        System.out.println("Parameterized constructor called...");
        this.brand=brand;
        this.color=color;
        this.material=material;
        this.size=size;
        this.price=price;
        this.season=season;
    }
}