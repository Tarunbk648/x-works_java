class ShoeLaceExecutor
{
    public static void main(String[] args)
    {

        ShoeLace c1 = new ShoeLace();
        c1.brand="Nike";
        c1.color="Black";
        c1.material="Cotton";
        c1.length=120;
        c1.price=200;
        c1.type="Flat";
        c1.shape="Round";
        c1.country="USA";
        c1.shoeType="Sports";
        c1.quality="High";

        System.out.println(c1.brand+" "+c1.color+" "+c1.material+" "+c1.length+" "+c1.price+" "+c1.type+" "+c1.shape+" "+c1.country+" "+c1.shoeType+" "+c1.quality);



        ShoeLace c2 = new ShoeLace();
        c2.brand="Adidas";
        c2.color="White";
        c2.material="Polyester";
        c2.length=110;
        c2.price=180;
        c2.type="Round";
        c2.shape="Oval";
        c2.country="Germany";
        c2.shoeType="Running";
        c2.quality="Premium";

        System.out.println(c2.brand+" "+c2.color+" "+c2.material+" "+c2.length+" "+c2.price+" "+c2.type+" "+c2.shape+" "+c2.country+" "+c2.shoeType+" "+c2.quality);



        ShoeLace c3 = new ShoeLace();
        c3.brand="Puma";
        c3.color="Red";
        c3.material="Cotton";
        c3.length=115;
        c3.price=190;
        c3.type="Flat";
        c3.shape="Round";
        c3.country="Germany";
        c3.shoeType="Casual";
        c3.quality="Standard";

        System.out.println(c3.brand+" "+c3.color+" "+c3.material+" "+c3.length+" "+c3.price+" "+c3.type+" "+c3.shape+" "+c3.country+" "+c3.shoeType+" "+c3.quality);



        System.out.println();



        ShoeLace p1 = new ShoeLace("Nike","Black","Cotton",120,200,"Flat","Round","USA","Sports","High");

        System.out.println(p1.brand+" "+p1.color+" "+p1.material+" "+p1.length+" "+p1.price+" "+p1.type+" "+p1.shape+" "+p1.country+" "+p1.shoeType+" "+p1.quality);



        ShoeLace p2 = new ShoeLace("Adidas","White","Polyester",110,180,"Round","Oval","Germany","Running","Premium");

        System.out.println(p2.brand+" "+p2.color+" "+p2.material+" "+p2.length+" "+p2.price+" "+p2.type+" "+p2.shape+" "+p2.country+" "+p2.shoeType+" "+p2.quality);



        ShoeLace p3 = new ShoeLace("Puma","Red","Cotton",115,190,"Flat","Round","Germany","Casual","Standard");

        System.out.println(p3.brand+" "+p3.color+" "+p3.material+" "+p3.length+" "+p3.price+" "+p3.type+" "+p3.shape+" "+p3.country+" "+p3.shoeType+" "+p3.quality);

    }
}