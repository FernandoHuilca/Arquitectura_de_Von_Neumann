// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MemoriaPrincipal memoriaPrincipal = new MemoriaPrincipal(64);
        CPU cpu = new CPU(memoriaPrincipal);
        memoriaPrincipal.agregarDatoInstrucción(13 , 1);
        memoriaPrincipal.agregarDatoInstrucción(54 , 2);
        memoriaPrincipal.agregarDatoInstrucción(24, 3);
        memoriaPrincipal.agregarDatoInstrucción(03, 4);
        memoriaPrincipal.agregarDatoInstrucción(02, 5);
        cpu.ejecutarInstrucción(1);
    }
}