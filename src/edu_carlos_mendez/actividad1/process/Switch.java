package edu_carlos_mendez.actividad1.process;

public class Switch {

    private boolean isOn;

    public void prender() {
        isOn = true;
    }

    public void apagar() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
}