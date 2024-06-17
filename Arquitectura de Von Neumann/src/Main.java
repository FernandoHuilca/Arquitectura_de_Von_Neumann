// Author: Fernando Huilca, Jeremy Jimenez, Jhordy Parra y Juan Cofre
// Date: 16/06/2024
public class Main {
    public static void main(String[] args) {
        MemoriaPrincipal memoriaPrincipal = new MemoriaPrincipal(500);
        CPU cpu = new CPU(memoriaPrincipal);
        EntradaSalida entradaSalida = new EntradaSalida(memoriaPrincipal);

        entradaSalida.recibirDatos();
        entradaSalida.imprimirMemoriaPrincipal();

        cpu.ejecutarInstrucciones(250);


    }
}