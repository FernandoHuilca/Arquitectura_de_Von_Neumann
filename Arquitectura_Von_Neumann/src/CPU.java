public class CPU {

    private int PC;
    private int AC;
    private int RI;

    private UnidadDeControl unidadDeControl;
    private ALU alu;

    public CPU () {
        PC = 0;
        AC = 0;
        RI = 0;
        unidadDeControl = new UnidadDeControl();
        alu = new ALU();
    }

}
