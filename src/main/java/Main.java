
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i, j, n, x, y, soma, aux;

        n = scanner.nextInt();

        for (i = 1; i <= n; i++) {

            x = scanner.nextInt();
            y = scanner.nextInt();

            soma = 0;

            if (x > y) {
                aux = x;
                x = y;
                y = aux;
            }

            for (j = x + 1; j < y; j++) {
                if (j % 2 != 0) {
                    soma = soma + j;
                }
            }

            System.out.println(soma);
        }

        scanner.close();
    }
}
