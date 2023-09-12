import java.util.InputMismatchException;
import java.util.Scanner;

class Nomor {
    private double nomor1;
    private double nomor2;

    public Nomor(double nomor1, double nomor2) {
        this.nomor1 = nomor1;
        this.nomor2 = nomor2;
    }

    public double getnomor1() {
        return nomor1;
    }

    public double getnomor2() {
        return nomor2;
    }

    public double tambah() {
        return nomor1 + nomor2;
    }

    public double kurang() {
        return nomor1 - nomor2;
    }

    public double kali() {
        return nomor1 * nomor2;
    }

    public double bagi() {
        if (nomor2 == 0) {
            throw new ArithmeticException("Tidak bisa dibagi dengan angka nol (0) !");
        }
        return nomor1 / nomor2;
    }
}

public class Kalkulator2Bilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program kalkulator sederhana!");

        double nomor1 = 0;
        double nomor2 = 0;
        boolean validInput = false;

        // Meminta input angka pertama
        while (!validInput) {
            try {
                System.out.print("Masukkan angka pertama lalu tekan enter: ");
                nomor1 = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Harus angka.");
                scanner.nextLine(); // Membersihkan buffer input
            }
        }

        validInput = false; // Reset validInput sebelum meminta input kedua

        // Meminta input angka kedua
        while (!validInput) {
            try {
                System.out.print("Masukkan angka kedua lalu tekan enter: ");
                nomor2 = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Harus Angka.");
                scanner.nextLine(); // Membersihkan buffer input
            }
        }

        Nomor numbers = new Nomor(nomor1, nomor2);

        System.out.println("\nHasil:");
        System.out.println("Penjumlahan: " + numbers.tambah());
        System.out.println("Pengurangan: " + numbers.kurang());
        System.out.println("Perkalian: " + numbers.kali());
        try {
            System.out.println("Pembagian: " + numbers.bagi());
        } catch (ArithmeticException e) {
            System.out.println("Pembagian: " + e.getMessage());
        }

        scanner.close();
    }
}
