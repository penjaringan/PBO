import java.util.Scanner;

public class cekbilanganprima {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        
        //terima input dari keyboard
        int angka = scanner.nextInt();

        //isPrime adalah method yang bertipe boolean yang digunakan untuk mengecek
        //apakah bilangan yang digunakan sebagai parameter merupakan bilangan prima
        //ceka angka apakah bilangan prima
        if (isPrime(angka)) {

            //jika true
            System.out.println("Bilangan tersebut adalah bilangan prima");
        } else {

            //jika false
            System.out.println("Bilangan tersebut bukan bilangan prima");
        }
    }

    public static boolean isPrime(int angka) {
        // jika angka lebih kecil atau sama dengan 1 maka angka salah
        // (tidak dihitung) sehingga bernilai false

        if (angka <= 1) {
            return false;
        }

        // Bilangan prima hanya bisa dibagi oleh 1 dan dirinya sendiri,

        // cek pembagi dari 2 sampai akar kuadrat dari bilangan tersebut.
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }

        return true;
    }
}
