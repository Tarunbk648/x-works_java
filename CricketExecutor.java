class CricketExecutor
{
    public static void main(String[] args)
    {

        Cricket c1 = new Cricket();
        c1.team="India";
        c1.players=11;
        c1.captain="Rohit";
        c1.stadium="Chinnaswamy";
        c1.overs=20;
        c1.score=180;
        c1.wickets=5;
        c1.runs=180;
        c1.balls=120;
        c1.extras=10;
        c1.bowler="Bumrah";
        c1.batsman="Kohli";
        c1.fours=12;
        c1.sixes=8;
        c1.target=181;
        c1.requiredRuns=20;
        c1.requiredBalls=12;
        c1.umpire="Kumar";
        c1.country="India";
        c1.format="T20";
        System.out.println(c1.team+" "+c1.players+" "+c1.captain+" "+c1.stadium+" "+c1.overs+" "+c1.score+" "+c1.wickets+" "+c1.runs+" "+c1.balls+" "+c1.extras+" "+c1.bowler+" "+c1.batsman+" "+c1.fours+" "+c1.sixes+" "+c1.target+" "+c1.requiredRuns+" "+c1.requiredBalls+" "+c1.umpire+" "+c1.country+" "+c1.format);


        Cricket c2 = new Cricket();
        c2.team="Australia";
        c2.players=11;
        c2.captain="Smith";
        c2.stadium="MCG";
        c2.overs=50;
        c2.score=300;
        c2.wickets=7;
        c2.runs=300;
        c2.balls=300;
        c2.extras=15;
        c2.bowler="Starc";
        c2.batsman="Warner";
        c2.fours=20;
        c2.sixes=5;
        c2.target=301;
        c2.requiredRuns=50;
        c2.requiredBalls=60;
        c2.umpire="Wilson";
        c2.country="Australia";
        c2.format="ODI";
        System.out.println(c2.team+" "+c2.players+" "+c2.captain+" "+c2.stadium+" "+c2.overs+" "+c2.score+" "+c2.wickets+" "+c2.runs+" "+c2.balls+" "+c2.extras+" "+c2.bowler+" "+c2.batsman+" "+c2.fours+" "+c2.sixes+" "+c2.target+" "+c2.requiredRuns+" "+c2.requiredBalls+" "+c2.umpire+" "+c2.country+" "+c2.format);

     

        System.out.println();


        Cricket p1 = new Cricket("India",11,"Rohit","Chinnaswamy",20,180,5,180,120,10,"Bumrah","Kohli",12,8,181,20,12,"Kumar","India","T20");
        System.out.println(p1.team+" "+p1.players+" "+p1.captain+" "+p1.stadium+" "+p1.overs+" "+p1.score+" "+p1.wickets+" "+p1.runs+" "+p1.balls+" "+p1.extras+" "+p1.bowler+" "+p1.batsman+" "+p1.fours+" "+p1.sixes+" "+p1.target+" "+p1.requiredRuns+" "+p1.requiredBalls+" "+p1.umpire+" "+p1.country+" "+p1.format);

        Cricket p2 = new Cricket("Australia",11,"Smith","MCG",50,300,7,300,300,15,"Starc","Warner",20,5,301,50,60,"Wilson","Australia","ODI");
        System.out.println(p2.team+" "+p2.players+" "+p2.captain+" "+p2.stadium+" "+p2.overs+" "+p2.score+" "+p2.wickets+" "+p2.runs+" "+p2.balls+" "+p2.extras+" "+p2.bowler+" "+p2.batsman+" "+p2.fours+" "+p2.sixes+" "+p2.target+" "+p2.requiredRuns+" "+p2.requiredBalls+" "+p2.umpire+" "+p2.country+" "+p2.format);

    

    }
}