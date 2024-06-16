public class MemoriaPrincipal {
    private static int[] memoria;
    private int contadorDeMemoria;

    public MemoriaPrincipal(){
        memoria = new int[64];
        contadorDeMemoria = 0;
    }

    public void agregarAMemoria(int datoOInstrucción){
        memoria[contadorDeMemoria] = datoOInstrucción;
        contadorDeMemoria++;
    }

    public int obtenerElemento(int posición) {
        return memoria[posición];
    }

    public int getContador() {
    return contadorDeMemoria;
    }
}
