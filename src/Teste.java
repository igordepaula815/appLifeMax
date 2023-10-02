public class Teste {

    public static void main(String[] args) {

        //Cria uma instância com um nome e um valor inicial
        PassoDiario passoDiario = new PassoDiario("Passos Diários", 5000);
        PassoSemanal passoSemanal = new PassoSemanal("Passos Semanais" , 7000);
        CaloriaDiaria caloriaDiaria = new CaloriaDiaria("Calorias Diarias", 4000);
        CaloriaSemanal caloriaSemanal = new CaloriaSemanal("Calorias Semanais" , 10000);
        DistanciaDiaria distanciaDiaria = new DistanciaDiaria("Distancia Diaria",2000);
        DistanciaSemanal distanciaSemanal = new DistanciaSemanal("Distancia Semanal",2000);
        Funcoes funcao1 = new Funcoes("Função 1");  // Cria uma instância da classe Funcoes com nome "Função 1"

        // Adiciona passos às instâncias de PassoDiario e PassoSemanal
        passoDiario.adicionarPassos( 1000);
        passoSemanal.adicionarPassos(2000);
        caloriaDiaria.adicionarCaloriaDiaria(60000);
        caloriaSemanal.adicionarCaloriaSemanal(80000);
        distanciaDiaria.adicionarDistancia(3500);
        distanciaSemanal.getContadorDistanciaSemanal(8000);
        funcao1.beberAgua(300); // Função 1 consome 300 ml de água

        // Obtém o contador de passos da instância
        int contador = PassoDiario.getContadorPassos();
        int contadorSemanal = PassoSemanal.getContadorPassosSemanais();
        int caloriaDiaria1 =  CaloriaDiaria.getCaloriaDiaria();
        int contadorcaloriaSemanal = CaloriaSemanal.getContadorcaloriaSemanal();
        int contadorDistanciaDiaria = DistanciaDiaria.getContadorPassos();
        int quantidadeConsumida1 = funcao1.getQuantidadeAguaConsumida();  // Obtém a quantidade total de água consumida pela Função 1

        System.out.println("Contador de Passos Diários:   "  + contador);
        System.out.println("Contador de Passsos Semanais  "  + contadorSemanal);
        System.out.println("contador de calorias Diarias  "  + caloriaDiaria1);
        System.out.println("Contador de calorias Semanais "  + contadorcaloriaSemanal);
        System.out.println("Contador de distancia "          + contadorDistanciaDiaria);
        System.out.println("Quantidade de água consumida pela Função 1: " + quantidadeConsumida1 + " ml");
    }
}




