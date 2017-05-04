package com.company.task4;

/**
 * Created by dima on 04.05.17.
 */
public class Diriger {
    private PlayingAction fiddle;
    private PlayingAction windy;
    private PlayingAction percussion;

    public Diriger(PlayingAction fiddle, PlayingAction windy, PlayingAction percussion) {
        this.fiddle = fiddle;
        this.windy = windy;
        this.percussion = percussion;
    }

    public void playFiddle(){
        fiddle.play();
    }
    public void playWindy(){
        windy.play();
    }
    public void playPercussion(){
        percussion.play();
    }
}
