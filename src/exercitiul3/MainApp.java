// 3. Să se insereze într-o anumită poziție a unui șir de caractere, un alt șir. Datele vor fi
// preluate de la tastatură sau din fișier. Să se șteargă o porțiune a unui șir de caractere care
// începe dintr-o anumită poziție și are un anumit număr de caractere. Se recomandă utilizarea
// clasei StringBuilder.

package exercitiul3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sirul: ");
        String s = sc.nextLine();
        System.out.print("Subsirul: ");
        String sub = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder(s);
        System.out.print("Pozitia: ");
        int i = sc.nextInt();
        stringBuilder.insert(i,sub);
        System.out.println(stringBuilder.toString());
    }
}
