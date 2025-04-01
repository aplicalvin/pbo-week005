// Program Menghitung Faktorial
package week005;
import java.util.Scanner;

public class LatihanA01 {
    public static void main(String args[]) {
        // membuat object inputan untuk handle input
        Scanner inputan = new Scanner(System.in);
        int angka;  // Variabel untuk menampung angka yang mau di faktorialkan
        int hasil = 1; // Variabel untuk menampung hasil sementara (kepakai di loop)

        // Output awal
        System.out.print("Bilangan : ");
        angka = inputan.nextInt(); // input dari user di assignment ke variabel angka

        // Looping utk mencetak. 
        for (int i = 1; i < angka; i++) { 
            hasil *= (i + 1); // update variabel hasil 
            System.out.println(i + " x " + (i + 1) + " = " + hasil); // cetak akhir
        }

    }
}