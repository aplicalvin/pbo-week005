// Program Mencetak deret angka sebanyak - N
package week005;
import java.util.Scanner;

public class LatihanA02 {
    // Membuat sebuah prosedural untuk cetak 
    public static void cetak(int bilangan,int limit) {
        for (int i = 1; i <= bilangan; i++) {
            System.out.print(i + " ");

            if (i % limit == 0) {
                System.out.println("");
            }
        }   
    }

    public static void main(String args[]) {
        Scanner masukan = new Scanner(System.in);
        int bilangan; // Variabel ini untuk menampung 
                     // total bilangan yang dicetak
        int limit = 5; // Variabel ini untuk menampung
                      // Limit setiap baris.

        System.out.print("Bilangan : "); // input baris
        bilangan = masukan.nextInt();

        // Looping untuk limit (samping)
        cetak(bilangan, limit); // panggil void cetak 

        System.out.println("------------------");

        // Kali ini limit ditentukan pengguna
        System.out.print("Dipecah : ");
        limit = masukan.nextInt(); 

        // Looping untuk limit (samping)
        cetak(bilangan, limit);
    }
}