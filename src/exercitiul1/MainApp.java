// 1. Se cere să se scrie un program Java care să calculeze şi să afişeze perimetru şi aria unui
// dreptunghi. Valorile pentru lungime şi lățime se citesc de la tastatura. Sa se adauge un break
// point pe prima linie care citește valoarea unei laturi si din acel punct să se ruleze programul
// linie cu linie urmărind valorile variabilelor în memorie.

package exercitiul1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("lungime: ");
        int lungime = sc.nextInt();
        System.out.println("latime: ");
        int latime = sc.nextInt();
        int arie = lungime * latime;
        int perimetru = lungime * 2 + latime * 2;
        System.out.println("perimetru: " + perimetru);
        System.out.println("arie: " + arie);
        sc.close();
    }
}
