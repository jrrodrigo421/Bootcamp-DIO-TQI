//  Inserir nome e idade em um loop 
// e encerrando o programa quando inserido 
// um caracter ou numero especifico

import java.util.Scanner;

    public class Exe1 {
        public static void main(String[] args) {
            try (Scanner scan = new Scanner(System.in)) {
                String nome;
                int idade;
                
                while(true) {
                System.out.println("nome");
                nome = scan.next();
                if (nome.equals("0")) break;
                System.out.println("idade");
                idade = scan.nextInt();
                System.out.println("A Idade inserida foi:  " + idade);
                System.out.println("Para encerrar digite 0");
                }
            }

            System.out.println("Bye Bye...");
        
        }
    }

