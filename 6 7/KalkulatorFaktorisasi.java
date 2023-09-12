import java.math.BigInteger;
import java.util.Scanner;

public class KalkulatorFaktorisasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Aplikasi Kalkulator Faktorisasi!");

        int bilangan = -1;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Masukkan bilangan bulat positif (antara 1 hingga 1000): ");
                String input = scanner.nextLine();
                bilangan = Integer.parseInt(input);
                
                //Pembatasan hanya sampai 1.000 faktorial. Untuk mencegah error.
                if (bilangan >= 1 && bilangan <= 1000) {
                    validInput = true;
                } else {
                    System.out.println("Error: Masukkan bilangan bulat positif antara 1 hingga 1000.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Masukkan bilangan bulat positif antara 1 hingga 1000.");
            }
        }

        System.out.println("\nLangkah-langkah perhitungan faktorial:");
        BigInteger faktorial = hitungFaktorial(bilangan);
        System.out.println("");
        System.out.println("Maka faktorial dari " + bilangan + " adalah: " + faktorial);

        scanner.close();
    }

    public static BigInteger hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        } else {
            BigInteger result = BigInteger.ONE;
            for (int i = 2; i <= n; i++) {
                System.out.print(i);
                result = result.multiply(BigInteger.valueOf(i));
                if (i < n) {
                    System.out.print(" x ");
                }
            }
            System.out.println(" = " + result);
            return result;
        }
    }
}
