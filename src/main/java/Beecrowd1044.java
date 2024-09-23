import java.util.Scanner;

public class Beecrowd1044 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
        int A, B;
        String sequencia;
        String[] partes;

        //ler a sequência
        sequencia = leitor.nextLine();
        partes = sequencia.split(" ");

        //atribuir valores às variáveis
        A = Integer.parseInt(partes[0]);
        B = Integer.parseInt(partes[1]);

        //verificar os valores e mostrar resultado no console
        if (Math.max(A, B) % Math.min(A, B) == 0) {
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }
    }
}
