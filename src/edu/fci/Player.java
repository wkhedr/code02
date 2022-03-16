package edu.fci;

public class Player {
    private String name;
    private int Score;
    private int totalScore;
    private Die die;

    public Player(String name) {
        Score =  9;
        this.name = name;
        totalScore = 0;
        die  = new Die(6);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return Score;
    }

    public int getTotalScore() {
        return totalScore;
    }

    void Play()
    {
        die.Roll();
        Score = die.getValue();
        totalScore+=Score;
    }


}
