package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void ShouldCheckCurrentStation(){

        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void ShouldCheckCurrentStation2() {

        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void ShouldCheckRadioStationMoreThanNine() {
        radio.setCurrentStation(9);
        radio.setNextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void ShouldCheckRadioStationLessThanNine() {

        radio.setCurrentStation(9);
        radio.setPreviousStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void ShouldCheckRadioStationLessThanZero() {

        radio.setCurrentStation(0);
        radio.setPreviousStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void ShouldCheckRadioStationMoreThanZero() {

        radio.setCurrentStation(0);
        radio.setNextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    void getCurrentStation() {
    }

    @Test
    public void ShouldCheckRadioVolumeMoreThanHundred() {

        radio.setRadioVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldCheckRadioVolumeLessThanHundred() {

        radio.setRadioVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void ShouldCheckRadioVolumeLessThanZero() {

        radio.setRadioVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void ShouldCheckVolumeMoreThanZero() {

        radio.setRadioVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void ShouldSetRadioVolume() {

        radio.setRadioVolume(3);
        int expected = 3;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void ShouldSetRadioVolumeMoreThanHundred() {

        radio.setRadioVolume(111);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void ShouldSetRadioVolumeLessThanZero() {

        radio.setRadioVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }



}