package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int minNumber = 0;
    private int maxNumber = 9;
    private int minVolume = 0;
    private int maxVolume = 10;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) { // указываем границы диапазона
        if (newCurrentStation < minNumber) {
            return;
        }
        if (newCurrentStation > maxNumber) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextNumber() {
        if (currentStation < maxNumber) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minNumber; // переход счетчика после 9 на 0
        }
    }

    public void prevNumber() {
        if (currentStation > minNumber) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxNumber; // переход счетчика после 0 на 9
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) { // указываем границы диапазона
        if (newCurrentVolume < minVolume) {
            newCurrentVolume = minVolume;
        }
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}