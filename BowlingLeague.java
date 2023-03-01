import java.util.*;

public class BowlingLeague {

    private String name;
    private ArrayList<Bowler> roster;
    private ArrayList<Game> games;

    public BowlingLeague(String n){
        System.out.println("Initiliazing League");
        name = n;
        roster = new ArrayList<Bowler>();
        games = new ArrayList<Game>();
    }

    public String toString(){
        return "League: " + name + "\n" + "Number of Bowlers: " + roster.size() + "\n" + "Number of Games: " + games.size() + "\n";
    }

    //Adding a game to the league should update the game field for all of the players. 
    public void addGame(Game g){
        games.add(g);
        for (Bowler b: roster){
            b.addGame(g);
        }

    }

    //Add some logic so you can add the same bowler in the league twice
    public void addBowler(Bowler b){
        roster.add(b);
    }

    public ArrayList<Bowler> getRoster(){
        return roster;
    }

    public ArrayList<Game> getGames(){
        return games;
    }

    public static void main(String[] args){
        //implement new BowlingLeague instance
        BowlingLeague myATLLeague = new BowlingLeague("Atlanta Gems");

        //initialize new bowlers
        Bowler David = new Bowler("David Hoy");
        Bowler Karen = new Bowler("Karen Smith");
        Bowler Darren = new Bowler("Darren Aron");
        Bowler Kyle = new Bowler("Kyle George");
        Bowler Sharon = new Bowler("Sharon Hyde");
        Bowler Marcus = new Bowler("Marcus Smith");

        Bowler[] bowlers = {David, Karen, Darren, Kyle, Sharon, Marcus};

        //Add Players to League
        for (Bowler b : bowlers){
            myATLLeague.addBowler(b);
        }

        //initialize new games
        Game game1 = new Game(120, bowlers, "Atlanta");
        Game game2 = new Game(150, bowlers, "Miami");
        Game game3 = new Game(160, bowlers, "San Antonio");

        Game[] games = {game1, game2, game3};

        //Add Games to League
        for (Game g: games){
            myATLLeague.addGame(g);
        }

        //Print League Stats
        System.out.println(myATLLeague);

        System.out.println("Bowlers: ");
        for (Bowler b : myATLLeague.getRoster()){
            System.out.println(b);
        }

        for (Game g : myATLLeague.getGames()){
            System.out.println(g);
        }

        }
        

    }
