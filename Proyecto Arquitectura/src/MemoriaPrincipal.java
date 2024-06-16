import javax.swing.*;

public class MemoriaPrincipal {
    private int[] datosInstrucciones;
    private int inicioDelEspacioParaInstrucciones;
    private int contadorDeDatos;
    private int contadorDeInstrucciones;

    public MemoriaPrincipal(int tamañoDeMemoria) {
        datosInstrucciones = new int[tamañoDeMemoria];
        contadorDeDatos = 0;
        contadorDeInstrucciones = 0;
        inicioDelEspacioParaInstrucciones = mitadDeLaMemoria(tamañoDeMemoria);
        // Asignamos valores en las instrucciones
        datosInstrucciones[inicioDelEspacioParaInstrucciones + (contadorDeInstrucciones++)] = 1000;   // 1)
        datosInstrucciones[inicioDelEspacioParaInstrucciones + (contadorDeInstrucciones++)] = 2001;  // 2)
        datosInstrucciones[inicioDelEspacioParaInstrucciones + (contadorDeInstrucciones++)] = 3001;  // 3)
        datosInstrucciones[inicioDelEspacioParaInstrucciones + (contadorDeInstrucciones++)] = 4001;  // 4)
        datosInstrucciones[inicioDelEspacioParaInstrucciones + (contadorDeInstrucciones++)] = 2001;  // 5)
        datosInstrucciones[inicioDelEspacioParaInstrucciones + (contadorDeInstrucciones++)] = 5000;  // 6)

    }


    public void agregarDato(int dato, int direcciónDeMemoria) {
        datosInstrucciones[direcciónDeMemoria] = dato;
        contadorDeDatos++;
    }
    public void sobreEscribirDato(int dato, int direcciónDeMemoria) {
        datosInstrucciones[direcciónDeMemoria] = dato;
    }
    public void agregarInstrucción(int instrucción, int direcciónDeMemoria) {
        datosInstrucciones[direcciónDeMemoria] = instrucción;
        contadorDeInstrucciones++;
    }


    //_____________________ Métodos auxiliares / menos importantes ____________________________

    private static int mitadDeLaMemoria(int tamañoDeMemoria) {
        return tamañoDeMemoria / 2;
    }
    public int obtenerElemento(int posición) {
        return datosInstrucciones[posición];
    }


    public void imprimirDatos() {
        String salida = "   Dirección    |    Dato   \n";
        for (int i = 0; i < contadorDeDatos; i++) {
            salida += "       " + i + "               |       " + datosInstrucciones[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, "Los datos en memoria son: \n" + salida);

    }

    public void imprimirInstrucciones() {
        String salida = "   Dirección    |    Instrucción   \n";
        for (int i = 0; i < contadorDeInstrucciones; i++) {
            salida += "       "+ (inicioDelEspacioParaInstrucciones + i)
                    + "           |        " + datosInstrucciones[inicioDelEspacioParaInstrucciones + i] + "\n";
        }
        JOptionPane.showMessageDialog(null, "Las instrucciones en memoria son: \n" + salida);

    }

    public void agregarDatoEnSiguienteEspacio(int dato) {
        datosInstrucciones[contadorDeDatos] = dato;
        contadorDeDatos++;
    }

    public int obtenerResultado() {
        return datosInstrucciones[contadorDeDatos-1];
    }
}
