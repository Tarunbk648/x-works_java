class Ant
{
    String color;
    int legs;
    String type;

    Ant()
    {
        System.out.println("Default Constructor Called");
    }

    Ant(String color,int legs,String type)
    {
        System.out.println("Parameterized constructor called...");
        this.color=color;
        this.legs=legs;
        this.type=type;
    }
}