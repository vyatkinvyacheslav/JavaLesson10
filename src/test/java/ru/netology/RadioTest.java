package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {

    @Test
    public void test1() {
        Radio radio = new Radio();

        radio.setCurrentStations(4);
        
        int expected = 4;
        int actual = radio.getCurrentStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Radio radio = new Radio();
        radio.setCurrentStations(3);

        radio.setCurrentStations(0);

        int expected = 0;
        int actual = radio.getCurrentStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        Radio radio = new Radio();

        radio.setCurrentStations(-1);

        int expected = 0;
        int actual = radio.getCurrentStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        Radio radio = new Radio();

        radio.setCurrentStations(1);

        int expected = 1;
        int actual = radio.getCurrentStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        Radio radio = new Radio();

        radio.setCurrentStations(8);

        int expected = 8;
        int actual = radio.getCurrentStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        Radio radio = new Radio();

        radio.setCurrentStations(9);

        int expected = 9;
        int actual = radio.getCurrentStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        Radio radio = new Radio();

        radio.setCurrentStations(9);

        int expected = 9;
        int actual = radio.getCurrentStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test8() {
        Radio radio = new Radio();

        radio.setCurrentStations(10);

        int expected = 0;
        int actual = radio.getCurrentStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test9() {
        Radio radio = new Radio();

        radio.setCurrentStations(19);

        int expected = 0;
        int actual = radio.getCurrentStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test10() {
        Radio radio = new Radio();

        radio.setCurrentStations(-19);

        int expected = 0;
        int actual = radio.getCurrentStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test11() {
        Radio radio = new Radio();
        radio.setCurrentStations(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test12() {
        Radio radio = new Radio();
        radio.setCurrentStations(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test13() {
        Radio radio = new Radio();
        radio.setCurrentStations(1);

        radio.next();

        int expected = 2;
        int actual = radio.getCurrentStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test14() {
        Radio radio = new Radio();
        radio.setCurrentStations(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test15() {
        Radio radio = new Radio();
        radio.setCurrentStations(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test16() {
        Radio radio = new Radio();
        radio.setCurrentStations(4);

        radio.prev();

        int expected = 3;
        int actual = radio.getCurrentStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test17() {
        Radio radio = new Radio();
        radio.setCurrentStations(8);

        radio.prev();

        int expected = 7;
        int actual = radio.getCurrentStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test18() {
        Radio radio = new Radio();
        radio.setCurrentStations(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test19() {
        Radio radio = new Radio();
        radio.setCurrentStations(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test20() {
        Radio radio = new Radio();
        radio.setCurrentStations(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStations();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void test21() {
        Radio radio = new Radio();
        radio.setCurrentVolume(40);

        radio.weightVolume();

        int expected = 41;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test22() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.weightVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test23() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.weightVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test24() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.weightVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test25() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.weightVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test26() {
        Radio radio = new Radio();
        radio.setCurrentVolume(60);

        radio.decreaseVolume();

        int expected = 59;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test27() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.decreaseVolume();

        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test28() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test29() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test30() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
