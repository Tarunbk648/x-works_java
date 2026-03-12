class ShoeLace
{
    String brand;
    String color;
    String material;
    int length;
    int price;
    String type;
    String shape;
    String country;
    String shoeType;
    String quality;

    ShoeLace()
    {
        System.out.println("Default Constructor Called");
    }

    ShoeLace(String brand,String color,String material,int length,int price,String type,String shape,String country,String shoeType,String quality)
    {
        System.out.println("Parameterized constructor called...");
        this.brand=brand;
        this.color=color;
        this.material=material;
        this.length=length;
        this.price=price;
        this.type=type;
        this.shape=shape;
        this.country=country;
        this.shoeType=shoeType;
        this.quality=quality;
    }
}