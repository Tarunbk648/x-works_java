class Cricket
{
    String team;
    int players;
    String captain;
    String stadium;
    int overs;
    int score;
    int wickets;
    int runs;
    int balls;
    int extras;
    String bowler;
    String batsman;
    int fours;
    int sixes;
    int target;
    int requiredRuns;
    int requiredBalls;
    String umpire;
    String country;
    String format;

    Cricket()
    {
        System.out.println("Default Constructor Called");
    }

    Cricket(String team,int players,String captain,String stadium,int overs,int score,int wickets,int runs,int balls,int extras,String bowler,String batsman,int fours,int sixes,int target,int requiredRuns,int requiredBalls,String umpire,String country,String format)
    {
        System.out.println("Parameterized constructor called...");
        this.team=team;
        this.players=players;
        this.captain=captain;
        this.stadium=stadium;
        this.overs=overs;
        this.score=score;
        this.wickets=wickets;
        this.runs=runs;
        this.balls=balls;
        this.extras=extras;
        this.bowler=bowler;
        this.batsman=batsman;
        this.fours=fours;
        this.sixes=sixes;
        this.target=target;
        this.requiredRuns=requiredRuns;
        this.requiredBalls=requiredBalls;
        this.umpire=umpire;
        this.country=country;
        this.format=format;
    }
}