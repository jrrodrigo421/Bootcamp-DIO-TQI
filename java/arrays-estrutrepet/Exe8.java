import java.util.Scanner;

// import javax.annotation.processing.SupportedOptions;

// Programa que le um array e imprime as consoantes

public class Exe8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] consoantes = new String[6];
        int quantConsoantes = 0; 

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if (! (letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u") )) {
                consoantes[count] = letra;
                quantConsoantes++;


                }
                count++;
    
        } while(count < consoantes.length);
        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null)
                System.out.print(consoante + " ");

        }
        System.out.println("Quantidade de Consoantes: " + quantConsoantes);
    }
}
