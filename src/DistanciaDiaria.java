public class DistanciaDiaria extends Funcoes{

    private static int ContadorDistanciaDiaria;                 // Atributo estático para rastrear o contador de passos diários

    public DistanciaDiaria(String nome, int contadorDistanciaDiaria) {      // Construtor da classe PassoDiario
        super(nome);                                                       // Chama o construtor da classe Funcoes com o nome
        this.ContadorDistanciaDiaria = contadorDistanciaDiaria;           // Inicializa o contador de passos diários com o valor fornecido
    }

    public void adicionarDistancia(int DistanciaDiaria) {               // Método para adicionar passos ao contador de passos diários
        ContadorDistanciaDiaria += DistanciaDiaria;                    // Incrementa o contador com o número de passos fornecido
    }

    public static int getContadorPassos() {                 // Método estático para obter o contador de passos diários
        return ContadorDistanciaDiaria;                       /// Retorna o valor atual do contador de passos diários
    }
}











