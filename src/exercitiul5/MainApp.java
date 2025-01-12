// 5. Să se scrie un program care generează aleatoriu un număr întreg cuprins între 0 și 20.
// Programul va determina dacă numărul aparține șirului lui Fobonacci.

package exercitiul5;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Random rand = new Random();
        int nr=rand.nextInt(19)+1;

        System.out.println("Nr: " + nr);

        int i = 1;
        int j = 0;
        int ver = 0;
        for(int a = 0; a <= 7; a++){
            int next = i + j;
            j = i;
            i = next;
            if(nr == next){
                System.out.println("Numarul face parte din sirul lui Fibonacci");
                ver = 1;
            }
        }
        if(ver == 0) {
            System.out.println("Numarul nu e in sirul lui Fibonacci");
        }
    }
}
