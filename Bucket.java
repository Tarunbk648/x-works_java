class Bucket
{
    String color;
    int capacity;
    String material;
    int price;
    String shape;

    Bucket()
    {
        System.out.println("Default Constructor Called");
    }

    Bucket(String color,int capacity,String material,int price,String shape)
    {
        System.out.println("Parameterized constructor called...");
        this.color=color;
        this.capacity=capacity;
        this.material=material;
        this.price=price;
        this.shape=shape;
    }
}