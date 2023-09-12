import java.util.Scanner;

public class konversisuhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // pengguna memasukkan suhu dalam derajat Celsius
        System.out.print("Masukkan suhu dalam derajat Celsius: ");
        double celsius = scanner.nextDouble();

        // Konversi suhu dari Celsius ke Fahrenheit
        double fahrenheit = celsiuskeFahrenheit(celsius);

        // Mencetak hasil konversi dengan presisi dua desimal
        System.out.printf(celsius+"  derajat Celsius adalah  "+fahrenheit +"  derajat Fahrenheit");

        scanner.close();
    }

    // Fungsi untuk mengonversi suhu dari Celsius ke Fahrenheit
    public static double celsiuskeFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
