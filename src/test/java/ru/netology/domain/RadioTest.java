package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldGetmaxRadiostation() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);

        assertEquals(20, radio.getMaxRadiostation());
    }
    @Test
    public void shouldGetCurrentRadiostation() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);

        assertEquals(10, radio.getCurrentRadiostation());
    }
    @Test
    public void shouldGetMaxVolume() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldGetCurrentVolume() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);
        assertEquals(50, radio.getCurrentVolume());
    }
    @Test
    public void shouldNextRadiostation1() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);
        radio.nextRadiostation();

        assertEquals(11, radio.getCurrentRadiostation());

    }
    @Test
    public void shouldNextRadiostation2() {
        Radio radio = new Radio(
                20,
                20,
                50,
                true);

        radio.nextRadiostation();

        assertEquals(0, radio.getCurrentRadiostation());
    }
    @Test
    public void shouldNextRadiostation3() {
        Radio radio = new Radio(
                20,
                22,
                50,
                true);
        radio.setCurrentRadiostation(22);
        radio.nextRadiostation();

        assertEquals(20, radio.getCurrentRadiostation());
    }
    @Test
    public void shouldNextRadiostation4() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);
        radio.setCurrentRadiostation(-1);
        radio.nextRadiostation();

        assertEquals(0, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldPrevRadiostation1() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);
        radio.prevRadiostation();

        assertEquals(9, radio.getCurrentRadiostation());

    }

    @Test
    public void shouldPrevRadiostation2() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);
        radio.setCurrentRadiostation(0);
        radio.prevRadiostation();

        assertEquals(20, radio.getCurrentRadiostation());

    }

    @Test
    public void shouldPrevRadiostation3() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);
        radio.setCurrentRadiostation(23);
        radio.prevRadiostation();

        assertEquals(20, radio.getCurrentRadiostation());

    }

    @Test
    public void shouldPrevRadiostation4() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);
        radio.setCurrentRadiostation(-2);
        radio.prevRadiostation();

        assertEquals(0, radio.getCurrentRadiostation());

    }

    @Test
    public void shouldincreaseCurrentVolume1() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);
        radio.increaseCurrentVolume();

        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void shouldincreaseCurrentVolume2() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);
        radio.setCurrentVolume(102);
        radio.increaseCurrentVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldincreaseCurrentVolume3() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);
        radio.setCurrentVolume(-2);
        radio.increaseCurrentVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shoulddecreaseCurrentVolume1() {
        Radio radio = new Radio(
                20,
                10,
                50,
                true);
        radio.decreaseCurrentVolume();

        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void shoulddecreaseCurrentVolume2() {
        Radio radio = new Radio(
                20,
                10,
                150,
                true);
        radio.decreaseCurrentVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shoulddecreaseCurrentVolume3() {
        Radio radio = new Radio(
                20,
                10,
                -5,
                true);
        radio.decreaseCurrentVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

}