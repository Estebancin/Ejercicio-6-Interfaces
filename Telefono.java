import java.util.ArrayList;
import java.util.List;

public class Telefono extends Dispositivo implements Comparable<Dispositivo> {
    private int memoriaRAM;
    private String procesador;
    private int almacenamientoInterno;
    private boolean extiendeMemoria;
    private boolean incluyeCuboCargador;
    private boolean es5G;
    private int videoActual = 0;
    private boolean videoReproduciendo = false;

    public Telefono(String marca, String modelo, double precio, int cuotas, int memoriaRAM, String procesador, int almacenamientoInterno, boolean extiendeMemoria, boolean incluyeCuboCargador, boolean es5G) {
        super(marca, modelo, precio, cuotas);
        this.memoriaRAM = memoriaRAM;
        this.procesador = procesador;
        this.almacenamientoInterno = almacenamientoInterno;
        this.extiendeMemoria = extiendeMemoria;
        this.incluyeCuboCargador = incluyeCuboCargador;
        this.es5G = es5G;
        this.videosPublicitarios = new ArrayList<>();
    }

    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    public void subirVolumen() {
        this.volumen += 2;
        if (this.volumen > 100) {
            this.volumen = 100;
        }
    }

    public void bajarVolumen() {
        this.volumen -= 2;
        if (this.volumen < 0) {
            this.volumen = 0;
        }
    }

    public void aumentarBrillo() {
        this.brillo += 3;
        if (this.brillo > 100) {
            this.brillo = 100;
        }
    }

    public void disminuirBrillo() {
        this.brillo -= 3;
        if (this.brillo < 0) {
            this.brillo = 0;
        }
    }

    public void mostrarInformacion() {
        System.out.println("Memoria RAM: " + this.memoriaRAM);
        System.out.println("Procesador: " + this.procesador);
        System.out.println("Almacenamiento interno: " + this.almacenamientoInterno);
        System.out.println("Extiende memoria: " + this.extiendeMemoria);
        System.out.println("Incluye cubo cargador: " + this.incluyeCuboCargador);
        System.out.println("Es 5G: " + this.es5G);
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
            videoActual = 0;
        }
        System.out.println("Video cambiado a: " + videosPublicitarios.get(videoActual));
    }

    
    public int compareTo(Dispositivo otro) {
        return Double.compare(this.precio, otro.getPrecio());
    }
}