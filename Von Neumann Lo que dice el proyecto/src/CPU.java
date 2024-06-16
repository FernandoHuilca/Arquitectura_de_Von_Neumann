public class CPU {
    private MemoriaPrincipal memoriaPrincipal;
    private int PC = 0;
    private int AC = 0;
    private int IR = 0;

    public CPU(MemoriaPrincipal memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;

    }

    public void ejecutarInstrucción(int dirrecionDeMemoria) {
        imprimirdatos();
        PC = dirrecionDeMemoria;
        IR = memoriaPrincipal.getArregloMemoria()[dirrecionDeMemoria];
        imprimirdatos();
        if (IR == 13){
            AC = memoriaPrincipal.getArregloMemoria()[3];
            imprimirArreglo();
        }
        imprimirdatos();
    }

    private void imprimirArreglo() {
        for (int i = 0 ; i < 5 ; i ++){
            System.out.println(memoriaPrincipal.getArregloMemoria()[i]);
        }

    }
    public void imprimirdatos(){
        System.out.println( "PC:" + PC+ " AC:" + AC + " IR: " + IR);
    }
}
