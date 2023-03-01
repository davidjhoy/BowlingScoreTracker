import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Game {
    private int score;
    private Date date = new Date();
    private Bowler[] players;
    private String location;


    public  Game(int s, Bowler[] b, String l){
        score = s;
        players = b;
        location = l;
    }

    public int getScore(){
        return score;
    }

    public Date getGameDate(){
        return date;
    }

    public Bowler[] getBowlers(){
        return players;
            
    }

    public String toString(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        String dateString = dateFormat.format(date);
        return location +  ": " + dateString;
    }

   

}
