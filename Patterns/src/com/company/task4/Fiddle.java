package com.company.task4;

/**
 * Created by dima on 04.05.17.
 */
public class Fiddle implements PlayingAction{

    private MusicalInstrument musicalInstrument;

    public Fiddle(MusicalInstrument musicalInstrument) {
        this.musicalInstrument = musicalInstrument;
    }


    @Override
    public void play() {
        musicalInstrument.playFiddleInstrument();
    }
}
