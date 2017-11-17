/**
 * Created by Alpit on 01-07-2017.
 */
public class GameEntry {
    String name;
    int score;

    GameEntry(String name, int score) {
        this.name = name;
        this.score = score;

    }

    String getName() {
        return name;
    }

    int getScore() {
        return score;
    }

    public String toString() {
        return "(" + name + "," + score + ")";
    }
}

class Scoreboard{
    private int num_entires;
    private GameEntry[] board;
    Scoreboard(int capacity)
    {
        board = new GameEntry[capacity];
    }
    public void add(GameEntry e)
    {
//        int score = e.getScore();
//        if(numentires < board.length || score>board[board.length-1].getScore())
//        {
//            if (numentires<board.length)
//            {
//                numentires++;
//            }
//        int j =numentires-1;
//            while (j>0 && board[j-1].getScore()<score)
//            {
//                board[j] = board[j-1];
//                j--;
//            }
//            board[j-1] = e;
//        }
        if (num_entires < board.length && board[board.length-1].getScore()<e.getScore())
        {
            num_entires++;
        }
        for(int i=board.length-1;i>=0;i--)
        {
            if(board[i].getScore()<e.getScore())
            {
                board[i+1] = board[i];
                board[i]= e;
            }
        }
    }
}