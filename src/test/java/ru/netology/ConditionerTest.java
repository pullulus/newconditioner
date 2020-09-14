package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void getAndSetCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(29);

        int actual = conditioner.getCurrentTemperature();
        int expected = 29;

        assertEquals(expected,actual);
    }

    @Test
    public void getAndSetCurrentTemperatureEqualMaximum() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(30);

        int actual = conditioner.getCurrentTemperature();
        int expected = 30;

        assertEquals(expected, actual);
    }

    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(30);

        conditioner.increaseCurrentTemperature();

        int actual = conditioner.getCurrentTemperature();
        int expected = 30;


        assertEquals(expected, actual);
    }
    }
