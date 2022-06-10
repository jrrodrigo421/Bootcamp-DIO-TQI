import java.util.Scanner;

// import javax.management.openmbean.TabularData;

// Gerador de tabuada


public class Exe5 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Tabuada:  ");
            int tabuada = scan.nextInt();

            System.out.println("TABUADA de " + tabuada + "\n");

            for(int i = 1; i<=10 ; i++ ) {

                System.out.println(tabuada + " X " + i + " = " + (tabuada * i));

            }
        }
    }
}