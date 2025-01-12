// 3. Să se scrie un program care citește un număr n natural de la tastatură și afișează toți
// divizorii acestuia pe ecran. Dacă numărul este prim se va afișa un mesaj corespunzător.

package exercitiul3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Numarul: ");
        int n = s.nextInt();

        boolean estePrim = true;

        System.out.print("Divizori: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != 1 && i != n) {
                    estePrim = false;
                }
            }
        }
        if (estePrim && n > 1) {
            System.out.println("\n Numarul " + n + " este prim.");
        } else if (n > 1) {
            System.out.println("\n Numarul " + n + " nu este prim.");
        } else {
            System.out.println("\n Numarul " + n + " nu este considerat prim sau compus.");
        }
    }
}

