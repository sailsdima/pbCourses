package com.company.task4;

/**
 * Created by dima on 04.05.17.
 */
public class Windy implements PlayingAction {
    private MusicalInstrument musicalInstrument;

    public Windy(MusicalInstrument musicalInstrument) {
        this.musicalInstrument = musicalInstrument;
    }

    @Override
    public void play() {
        musicalInstrument.playWindInstrument();
    }
}
