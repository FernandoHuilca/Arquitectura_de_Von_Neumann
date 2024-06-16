public class CPU {

    private int A;
    private int B;
    private int C;

    private UnidadDeControl unidadDeControl;
    private ALU alu;

    public CPU () {
        A = 0;
        B = 0;
        C = 0;
        unidadDeControl = new UnidadDeControl();
        alu = new ALU();
    }
}
