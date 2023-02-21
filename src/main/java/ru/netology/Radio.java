package ru.netology;

public class Radio {
    private int currentVolume;
    private int currentStation;
    private int minStation;
    private int maxStation;
    private int minVolume;
    private int maxVolume;

    //Конструкторы
    public Radio() { //значения по умолчанию
        minStation = 0;
        maxStation = 9;
        minVolume = 0;
        maxVolume = 10;
    }

    public Radio(int sizeRadio) { //поле значения кол-ва станций
        maxStation = sizeRadio - 1;
    }

    //Геттеры
    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    //Сеттер громкости
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    // Сеттер радиостанций
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    //Увеличение громкости на +1
    public void increaseVolume() {
        if (getCurrentVolume() < maxVolume) {
            setCurrentVolume(currentVolume + 1);
        }
    }

    //Понижение громкости на -1
    public void decreaseVolume() {
        if (getCurrentVolume() > minVolume) {
            setCurrentVolume(currentVolume - 1);
        }
    }

    //Переключение радиостанции на +1
    public void nextStation() {
        if (getCurrentStation() < maxStation) {
            setCurrentStation(currentStation + 1);
        } else {
            setCurrentStation(minStation);
        }
    }

    //Переключение радиостанции на -1
    public void prevStation() {
        if (getCurrentStation() > minStation) {
            setCurrentStation(currentStation - 1);
        } else {
            setCurrentStation(maxStation);
        }
    }


}