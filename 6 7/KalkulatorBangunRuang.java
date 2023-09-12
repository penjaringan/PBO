import java.util.Scanner;

public class KalkulatorBangunRuang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Selamat datang di Aplikasi Kalkulator Bangun Ruang!");
            System.out.println("Pilih bentuk geometri yang ingin dihitung luasnya:");
            System.out.println("1. Lingkaran");
            System.out.println("2. Segitiga");
            System.out.println("3. Persegi");
            System.out.println("4. Exit");
            System.out.print("Masukkan pilihan (1/2/3/4): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    hitungLuasLingkaran();
                    break;
                case 2:
                    hitungLuasSegitiga();
                    break;
                case 3:
                    hitungLuasPersegi();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan Aplikasi Kalkulator Bangun Ruang!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
                    break;
            }

            if (pilihan != 4) {
                try {
                    Thread.sleep(2000); // Jeda 2 detik sebelum kembali ke menu awal
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println();
        } while (pilihan != 4);

        scanner.close();
    }

    public static void hitungLuasLingkaran() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran (r): ");
        double jariJari = scanner.nextDouble();
        double luas = Math.PI * jariJari * jariJari;
        System.out.println("Luas lingkaran: \u03C0 x r x r = " + luas);        
    }

    public static void hitungLuasSegitiga() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan alas segitiga (a): ");
        double alas = scanner.nextDouble();
        System.out.print("Masukkan tinggi segitiga (t): ");
        double tinggi = scanner.nextDouble();
        double luas = 0.5 * alas * tinggi;
        System.out.println("Rumus Luas Segitiga : 0.5 x a x t = "+ luas);
    }

    public static void hitungLuasPersegi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sisi persegi (sisi): ");
        double sisi = scanner.nextDouble();
        double luas = sisi * sisi;
        System.out.println("Luas persegi: sisi x sisi" + luas);
    }

}
