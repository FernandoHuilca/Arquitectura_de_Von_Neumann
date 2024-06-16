public class MemoriaPrincipal {
    private int[] datosInstrucciones;


    public MemoriaPrincipal(int tamañoDeMemoria){
        datosInstrucciones = new int[tamañoDeMemoria];

    }

    public void agregarDatoInstrucción(int dato, int dirreciónDeMemoria) {
        datosInstrucciones[dirreciónDeMemoria] = dato;
    }

    public int[] getArregloMemoria() {
        return datosInstrucciones;
    }
}
