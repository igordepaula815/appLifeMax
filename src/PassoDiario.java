public class PassoDiario extends Funcoes{


    private static int ContadorPassosDiarios;                 // Atributo estático para rastrear o contador de passos diários

    public PassoDiario(String nome, int passosDiarios) {      // Construtor da classe PassoDiario
        super(nome);                                          // Chama o construtor da classe Funcoes com o nome
        this.ContadorPassosDiarios = passosDiarios;           // Inicializa o contador de passos diários com o valor fornecido
    }

    public void adicionarPassos(int PassosDiarios) {               // Método para adicionar passos ao contador de passos diários
        ContadorPassosDiarios += PassosDiarios;                    // Incrementa o contador com o número de passos fornecido
    }

    public static int getContadorPassos() {                 // Método estático para obter o contador de passos diários
        return ContadorPassosDiarios;                       /// Retorna o valor atual do contador de passos diários
    }
}
