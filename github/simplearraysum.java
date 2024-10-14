package github;
import java.util.Scanner;

public class simplearraysum {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);  // Membuat objek Scanner untuk membaca input
        int n = sc.nextInt();  // Membaca ukuran array
        int[] arr = new int[n];  // Inisialisasi array dengan ukuran 'n'
        int sum = 0;  // Variabel untuk menyimpan jumlah total elemen
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // Membaca elemen array satu per satu
            sum += arr[i];  // Menambahkan elemen array ke dalam variabel sum
        }
        
        System.out.println(sum);  // Mencetak hasil penjumlahan
        */

        Scanner in = new Scanner(System.in);
        System.out.print("Input array size: ");
        int n = in.nextInt();
        int [] z = new int [n];
        int sum = 0;

        /*for(int i = 0 ; i < n ; i++){
            System.out.print("Input array " + (i + 1) + ": ");
            z[i] = in.nextInt();
            sum += z[i];
        }
        System.out.println("Result: "+sum);
        */

        int i = 0;
        while(i < n){
            System.out.print("Input array " + (i+1) + ": ");
            z[i] = in.nextInt();
            sum += z[i];
            i++;
        }
        System.out.println("Result: " + sum);
    }
}