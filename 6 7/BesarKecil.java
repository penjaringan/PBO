import java.util.Arrays;
import java.util.Scanner;

public class BesarKecil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program penemuan nilai terkecil dan terbesar!");
        System.out.println("Masukkan beberapa angka, pisahkan dengan koma (misal: 5, 10, 2, 8, 3)");
        System.out.println("lalu tekan enter untuk melihat data");

        String input = scanner.nextLine().replaceAll("\\s", "");
        String[] inputArray = input.split(",");
        int[] numbers = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            try {
                numbers[i] = Integer.parseInt(inputArray[i]);
            } catch (NumberFormatException e) {
                System.out.println("Error: Masukkan angka yang valid.");
                return;
            }
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        Arrays.sort(numbers);

        System.out.println("Angka yang dimasukkan: " + Arrays.toString(numbers));
        System.out.println("Nilai terkecil: " + min);
        System.out.println("Nilai terbesar: " + max);

        scanner.close();
    }
}
