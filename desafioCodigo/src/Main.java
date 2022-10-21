import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 500;
        var count = 0;

        // Dado um inteiro positivo num, retorne o número de inteiros positivos menor ou igual a num cuja soma de dígitos é par. A soma dos dígitos de um inteiro positivo é a soma de todos os seus dígitos.
        for (var i = 1; i <= num; i++) {
            var strNum = String.valueOf(i);
            if (strNum.length() == 1) {
                if (Integer.parseInt(strNum) % 2 == 0) {
                    count++;
                }
            } else {
                var sum = 0;
                for (var j = 0; j < strNum.length(); j++) {
                    sum += Integer.parseInt(String.valueOf(strNum.charAt(j)));
                }
                if (sum % 2 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count); 
    }
}
