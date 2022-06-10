import java.util.Scanner;

// Insira 5 numeros e o programa lhe dira no final qual
// o maior e a media entre eles;

public class Exe3 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numero;
            int maior = 0;
            int soma = 0;



            int count = 0;
            do {
                System.out.println("Numero: ");
                numero = scan.nextInt();
                soma = soma + numero;
                // System.out.println( "Soma" + soma);


                if (numero > maior) maior = numero;
                ++count;
                // System.out.println( "Numero Maior" + maior);

            }while(count < 5);

            System.out.println( "Maior Numero Inserido: " + maior);
            System.out.println( "Média: " + soma/5);
        }

    }
}
