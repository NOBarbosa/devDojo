package academy.devdojo.maratonajava.introducao;

public class Loops {
    public static void main(String[] args) {

       byte limite = 8;
       byte cont =0;
//       while (cont < limite){
//           System.out.println("rodando");
//           cont +=1;
//       }do {
//            System.out.println("rodando intependente da condição do while");
//        }while (cont < 2);

        int[] declarandoValorDoVetor = {1,2,3,4};

        for (int i = 0; i < declarandoValorDoVetor.length; i++) {
            System.out.println("iterou " + i);
        }
        for(int num: declarandoValorDoVetor){
            System.out.println("FOREACH");
            System.out.println(num);
        }
        int[] vetor = new int[5];

        for(int i =0; i < vetor.length; i++){
            vetor[i] = i;
            System.out.println(vetor[i]);

        }

    }


}
