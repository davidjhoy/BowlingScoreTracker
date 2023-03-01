import java.util.Date;

public class Game {
    private int score;
    private Date date = new Date();
    public Bowler[] players;


    public  Game(int s, Date d){
        score = s;
        date = d;
    }

    public int getScore(){
        return score;
    }

    public Date getGameDate(){
        return date;
    }

   

}
