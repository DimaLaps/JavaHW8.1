package ru.netology;

public class Radio {
    private int maxVolume = 10;
    private int minVolume = 0;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentVolume;
    private int currentChannel;

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }

    public void increaseChannel() {
        if (currentChannel == maxRadioStation) {
            this.currentChannel = minRadioStation;
            return;
        }
        currentChannel++;
    }

    public void decreaseChannel() {
        if (currentChannel == minRadioStation) {
            this.currentChannel = maxRadioStation;
            return;
        }
        currentChannel--;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getmaxRadioStation() {
        return maxRadioStation;
    }

    public int getminRadioStation() {
        return minRadioStation;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxRadioStation) {
            this.currentChannel = maxRadioStation;
            return;
        }
        if (currentChannel < minRadioStation) {
            this.currentChannel = minRadioStation;
            return;
        }
        this.currentChannel = currentChannel;
    }
}