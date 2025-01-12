// 2. Să se scrie un program care citește un set de numerele din fișierul de intrare in.txt, care
// conține câte un număr pe un rând, având valorile din figura 18. Programul va determină suma
// lor, media aritmetică, valoarea minimă, valoarea maximă, va afișa aceste valori pe ecran și le
// va scrie în fișierul de ieșire out.txt. Media aritmetică va fi afișată ca un număr real.

package exercitiul2;

import java.io.*;

public class MainApp {
    public static void main(String[] args) throws IOException {
        String nume_fisin = "in.txt";
        String nume_fisout = "out.txt";
        BufferedReader br = new BufferedReader(new FileReader(nume_fisin));
        BufferedWriter bw = new BufferedWriter(new FileWriter(nume_fisout));
        int[] vector = new int[6];
        int i = 0;
        String linie;
        while((linie = br.readLine()) != null){
            vector[i] = Integer.parseInt(linie);
            i++;
        }
        int s = 0;
        int min = 100;
        int max = 0;
        System.out.print("vectorul este: ");
        for(int j = 0; j < vector.length; j++){
            System.out.print(" "+vector[j]);
            s = s + vector[j];
            if(vector[j] < min)
            {min = vector[j];}
            if(vector[j] > max)
            {max = vector[j];}
        }
        System.out.println();
        System.out.println("suma numerelor: " + s);
        int ma = s / 6;
        System.out.println("media aritmetica: " + ma);
        System.out.println("minimul: " + min);
        System.out.println("maximul: " + max);
        bw.write("suma numerelor: " + s + "\n" + "media aritmetica: " + ma + "\n" + "minimul: " + min + "\n" + "maximul: " + max);
        br.close();
        bw.close();
    }
}

