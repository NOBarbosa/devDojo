package academy.devdojo.maratonajava.introducao;

public class ExercicioTiposPrimitivos {
    public static void main(String[] args) {
        String nome = "Nat";
        String endereco = "Home office";
        double salario = 4100.00;
        String data = "05/05/2024";
        String relatorio  ="Eu " + nome+", morando no endereço " + endereco + " confirmo que recebi o salario de R$" + salario+ " na data "+ data;
        System.out.println(relatorio);
        double num1 = 13;
        double num2 = 4;

        System.out.println(num1 % num2);
    }
}
