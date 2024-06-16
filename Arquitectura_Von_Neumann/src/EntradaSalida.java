import javax.swing.*;

public class EntradaSalida {
    private int datoA;
    private int datoB;
    private int instrucciónARealizar;
    private MemoriaPrincipal memoriaPrincipal;

    public EntradaSalida() {
        memoriaPrincipal = new MemoriaPrincipal();
    }

    public void recibirDatosYOperación() {
        datoA = Integer.parseInt(JOptionPane.showInputDialog(null, " Ingrese el primer número en base diez "));
        datoB = Integer.parseInt(JOptionPane.showInputDialog(null, " Ingrese el segundo número en base diez "));
        instrucciónARealizar = Integer.parseInt(JOptionPane.showInputDialog(null,
                "   __________________ MENÚ DE INSTRUCCIONES __________________  \n\n" +
                        "                             1. Sumar.       \n" +
                        "                             2. Multiplicar por Booth.        \n" +
                        "                             3. Potencia.                       \n\n"));
        System.out.println(datoA + " " + datoB + " " + instrucciónARealizar);
        guardarEnMemoria();
    }

    private void guardarEnMemoria() {
        memoriaPrincipal.agregarAMemoria(datoA);
        memoriaPrincipal.agregarAMemoria(datoB);
        memoriaPrincipal.agregarAMemoria(instrucciónARealizar);
    }

    public void imprimirMemoriaPrincipal() {
        String salida = "";
        for (int i = 0; i < memoriaPrincipal.getContador(); i++) {
            salida += memoriaPrincipal.obtenerElemento(i) + " ";
        }
        JOptionPane.showMessageDialog(null, "Los elementos en memoria son: " + salida + ".");
    }
}
