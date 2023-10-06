public class Player {
    private String name;
    private int score;

    public Player(){
        name = "";
        score = 0;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void increaseScore(int score){
        this.score += score;
    }
    public int getScore(){
        return score;
    }
}
