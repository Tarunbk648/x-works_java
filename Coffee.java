class Coffee
{
    String type;
    int price;

    Coffee()
    {
        System.out.println("Default Constructor Called");
    }

    Coffee(String type, int price)
    {
		System.out.println("Parameterized constructor called...");
        this.type = type;
        this.price = price;
    }

  }