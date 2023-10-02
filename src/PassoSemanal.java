public class PassoSemanal extends  Funcoes {

    private static int ContadorPassosSemanais;

    public PassoSemanal(String nome, int ContadorPassosSemanais) {
        super(nome);
        this.ContadorPassosSemanais = ContadorPassosSemanais;
    }

    public void adicionarPassos(int PassosSemanais) {

        ContadorPassosSemanais += PassosSemanais;
    }

    public static int getContadorPassosSemanais() {

        return ContadorPassosSemanais;
    }
}
