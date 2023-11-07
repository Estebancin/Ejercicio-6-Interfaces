public class Telefono extends Dispositivo{
    private int memoriaRAM;
    private String procesador;
    private int almacenamientoInterno;
    private boolean extiendeMemoria;
    private boolean incluyeCuboCargador;
    private boolean es5G;

    public void encender() {
        this.encendido = true;
    }

    @Override
    public void apagar() {
        this.encendido = false;
    }

    @Override
    public void subirVolumen() {
        this.volumen += 2;
        if (this.volumen > 100) {
            this.volumen = 100;
        }
    }

    @Override
    public void bajarVolumen() {
        this.volumen -= 2;
        if (this.volumen < 0) {
            this.volumen = 0;
        }
    }

    @Override
    public void aumentarBrillo() {
        this.brillo += 3;
        if (this.brillo > 100) {
            this.brillo = 100;
        }
    }

    @Override
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
        // Implementar lógica para reproducir video
    }

    public void pausarVideo() {
        // Implementar lógica para pausar video
    }

    public void pararVideo() {
        // Implementar lógica para parar video
    }

    public void cambiarVideo() {
        // Implementar lógica para cambiar video
    }
}
