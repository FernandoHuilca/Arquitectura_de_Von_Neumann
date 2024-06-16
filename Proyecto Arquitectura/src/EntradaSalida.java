import javax.swing.*;

public class EntradaSalida {
    // Se pide al usuario dos datos con los cuales vamos a ejecutar las instruciones
    private int datoA;
    private int datoB;

    //Para simular el Bus del dispositivo
    private MemoriaPrincipal memoriaPrincipal;


    public EntradaSalida(MemoriaPrincipal memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;
    }

    public void recibirDatos() {
        datoA = Integer.parseInt(JOptionPane.showInputDialog(null, " Ingrese el primer número en base diez         "));
        datoB = Integer.parseInt(JOptionPane.showInputDialog(null, " Ingrese el segundo número en base diez       "));
        guardarEnMemoria();
    }

    private void guardarEnMemoria() {
        memoriaPrincipal.agregarDato(datoA, 0);
        memoriaPrincipal.agregarDato(datoB, 1);
    }

    public void imprimirMemoriaPrincipal() {
        memoriaPrincipal.imprimirDatos();
        memoriaPrincipal.imprimirInstrucciones();
        }

}
