package ru.netology.domain;

public class Radio {
    private int minRadiostation = 0;
    private int maxRadiostation = 9;
    private int currentRadiostation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private boolean on;

    public Radio(int maxRadiostation, int currentRadiostation, int currentVolume, boolean on) {
        this.minRadiostation = minRadiostation;
        this.maxRadiostation = maxRadiostation;
        this.currentRadiostation = currentRadiostation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
        this.on = on;
    }

    public void nextRadiostation() {
        if (currentRadiostation >= minRadiostation & currentRadiostation < maxRadiostation) {
            this.currentRadiostation = currentRadiostation + 1;
        }

        if (currentRadiostation == maxRadiostation | currentRadiostation < minRadiostation) {
            this.currentRadiostation = minRadiostation;
        }

        if (currentRadiostation > maxRadiostation) {
            this.currentRadiostation = maxRadiostation;
        }

    }
    public void prevRadiostation() {
        if (currentRadiostation > minRadiostation & currentRadiostation <= maxRadiostation) {
            this.currentRadiostation = currentRadiostation - 1;
        }

        if (currentRadiostation == minRadiostation | currentRadiostation > maxRadiostation) {
            this.currentRadiostation = maxRadiostation;
        }

        if (currentRadiostation < minRadiostation) {
            this.currentRadiostation = minRadiostation;
        }

    }
    public void increaseCurrentVolume () {
        if (currentVolume >= minVolume & currentVolume < maxVolume) {
            this.currentVolume = currentVolume + 1;
        }

        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        }

        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
        }
    }

    public void decreaseCurrentVolume () {
        if (currentVolume > minVolume & currentVolume <= maxVolume) {
            this.currentVolume = currentVolume - 1;
        }

        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
        }

        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
        }
    }
    public int getMaxRadiostation() {
        return maxRadiostation;
    }

    public void setMaxRadiostation(int maxRadiostation) {
        this.maxRadiostation = maxRadiostation;
    }
    public int getCurrentRadiostation() {
        return currentRadiostation;
    }

    public void setCurrentRadiostation(int currentRadiostation) {
        this.currentRadiostation = currentRadiostation;
    }
    public int getMaxVolume() {
        return maxVolume;
    }
    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }
    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
}
