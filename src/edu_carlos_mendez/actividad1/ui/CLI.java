package edu_carlos_mendez.actividad1.ui;
import edu_carlos_mendez.actividad1.process.Switch;
public class CLI {
    public static void start(){
        Switch switch_wifi;
        switch_wifi = new Switch();
        System.out.println("Hola, bienvenido al programa");
        System.out.println("Estado inicial del switch: "+ (switch_wifi.isOn()));
        if(switch_wifi.isOn()) {
            System.out.println("Desea apagar el switch");
        }else {
            System.out.println("Desea prender el switch");
        }
        System.out.println("El swtich está "+switch_wifi.isOn());
    }
}