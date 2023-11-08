import java.util.List;

public abstract class Dispositivo implements Controlable{
    protected boolean encendido;
    protected double volumen;
    protected double brillo;
    protected String informacion;
    protected String estadoActual;
    protected List<String> videosPublicitarios;
    protected String marca;
    protected String modelo;
    protected double precio;
    protected int cuotas;

    public Dispositivo(String marca, String modelo, double precio, int cuotas){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.cuotas = cuotas;
    }

    public double getPrecio() {
        return precio;
    }

    public String getModelo(){
        return modelo;
    }

    public String getMarca(){
        return marca;
    }
}