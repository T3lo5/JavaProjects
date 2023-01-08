import java.util.Scanner;
public class Pares {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int quantidadePares = 0;

        for (int i = 0; i < 5; i++) {
            int n = scan.nextInt();

            if (  n % 2 == 0   ) {
                quantidadePares++;
            }
        }
        System.out.printf("%d valores pares\n", quantidadePares);
    }
}
