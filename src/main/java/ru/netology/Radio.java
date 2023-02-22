package ru.netology;

public class Radio {

    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int numberOfRadioStation = 10;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentRadioStation;
    private int currentSoundLevel;

    public Radio(int numberOfRadioStation) {
        this.numberOfRadioStation = numberOfRadioStation - 1;
    }

    public Radio() {

    }

    public int getNumberOfRadioStation() {
        return numberOfRadioStation;
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentSoundLevel() {
        return currentSoundLevel;
    }

    public void setCurrentSoundLevel(int currentSoundLevel) {
        if (currentSoundLevel < minVolume) {
            return;
        }
        if (currentSoundLevel > maxVolume) {
            return;
        }
        this.currentSoundLevel = currentSoundLevel;
    }

    public void setChangeRadioStation(int changeRadioStation) {
        if (changeRadioStation > maxRadioStation) {
            return;
        }
        if (changeRadioStation < minRadioStation) {
            changeRadioStation = minRadioStation;
        }
        this.currentRadioStation = changeRadioStation;
    }

    public void next() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void prev() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public void volumePlus() {
        if (currentSoundLevel < maxVolume) {
            currentSoundLevel++;
        }
    }

    public void volumeMinus() {
        if (currentSoundLevel > minVolume) {
            currentSoundLevel--;
        }
    }
}