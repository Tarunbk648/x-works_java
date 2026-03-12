class BlanketExecutor
{
    public static void main(String[] args)
    {

        Blanket c1 = new Blanket();
        c1.brand="BombayDyeing";
        c1.color="Red";
        c1.material="Wool";
        c1.size=90;
        c1.price=2000;
        c1.season="Winter";
        System.out.println(c1.brand+" "+c1.color+" "+c1.material+" "+c1.size+" "+c1.price+" "+c1.season);

        Blanket c2 = new Blanket();
        c2.brand="Raymond";
        c2.color="Blue";
        c2.material="Cotton";
        c2.size=85;
        c2.price=1800;
        c2.season="Summer";
        System.out.println(c2.brand+" "+c2.color+" "+c2.material+" "+c2.size+" "+c2.price+" "+c2.season);

        Blanket c3 = new Blanket();
        c3.brand="Usha";
        c3.color="Brown";
        c3.material="Wool";
        c3.size=95;
        c3.price=2200;
        c3.season="Winter";
        System.out.println(c3.brand+" "+c3.color+" "+c3.material+" "+c3.size+" "+c3.price+" "+c3.season);

        Blanket c4 = new Blanket();
        c4.brand="BombayDyeing";
        c4.color="Red";
        c4.material="Wool";
        c4.size=90;
        c4.price=2000;
        c4.season="Winter";
        System.out.println(c4.brand+" "+c4.color+" "+c4.material+" "+c4.size+" "+c4.price+" "+c4.season);

        Blanket c5 = new Blanket();
        c5.brand="Raymond";
        c5.color="Blue";
        c5.material="Cotton";
        c5.size=85;
        c5.price=1800;
        c5.season="Summer";
        System.out.println(c5.brand+" "+c5.color+" "+c5.material+" "+c5.size+" "+c5.price+" "+c5.season);

       


        System.out.println();


        Blanket p1 = new Blanket("BombayDyeing","Red","Wool",90,2000,"Winter");
        System.out.println(p1.brand+" "+p1.color+" "+p1.material+" "+p1.size+" "+p1.price+" "+p1.season);

        Blanket p2 = new Blanket("Raymond","Blue","Cotton",85,1800,"Summer");
        System.out.println(p2.brand+" "+p2.color+" "+p2.material+" "+p2.size+" "+p2.price+" "+p2.season);

        Blanket p3 = new Blanket("Usha","Brown","Wool",95,2200,"Winter");
        System.out.println(p3.brand+" "+p3.color+" "+p3.material+" "+p3.size+" "+p3.price+" "+p3.season);

        Blanket p4 = new Blanket("BombayDyeing","Red","Wool",90,2000,"Winter");
        System.out.println(p4.brand+" "+p4.color+" "+p4.material+" "+p4.size+" "+p4.price+" "+p4.season);

        Blanket p5 = new Blanket("Raymond","Blue","Cotton",85,1800,"Summer");
        System.out.println(p5.brand+" "+p5.color+" "+p5.material+" "+p5.size+" "+p5.price+" "+p5.season);

       
    }
}