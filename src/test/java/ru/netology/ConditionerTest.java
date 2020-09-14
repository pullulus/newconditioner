package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    private Conditioner conditioner = new Conditioner();

    @Test
    public void getAndSetCurrentTemperature() {

        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(20);
        conditioner.setCurrentTemperature(29);

        assertEquals(29, conditioner.getCurrentTemperature());
    }

    @Test
    public void getAndSetCurrentTemperatureEqualsMaximum() {

        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(30);

        assertEquals(30, conditioner.getCurrentTemperature());
    }

    @Test
    public void getAndSetCurrentTemperatureOverMaximum() {

        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(32);

        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    public void getAndSetCurrentTemperatureUnderMinimum() {

        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(20);
        conditioner.setCurrentTemperature(18);

        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperature() {

        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(25);

        conditioner.increaseCurrentTemperature();

        assertEquals(26, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperatureEqualsMaximum() {

        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(30);

        conditioner.increaseCurrentTemperature();

        assertEquals(30, conditioner.getCurrentTemperature());
    }



    @Test
    public void getAndSetCurrentTemperatureEqualsMinimum() {

        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(20);
        conditioner.setCurrentTemperature(20);

        assertEquals(20, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperature() {

        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(20);
        conditioner.setCurrentTemperature(25);

        conditioner.decreaseCurrentTemperature();

        assertEquals(24, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureEqualsMinimum() {

        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(20);
        conditioner.setCurrentTemperature(20);

        conditioner.decreaseCurrentTemperature();

        assertEquals(20, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureUnderMinimum() {

        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(20);
        conditioner.setCurrentTemperature(18);

        conditioner.decreaseCurrentTemperature();

        assertEquals(0, conditioner.getCurrentTemperature());
    }
}
