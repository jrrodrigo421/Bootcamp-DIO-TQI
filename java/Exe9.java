import java.util.Random;

import javax.swing.BoundedRangeModel;

// programa que le 20 numeos inteiros aleatorios entre 0 a 100
// Armazena no vetor e no final imprime seus sucessores


public class Exe9 {
    public static void main(String[] args) {
        Random random = new Random(); 
            int [] numerosaleatorios = new int[20];
            for (int i = 0; i < numerosaleatorios.length; i++ ) {
                int numero = random.nextInt(100);
                numerosaleatorios[i] = numero;

            }
            System.out.println("Numeros Aleatorios: ");
            for (int numero : numerosaleatorios) {
                System.out.println(numero + " ");
                
            }
            System.out.println("Sucessores dos Numeros Aleatorios: ");
            for (int numero : numerosaleatorios) {
                System.out.println((numero +1) + " ");
                
            }
    }
}
