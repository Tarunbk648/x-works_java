class Bracelet
{
    String brand;
    String color;
    String material;
    int price;
    int size;
    int weight;
    String type;
    String design;
    String country;
    String owner;
    int rating;
    int quantity;
    String stone;
    String shape;
    String clasp;
    String style;
    int year;
    String gender;
    String occasion;
    String quality;

    Bracelet()
    {
        System.out.println("Default Constructor Called");
    }

    Bracelet(String brand,String color,String material,int price,int size,int weight,String type,String design,String country,String owner,int rating,int quantity,String stone,String shape,String clasp,String style,int year,String gender,String occasion,String quality)
    {
        System.out.println("Parameterized constructor called...");
        this.brand=brand;
        this.color=color;
        this.material=material;
        this.price=price;
        this.size=size;
        this.weight=weight;
        this.type=type;
        this.design=design;
        this.country=country;
        this.owner=owner;
        this.rating=rating;
        this.quantity=quantity;
        this.stone=stone;
        this.shape=shape;
        this.clasp=clasp;
        this.style=style;
        this.year=year;
        this.gender=gender;
        this.occasion=occasion;
        this.quality=quality;
    }
}