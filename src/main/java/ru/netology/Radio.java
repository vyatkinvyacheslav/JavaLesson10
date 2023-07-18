

package ru.netology;

public class Radio {
    private int currentStations;
    private int currentVolume;
    private int maxStation;
    private int maxVolume;

    public Radio() {
        maxStation = 9;
        maxVolume = 100;
    }

    public Radio(int stationsCount, int volumeCount) {
        maxStation = stationsCount - 1;
        maxVolume = volumeCount - 1;

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
        if (currentVolume != maxVolume) {
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
        if (currentVolume >= maxVolume) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }
}