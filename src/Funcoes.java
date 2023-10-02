public class Funcoes {
    private String nome;                          // Atributo privado para armazenar o nome

    private Agua agua ;                            // atributo privado par armazenar a quantidade de agua

    public Funcoes(String nome) {                 // Construtor da classe Funcoes
        this.nome = nome;                        // Inicializa o atributo 'nome' com o valor fornecido
        this.agua = new Agua(0);       // Inicializa a instância de Agua com quantidade inicial zero
    }
    public void beberAgua(int quantidade) {
        agua.beber(quantidade);                 // Método para registrar o consumo de água na instância de Agua
    }

    public int getQuantidadeAguaConsumida() {
        return agua.getQuantidadeConsumida();  // Método para obter a quantidade total de água consumida da instância de Agua
    }





    public String getNome() {                    // Método público para obter o nome fora do private
        return nome;                             // Retorna o valor atual do atributo 'nome'
    }

}