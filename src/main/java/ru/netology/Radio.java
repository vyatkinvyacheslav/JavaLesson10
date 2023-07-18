

package ru.netology;

public class Radio {
    private int currentStations;
    private int currentVolume;
    private int maxStation;


    public Radio() {
        maxStation = 9;

    }

    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;


    }

    public void next() {
        if (currentStations != maxStation) {
            currentStations++;
        } else {
            currentStations = 0;
        }
    }

    public void prev() {
        if (currentStations != 0) {
            currentStations--;
        } else {
            currentStations = maxStation;
        }
    }

    public void weightVolume() {
        if (currentVolume != 100) {
            currentVolume++;
        } else {
            return;
        }
    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            return;
        }
    }


    public int getCurrentStations() {
        return currentStations;
    }

    public void setCurrentStations(int currentStations) {
        if (currentStations < 0) {
            return;
        }
        if (currentStations > maxStation) {
            return;
        }
        this.currentStations = currentStations;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        if (currentVolume >= 100) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }
}