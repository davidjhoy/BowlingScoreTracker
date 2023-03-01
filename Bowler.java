import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Bowler {

    private String name;
    private ArrayList<Game> games;
    private int careerPoints;
    

    public  Bowler(String n){
        name = n;
        games = new ArrayList<Game>();
    }

    public void addGame(Game g){
        //update average from each game
        games.add(g);
        careerPoints += g.getScore();
        
    }

    public int getAverageGameScore(){
        if (games.isEmpty()){
            return 0;
        }else{
            return careerPoints / games.size();
        }
    }


    public String getLastGameDate(){
        if (games.isEmpty()){
            return "No Games Yet";
        }else{
            Game lastGame = games.get(games.size() - 1);
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
            String dateString = dateFormat.format(lastGame.getGameDate());
            return dateString;
        }
        
    }

    public int getLastGameScore(){
        if (games.isEmpty()){
            return 0;
        }else{
            Game lastGame = games.get(games.size() - 1);
            return lastGame.getScore();
        }
    }

    public String toString(){

        // Bowler name
        // Number of games
        // Average score of all of the games
        // Score of their last game
        // Date of their last game
        int AvgScore = getAverageGameScore();
        int GameSize = games.size();
        String lastGameDate = getLastGameDate();
        int LastGameScore = getLastGameScore();
        return "Bowler name: " + name + "\n" + "Number of Games: " + GameSize + "\n"  + "Average Game Score: " + AvgScore + "\n" + "Last Game Score: " + LastGameScore + "\n" + "Last Game Date: " + lastGameDate + "\n";
    }
}
