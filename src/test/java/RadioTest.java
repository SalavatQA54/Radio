import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.services.Radio;

public class RadioTest {
    @Test

    public void RadioStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }
    @Test

    public void ShouldSetRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void ShouldNotSetNewRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }
    @Test

    public void ShouldNotSetRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotSetRadioStationUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(11);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void ShouldSetToMaxRadioStation() {
        Radio radio = new Radio();

        radio.SetToMaxStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void ShouldSetToMinRadioStation() {
        Radio radio = new Radio();

        radio.SetToMinStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void ShouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);
        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void ShouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void ShouldSetToMaxVolume() {
        Radio radio = new Radio();

        radio.SetToMaxVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void ShouldSetToMinVolume() {
        Radio radio = new Radio();

        radio.SetToMinVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotSetVolumeUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void prevRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(4);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void nextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void nextNewToRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test

    public void nextNewRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void newPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldNotNeedNewPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void increaseToNextVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(4);
        radio.increaseToNextVolume();
        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void increaseToNewNextVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        radio.increaseToNextVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void increaseNewNextVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.increaseToNextVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseToPrevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.increaseToPrevVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNewIncreaseToPrevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.increaseToPrevVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}





