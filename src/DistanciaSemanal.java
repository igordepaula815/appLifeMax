public class DistanciaSemanal extends Funcoes{

    private int ContadorDistanciaSemanal;

        public DistanciaSemanal(String nome , int contadorDistanciaSemanal) {
        super(nome);
        this.ContadorDistanciaSemanal = contadorDistanciaSemanal;
        }




    public void adicicionarDistanciaSemanal( int contadorDistanciaSemanal) {
                     ContadorDistanciaSemanal += contadorDistanciaSemanal;
        }
        public int getContadorDistanciaSemanal(int ContadorSemanal) {
        return ContadorDistanciaSemanal;
    }
}

