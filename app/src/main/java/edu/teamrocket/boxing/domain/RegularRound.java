package edu.teamrocket.boxing.domain;

class RegularRound implements Round {

    private final String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;

    public RegularRound( String roundScore){
        this.roundScore = roundScore.replaceAll("\\s", "");
    }

    @Override
    public byte getRedBoxerScore(){
        return this.redBoxerScore;
    }

    @Override
    public byte getBlueBoxerScore(){
        return this.blueBoxerScore;
    }
}