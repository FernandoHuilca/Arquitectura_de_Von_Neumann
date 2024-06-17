public class UnidadDeControl {
    public boolean seAcabóInstrucciones(int instrucción) {
        return instrucción == 6000;
    }

    public int devolverInstrución(int datoDeMemoria) {
        return datoDeMemoria/1000; //2001 / 1000 en enteros = 2 esta es la instrucción
    }

    public int devolverDirecciónMemoria(int datoDeMemoria) {
        return datoDeMemoria % 1000; //2001 % 1000 = 001
    }
}
