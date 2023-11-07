public class Computadora extends Dispositivo {
    private int memoriaRAM;
    private String discoDuro;
    private double velocidadCPU;
    private double velocidadGPU;
    
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
}
