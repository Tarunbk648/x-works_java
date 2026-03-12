class Pocket
{
    String type;
    int size;
    String cloth;

    Pocket()
    {
        System.out.println("Default Constructor Called");
    }

    Pocket(String type,int size,String cloth)
    {
        System.out.println("Parameterized constructor called...");
        this.type=type;
        this.size=size;
        this.cloth=cloth;
    }
}