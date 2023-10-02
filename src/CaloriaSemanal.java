public class CaloriaSemanal extends Funcoes {

 private static int ContadorcaloriaSemanal;

 public CaloriaSemanal(String nome, int ContadorcaloriaSemanal) {
  super(nome);
  this.ContadorcaloriaSemanal = ContadorcaloriaSemanal;
 }

 public void adicionarCaloriaSemanal(int ContadorcaloriaSemanal) {
  ContadorcaloriaSemanal += ContadorcaloriaSemanal;
 }


 public static int getContadorcaloriaSemanal() {
  return ContadorcaloriaSemanal;
 }
}






