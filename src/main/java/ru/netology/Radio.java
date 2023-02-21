package ru.netology;

public class Radio {
    public int numberOfStations = 10;
    private int currentStation;
    private int currentVolume;
    private int MaxVolume =100;
    private int MinVolume =0;

    public Radio() {
    }


    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setNextStation (){
        if (currentStation<9){
            currentStation = currentStation +1;
        }
        else currentStation = 0;
        this.currentStation = currentStation;
    }
    public void setPreviousStation () {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else currentStation = 9;

        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setRadioVolume(int currentVolume) {
        if (currentVolume < MinVolume) {
            return;
        }
        if (currentVolume > MaxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < MaxVolume) {
            currentVolume = currentVolume + 1;
        }
        this.currentVolume = currentVolume;

    }

    public void decreaseVolume(){
        if (currentVolume > MinVolume){
            currentVolume = currentVolume - 1;
        }
        this.currentVolume = currentVolume;
    }

    public void setMaxVolume() {
        currentVolume = 100;
    }

    public void setMinVolume() {
        currentVolume = 0;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}