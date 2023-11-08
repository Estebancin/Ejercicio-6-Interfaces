import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Por favor, selecciona una opción:");
            System.out.println("1. Seleccionar dispositivo");
            System.out.println("2. Mostrar estado actual del dispositivo seleccionado");
            System.out.println("3. Visualizar el dispositivo más caro y más barato");
            System.out.println("4. Subir volumen del dispositivo seleccionado");
            System.out.println("5. Bajar volumen del dispositivo seleccionado");
            System.out.println("6. Aumentar brillo del dispositivo seleccionado");
            System.out.println("7. Disminuir brillo del dispositivo seleccionado");
            System.out.println("8. Reproducir video en el dispositivo seleccionado");
            System.out.println("9. Pausar video en el dispositivo seleccionado");
            System.out.println("10. Parar video en el dispositivo seleccionado");
            System.out.println("11. Cambiar video en el dispositivo seleccionado");
            System.out.println("12. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Por favor, introduce el índice del dispositivo que quieres seleccionar:");
                    int indice = scanner.nextInt();
                    controlador.seleccionarDispositivo(indice);
                    break;
                case 2:
                    controlador.mostrarEstadoActual();
                    break;
                case 3:
                    controlador.visualizarDispositivoMasCaroYMasBarato();
                    break;
                case 4:
                    controlador.getDispositivoSeleccionado().subirVolumen();
                    break;
                case 5:
                    controlador.getDispositivoSeleccionado().bajarVolumen();
                    break;
                case 6:
                    controlador.getDispositivoSeleccionado().aumentarBrillo();
                    break;
                case 7:
                    controlador.getDispositivoSeleccionado().disminuirBrillo();
                    break;
                case 8:
                    controlador.getDispositivoSeleccionado().reproducirVideo();
                    break;
                case 9:
                    controlador.getDispositivoSeleccionado().pausarVideo();
                    break;
                case 10:
                    controlador.getDispositivoSeleccionado().pararVideo();
                    break;
                case 11:
                    controlador.getDispositivoSeleccionado().cambiarVideo();
                    break;
                case 12:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        }
    }
}

