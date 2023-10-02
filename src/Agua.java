public class Agua {

    private int quantidade ;                          // Atributo privado para rastrear a quantidade de água consumida

    public Agua(int quantidade) {                    // Construtor que inicializa a quantidade de água como zero
        this.quantidade = quantidade;
    }
    public void beber (int quantidade) {              // Método para registrar o consumo de água

        this.quantidade += quantidade;
    }

    public int getQuantidadeConsumida() {           // Método para obter a quantidade total de água consumida
        return quantidade;
    }


}
