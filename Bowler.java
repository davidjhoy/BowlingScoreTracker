import java.util.*;
public class Bowler {

    private String name;
    private ArrayList<Game> games;
    private int LastGameScore;
    private int careerPoints;
    

    public  Bowler(String n){
        //calculate 
        name = n;
    }

    public void addGame(Game g){
        //update average from each game
        games.add(g);
        careerPoints += g.getScore();
        //
    }

    //the Game list could be a stack since it would be easy to get the last game. 

    public int getAverageGameScore(){
        if (games.size() == 0){
            return 0;
        }else{
            return careerPoints / games.size();
        }
    }

    public Date getLastGameDate(){
        Game lastGame = games.get(0);
        return lastGame.getGameDate();
    }

    public String toString(){

        // Bowler name
        // Number of games
        // Average score of all of the games
        // Score of their last game
        // Date of their last game
        
        return "Bowler name:" + name + "/n" + "Number of Games: " + games.size() + "/n"  + "Average Game Score" + getAverageGameScore() + "/n" + "Last Game Score:" + LastGameScore + "/n" + "Last Game Date: " + getLastGameDate();
    }
}
