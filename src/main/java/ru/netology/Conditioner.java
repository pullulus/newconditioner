package ru.netology;

public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;


    public void setMaxTemperature(int maxTemperature) {

        this.maxTemperature = maxTemperature;
    }


    public void setMinTemperature(int minTemperature) {

        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {

        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature;
    }

    public void increaseCurrentTemperature() {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < maxTemperature)  {
            currentTemperature = currentTemperature + 1;
        }
    }

    public  void decreaseCurrentTemperature() {
        if (currentTemperature < minTemperature) {
            return;
        }
        if (currentTemperature > minTemperature) {
            currentTemperature = currentTemperature - 1;
        }
    }
}
