public class CaloriaDiaria extends Funcoes {

     private static int CaloriaDiaria;


     public CaloriaDiaria(String nome, int caloriaDiaria) {
          super(nome);
          this.CaloriaDiaria = caloriaDiaria;
     }

     public  void adicionarCaloriaDiaria(int ContadorCaloriaDiaria) {
          ContadorCaloriaDiaria += ContadorCaloriaDiaria;
     }
     public static int getCaloriaDiaria() {
          return CaloriaDiaria;
     }
}







