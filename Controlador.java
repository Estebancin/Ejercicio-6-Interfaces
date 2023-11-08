import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Controlador {
    private List<Dispositivo> dispositivos;
    private Dispositivo dispositivoSeleccionado;

    public Controlador() {
        this.dispositivos = new ArrayList<>();
        cargarDatos();
    }

    public void cargarDatos() {
        try (BufferedReader br = new BufferedReader(new FileReader("dispositivos.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                if (campos[0].equals("Telefono")) {
                    dispositivos.add(new Telefono(campos[1], campos[2], Double.parseDouble(campos[3]), Integer.parseInt(campos[4]), Integer.parseInt(campos[5]), campos[6], Integer.parseInt(campos[7]), Boolean.parseBoolean(campos[8]), Boolean.parseBoolean(campos[9]), Boolean.parseBoolean(campos[10])));
                } else if (campos[0].equals("Computadora")) {
                    double velocidadCPU = campos[7].equals("NA") ? 0.0 : Double.parseDouble(campos[7]);
                    double velocidadGPU = campos[8].equals("NA") ? 0.0 : Double.parseDouble(campos[8]);
                    dispositivos.add(new Computadora(campos[1], campos[2], Double.parseDouble(campos[3]), Integer.parseInt(campos[4]), Integer.parseInt(campos[5]), campos[6], velocidadCPU, velocidadGPU));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    

    public void seleccionarDispositivo(int indice) {
        if (indice >= 0 && indice < dispositivos.size()) {
            dispositivoSeleccionado = dispositivos.get(indice);
        } else {
            System.out.println("Índice de dispositivo inválido.");
        }
    }

    public void mostrarEstadoActual() {
        if (dispositivoSeleccionado != null) {
            dispositivoSeleccionado.mostrarEstadoActual();
        } else {
            System.out.println("No se ha seleccionado ningún dispositivo.");
        }
    }

    public void visualizarDispositivoMasCaroYMasBarato() {
        Dispositivo masCaro = Collections.max(dispositivos, Comparator.comparing(Dispositivo::getPrecio));
        Dispositivo masBarato = Collections.min(dispositivos, Comparator.comparing(Dispositivo::getPrecio));

        System.out.println("El dispositivo más caro es: " + masCaro.getMarca() + " " + masCaro.getModelo() + " con un precio de " + masCaro.getPrecio());
        System.out.println("El dispositivo más barato es: " + masBarato.getMarca() + " " + masBarato.getModelo() + " con un precio de " + masBarato.getPrecio());
    }

    public Dispositivo getDispositivoSeleccionado() {
        return dispositivoSeleccionado;
    }
}
