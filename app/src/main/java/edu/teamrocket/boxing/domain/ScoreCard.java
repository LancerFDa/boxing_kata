package edu.teamrocket.boxing.domain;

public class ScoreCard {

    private final String color;
    private String redCorner = "";
    private String blueCorner = "";
    private String[] judgeScoreCard;
   
    public void setRCorner(String redCorner) {
        this.redCorner = redCorner;
    }

    public void setBCorner(String blueCorner) {
        this.blueCorner = blueCorner;
    }

    public ScoreCard(String color) {
        this.color = color;
    }
    
    public String getRedCorner() {
        return redCorner;
    }

    public String getBlueCorner() {
        return blueCorner;
    }
}