import java.util.Scanner;

public class CekPalindrom {
    public static boolean isPalindrome(String input) {
        // Menghapus spasi dan mengubah semua karakter menjadi huruf kecil
        String cleanedInput = input.replaceAll("\\s", "").toLowerCase();
        int length = cleanedInput.length();

        for (int i = 0; i < length / 2; i++) {
            if (cleanedInput.charAt(i) != cleanedInput.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pengecek palindrom!");
        System.out.print("Masukkan sebuah kalimat atau kata lalu tekan enter untuk memeriksa: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("'" + input + "' adalah sebuah palindrom.");
        } else {
            System.out.println("'" + input + "' bukan sebuah palindrom.");
        }

        scanner.close();
    }
}
