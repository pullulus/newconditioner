package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {


    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(31);

        conditioner.increaseCurrentTemperature();

        int actual = conditioner.getCurrentTemperature();
        int expected = 0;


        assertEquals(expected, actual);
    }
    }
