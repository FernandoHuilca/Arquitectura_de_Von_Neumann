import javax.swing.*;

public class CPU {

    // los tres Registros:
    private int PC; // Tiene la dirección siguiente a ejecutarse como instrucción
    private int AC; // Guarda algún dato
    private int AC2; // Guarda algún dato
    private int RI; // Tiene la instrucción a ejecutarse
    //La unidad de control:
    private UnidadDeControl unidadDeControl;
    // La unidad aritmética lógica:
    private ALU alu;
    private ALU2 alu2;


    // Conexión a memoria simulando el bus del Sistema:
    private MemoriaPrincipal memoriaPrincipal;



    public CPU(MemoriaPrincipal memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;
        unidadDeControl = new UnidadDeControl();
        alu = new ALU();
        alu2 = new ALU2();
        PC = 0;
        AC = 0;
        AC2 = 0;
        RI = 0;
    }

    public void ejecutarInstrucciones(int direcciónDeMemoria) {
        PC = direcciónDeMemoria;
        AC = 0;
        AC2 = 0;
        RI = memoriaPrincipal.obtenerElemento(PC);

       
        boolean acabóLasInstrucciones = unidadDeControl.seAcabóInstrucciones(RI);
        do {
            imprimirRegistros();
            switch (unidadDeControl.devolverInstrución(RI)){
                case 1:
                    asignarValoraAC();
                    break;
                case 2:
                    sumarValorACGuardaEnAC();
                    break;
                case 3:
                    duplicarValorGuardarEnValor();
                    break;
                case 4:
                    restarValorAACGuardarEnAC2();
                    break;
                case 5:
                    multiplicarACporAC2GuardarZ();
                    break;
                case 0:
                    acabóLasInstrucciones = true;
                    JOptionPane.showMessageDialog(null, "    EL RESULTADO DE LA OPERACIÓN ES:    \n"
                                                                        + "                            " + memoriaPrincipal.obtenerResultado() +"\n         " +
                                                                            "       Fin del programa \n\n");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ERROR DESCONOCIDO!! :0 ");
                    break;
            }
            PC++;
            RI = memoriaPrincipal.obtenerElemento(PC);
            System.out.println(RI + "\n");


        }while (!acabóLasInstrucciones);

    }



    private void imprimirRegistros() {
        String salida = "                              PC :             " + PC + "\n"
                      + "                              AC :             " + AC + "\n"
                      + "                              AC2:            " + AC2 + "\n"
                      + "                              RI :              " + RI + "\n";
        JOptionPane.showMessageDialog(null, "_______ Los datos en Registros dentro del CPU _______ \n\n" + salida);

    }

    //------------------ Extractos --------------------------
    private void multiplicarACporAC2GuardarZ() {
        memoriaPrincipal.agregarDatoEnSiguienteEspacio(AC * AC2);
        memoriaPrincipal.imprimirDatos();
    }

    private void restarValorAACGuardarEnAC2() {
        AC2 = alu.restar(AC, memoriaPrincipal.obtenerElemento(unidadDeControl.devolverDirecciónMemoria(RI)));
    }

    private void duplicarValorGuardarEnValor() {
        memoriaPrincipal.sobreEscribirDato(alu.multiplicar(2, memoriaPrincipal.obtenerElemento(unidadDeControl.devolverDirecciónMemoria(RI))),unidadDeControl.devolverDirecciónMemoria(RI));
        memoriaPrincipal.imprimirDatos();
    }

    private void sumarValorACGuardaEnAC() {
        //AC += memoriaPrincipal.obtenerElemento(unidadDeControl.devolverDirecciónMemoria(RI));
        AC = alu.sumar(AC,memoriaPrincipal.obtenerElemento(unidadDeControl.devolverDirecciónMemoria(RI)));
    }

    private void asignarValoraAC() {
        AC = memoriaPrincipal.obtenerElemento(unidadDeControl.devolverDirecciónMemoria(RI));
    }
}
