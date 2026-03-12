class NecklaceExecutor
{
    public static void main(String[] args)
    {

        Necklace c1 = new Necklace();
        c1.brand="Tanishq";
        c1.color="Gold";
        c1.material="Gold";
        c1.price=80000;
        c1.weight=40;
        c1.length=24;
        c1.type="Chain";
        c1.design="Classic";
        c1.country="India";
        c1.owner="Tarun";
        c1.rating=9;
        c1.quantity=1;
        c1.stone="Diamond";
        c1.shape="Round";
        c1.clasp="Hook";
        c1.style="Modern";
        c1.year=2024;
        c1.gender="Female";
        c1.occasion="Wedding";
        c1.quality="Premium";

        System.out.println(c1.brand+" "+c1.color+" "+c1.material+" "+c1.price+" "+c1.weight+" "+c1.length+" "+c1.type+" "+c1.design+" "+c1.country+" "+c1.owner+" "+c1.rating+" "+c1.quantity+" "+c1.stone+" "+c1.shape+" "+c1.clasp+" "+c1.style+" "+c1.year+" "+c1.gender+" "+c1.occasion+" "+c1.quality);



        Necklace c2 = new Necklace();
        c2.brand="Malabar";
        c2.color="Silver";
        c2.material="Silver";
        c2.price=30000;
        c2.weight=25;
        c2.length=22;
        c2.type="Beads";
        c2.design="Royal";
        c2.country="India";
        c2.owner="Anita";
        c2.rating=8;
        c2.quantity=1;
        c2.stone="Ruby";
        c2.shape="Oval";
        c2.clasp="Lock";
        c2.style="Traditional";
        c2.year=2023;
        c2.gender="Female";
        c2.occasion="Festival";
        c2.quality="High";

        System.out.println(c2.brand+" "+c2.color+" "+c2.material+" "+c2.price+" "+c2.weight+" "+c2.length+" "+c2.type+" "+c2.design+" "+c2.country+" "+c2.owner+" "+c2.rating+" "+c2.quantity+" "+c2.stone+" "+c2.shape+" "+c2.clasp+" "+c2.style+" "+c2.year+" "+c2.gender+" "+c2.occasion+" "+c2.quality);



        Necklace c3 = new Necklace();
        c3.brand="Kalyan";
        c3.color="Gold";
        c3.material="Gold";
        c3.price=70000;
        c3.weight=35;
        c3.length=23;
        c3.type="Chain";
        c3.design="Modern";
        c3.country="India";
        c3.owner="Riya";
        c3.rating=9;
        c3.quantity=1;
        c3.stone="Emerald";
        c3.shape="Round";
        c3.clasp="Hook";
        c3.style="Stylish";
        c3.year=2024;
        c3.gender="Female";
        c3.occasion="Party";
        c3.quality="Premium";

        System.out.println(c3.brand+" "+c3.color+" "+c3.material+" "+c3.price+" "+c3.weight+" "+c3.length+" "+c3.type+" "+c3.design+" "+c3.country+" "+c3.owner+" "+c3.rating+" "+c3.quantity+" "+c3.stone+" "+c3.shape+" "+c3.clasp+" "+c3.style+" "+c3.year+" "+c3.gender+" "+c3.occasion+" "+c3.quality);



        System.out.println();



        Necklace p1 = new Necklace("Tanishq","Gold","Gold",80000,40,24,"Chain","Classic","India","Tarun",9,1,"Diamond","Round","Hook","Modern",2024,"Female","Wedding","Premium");

        System.out.println(p1.brand+" "+p1.color+" "+p1.material+" "+p1.price+" "+p1.weight+" "+p1.length+" "+p1.type+" "+p1.design+" "+p1.country+" "+p1.owner+" "+p1.rating+" "+p1.quantity+" "+p1.stone+" "+p1.shape+" "+p1.clasp+" "+p1.style+" "+p1.year+" "+p1.gender+" "+p1.occasion+" "+p1.quality);



        Necklace p2 = new Necklace("Malabar","Silver","Silver",30000,25,22,"Beads","Royal","India","Anita",8,1,"Ruby","Oval","Lock","Traditional",2023,"Female","Festival","High");

        System.out.println(p2.brand+" "+p2.color+" "+p2.material+" "+p2.price+" "+p2.weight+" "+p2.length+" "+p2.type+" "+p2.design+" "+p2.country+" "+p2.owner+" "+p2.rating+" "+p2.quantity+" "+p2.stone+" "+p2.shape+" "+p2.clasp+" "+p2.style+" "+p2.year+" "+p2.gender+" "+p2.occasion+" "+p2.quality);



        Necklace p3 = new Necklace("Kalyan","Gold","Gold",70000,35,23,"Chain","Modern","India","Riya",9,1,"Emerald","Round","Hook","Stylish",2024,"Female","Party","Premium");

        System.out.println(p3.brand+" "+p3.color+" "+p3.material+" "+p3.price+" "+p3.weight+" "+p3.length+" "+p3.type+" "+p3.design+" "+p3.country+" "+p3.owner+" "+p3.rating+" "+p3.quantity+" "+p3.stone+" "+p3.shape+" "+p3.clasp+" "+p3.style+" "+p3.year+" "+p3.gender+" "+p3.occasion+" "+p3.quality);

    }
}