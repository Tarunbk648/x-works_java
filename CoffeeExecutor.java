class CoffeeExecutor{ 
public static void main(String[] args)
    {
         
		// default constructor
        Coffee c1 = new Coffee();
        c1.type="Black";
        c1.price=10;
        System.out.println(c1.type + " " + c1.price);

        Coffee c2 = new Coffee();
        c2.type="Cold";
        c2.price=20;
        System.out.println(c2.type + " " + c2.price);

        Coffee c3 = new Coffee();
        c3.type="Filter";
        c3.price=30;
        System.out.println(c3.type + " " + c3.price);

        Coffee c4 = new Coffee();
        c4.type="Latte";
        c4.price=40;
        System.out.println(c4.type + " " + c4.price);

        Coffee c5 = new Coffee();
        c5.type="Mocha";
        c5.price=50;
        System.out.println(c5.type + " " + c5.price);

        Coffee c6 = new Coffee();
        c6.type="Cappuccino";
        c6.price=60;
        System.out.println(c6.type + " " + c6.price);

        Coffee c7 = new Coffee();
        c7.type="Espresso";
        c7.price=70;
        System.out.println(c7.type + " " + c7.price);

        Coffee c8 = new Coffee();
        c8.type="Americano";
        c8.price=80;
        System.out.println(c8.type + " " + c8.price);

        Coffee c9 = new Coffee();
        c9.type="Irish";
        c9.price=90;
        System.out.println(c9.type + " " + c9.price);

        Coffee c10 = new Coffee();
        c10.type="Caramel";
        c10.price=100;
        System.out.println(c10.type + " " + c10.price);

        Coffee c11 = new Coffee();
        c11.type="Vanilla";
        c11.price=110;
        System.out.println(c11.type + " " + c11.price);

        Coffee c12 = new Coffee();
        c12.type="Hazelnut";
        c12.price=120;
        System.out.println(c12.type + " " + c12.price);

        Coffee c13 = new Coffee();
        c13.type="Chocolate";
        c13.price=130;
        System.out.println(c13.type + " " + c13.price);

        Coffee c14 = new Coffee();
        c14.type="Strong";
        c14.price=140;
        System.out.println(c14.type + " " + c14.price);

        Coffee c15 = new Coffee();
        c15.type="Light";
        c15.price=150;
        System.out.println(c15.type + " " + c15.price);

        Coffee c16 = new Coffee();
        c16.type="Iced";
        c16.price=160;
        System.out.println(c16.type + " " + c16.price);

        Coffee c17 = new Coffee();
        c17.type="Hot";
        c17.price=170;
        System.out.println(c17.type + " " + c17.price);

        Coffee c18 = new Coffee();
        c18.type="Milk";
        c18.price=180;
        System.out.println(c18.type + " " + c18.price);

        Coffee c19 = new Coffee();
        c19.type="Cream";
        c19.price=190;
        System.out.println(c19.type + " " + c19.price);

        Coffee c20 = new Coffee();
        c20.type="Sugar";
        c20.price=200;
        System.out.println(c20.type + " " + c20.price);

        Coffee c21 = new Coffee();
        c21.type="Special";
        c21.price=210;
        System.out.println(c21.type + " " + c21.price);

        Coffee c22 = new Coffee();
        c22.type="Classic";
        c22.price=220;
        System.out.println(c22.type + " " + c22.price);

        Coffee c23 = new Coffee();
        c23.type="Premium";
        c23.price=230;
        System.out.println(c23.type + " " + c23.price);

        Coffee c24 = new Coffee();
        c24.type="Royal";
        c24.price=240;
        System.out.println(c24.type + " " + c24.price);

        Coffee c25 = new Coffee();
        c25.type="Gold";
        c25.price=250;
        System.out.println(c25.type + " " + c25.price);

         //Parameterized constructor
		 
		System.out.println();
        Coffee p1 = new Coffee("Black",10);
        System.out.println(p1.type + " " + p1.price);

        Coffee p2 = new Coffee("Cold",20);
        System.out.println(p2.type + " " + p2.price);

        Coffee p3 = new Coffee("Filter",30);
        System.out.println(p3.type + " " + p3.price);

        Coffee p4 = new Coffee("Latte",40);
        System.out.println(p4.type + " " + p4.price);

        Coffee p5 = new Coffee("Mocha",50);
        System.out.println(p5.type + " " + p5.price);

        Coffee p6 = new Coffee("Cappuccino",60);
        System.out.println(p6.type + " " + p6.price);

        Coffee p7 = new Coffee("Espresso",70);
        System.out.println(p7.type + " " + p7.price);

        Coffee p8 = new Coffee("Americano",80);
        System.out.println(p8.type + " " + p8.price);

        Coffee p9 = new Coffee("Irish",90);
        System.out.println(p9.type + " " + p9.price);

        Coffee p10 = new Coffee("Caramel",100);
        System.out.println(p10.type + " " + p10.price);

        Coffee p11 = new Coffee("Vanilla",110);
        System.out.println(p11.type + " " + p11.price);

        Coffee p12 = new Coffee("Hazelnut",120);
        System.out.println(p12.type + " " + p12.price);

        Coffee p13 = new Coffee("Chocolate",130);
        System.out.println(p13.type + " " + p13.price);

        Coffee p14 = new Coffee("Strong",140);
        System.out.println(p14.type + " " + p14.price);

        Coffee p15 = new Coffee("Light",150);
        System.out.println(p15.type + " " + p15.price);

        Coffee p16 = new Coffee("Iced",160);
        System.out.println(p16.type + " " + p16.price);

        Coffee p17 = new Coffee("Hot",170);
        System.out.println(p17.type + " " + p17.price);

        Coffee p18 = new Coffee("Milk",180);
        System.out.println(p18.type + " " + p18.price);

        Coffee p19 = new Coffee("Cream",190);
        System.out.println(p19.type + " " + p19.price);

        Coffee p20 = new Coffee("Sugar",200);
        System.out.println(p20.type + " " + p20.price);

        Coffee p21 = new Coffee("Special",210);
        System.out.println(p21.type + " " + p21.price);

        Coffee p22 = new Coffee("Classic",220);
        System.out.println(p22.type + " " + p22.price);

        Coffee p23 = new Coffee("Premium",230);
        System.out.println(p23.type + " " + p23.price);

        Coffee p24 = new Coffee("Royal",240);
        System.out.println(p24.type + " " + p24.price);

        Coffee p25 = new Coffee("Gold",250);
        System.out.println(p25.type + " " + p25.price);

    }
}