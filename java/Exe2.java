// Escolha um valor entre 0 e 10

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int nota;
            System.out.println("Nota:");
            nota = scan.nextInt();

            while(nota < 0 | nota > 10) {
                System.out.println("nota ivalida! Digite novamente");
                nota = scan.nextInt();
            }
        }
    }
}
