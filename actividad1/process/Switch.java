package edu_carlos_mendez.actividad1.process;

public class Switch {

    private boolean isOn;

    public void switchOn() {
        isOn = true;
    }
    public void switchOff() {
        isOn = false;
    }
    public boolean isOn() {
        return isOn;
    }
}