class Racket
{
    String brand;
    String sport;
    int weight;
    int length;
    String grip;
    String color;
    int price;
    String material;
    String player;
    int rating;

    Racket()
    {
        System.out.println("Default Constructor Called");
    }

    Racket(String brand,String sport,int weight,int length,String grip,String color,int price,String material,String player,int rating)
    {
        System.out.println("Parameterized constructor called...");
        this.brand=brand;
        this.sport=sport;
        this.weight=weight;
        this.length=length;
        this.grip=grip;
        this.color=color;
        this.price=price;
        this.material=material;
        this.player=player;
        this.rating=rating;
    }
}