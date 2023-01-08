import java.util.Scanner;
public class Batmain {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        int viloesCapturados = 0;
        while(viloesCapturados < T) {
            String vilao = scan.next();

            System.out.println("Y");
            viloesCapturados++;
        }
    }
}
