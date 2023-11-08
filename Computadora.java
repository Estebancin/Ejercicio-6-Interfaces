import java.util.ArrayList;
import java.util.List;

public class Computadora extends Dispositivo implements Comparable<Dispositivo> {
    private int memoriaRAM;
    private String discoDuro;
    private double velocidadCPU;
    private double velocidadGPU;
    private int videoActual = 0;
    private boolean videoReproduciendo = false;

    // Constructor
    public Computadora(String marca, String modelo, double precio, int cuotas, int memoriaRAM, String discoDuro, double velocidadCPU, double velocidadGPU) {
        super(marca, modelo, precio, cuotas);
        this.memoriaRAM = memoriaRAM;
        this.discoDuro = discoDuro;
        this.velocidadCPU = velocidadCPU;
        this.velocidadGPU = velocidadGPU;
        this.videosPublicitarios = new ArrayList<>();

    }

    
    public void encender() {
        this.encendido = true;
    }

    
    public void apagar() {
        this.encendido = false;
    }

    
    public void subirVolumen() {
        this.volumen += 10;
        if (this.volumen > 100) {
            this.volumen = 100;
        }
    }

    public void bajarVolumen() {
        this.volumen -= 10;
        if (this.volumen < 0) {
            this.volumen = 0;
        }
    }

    
    public void aumentarBrillo() {
        this.brillo += 5;
        if (this.brillo > 100) {
            this.brillo = 100;
        }
    }

    
    public void disminuirBrillo() {
        this.brillo -= 5;
        if (this.brillo < 0) {
            this.brillo = 0;
        }
    }

    
    public void mostrarInformacion() {
        System.out.println("Memoria RAM: " + this.memoriaRAM);
        System.out.println("Disco duro: " + this.discoDuro);
        System.out.println("Velocidad CPU: " + this.velocidadCPU);
        System.out.println("Velocidad GPU: " + this.velocidadGPU);
    }

    
    public void mostrarEstadoActual() {
        System.out.println("Encendido: " + this.encendido);
        System.out.println("Volumen: " + this.volumen);
        System.out.println("Brillo: " + this.brillo);
    }

    
    public void reproducirVideo() {
        if (videoActual < videosPublicitarios.size()) {
            System.out.println("Reproduciendo video: " + videosPublicitarios.get(videoActual));
            videoReproduciendo = true;
        } else {
            System.out.println("No hay videos para reproducir.");
        }
    }

    
    public void pausarVideo() {
        if (videoReproduciendo) {
            System.out.println("Video pausado: " + videosPublicitarios.get(videoActual));
            videoReproduciendo = false;
        } else {
            System.out.println("No hay un video reproduciéndose actualmente.");
        }
    }

    
    public void pararVideo() {
        if (videoReproduciendo) {
            System.out.println("Video detenido: " + videosPublicitarios.get(videoActual));
            videoReproduciendo = false;
        } else {
            System.out.println("No hay un video reproduciéndose actualmente.");
        }
    }

    
    public void cambiarVideo() {
        if (videoActual < videosPublicitarios.size() - 1) {
            videoActual++;
        } else {
            videoActual = 0; // Vuelve al primer video cuando llega al final de la lista
        }
        System.out.println("Video cambiado a: " + videosPublicitarios.get(videoActual));
    }

    
    public int compareTo(Dispositivo otro) {
        return Double.compare(this.precio, otro.getPrecio());
    }
}

