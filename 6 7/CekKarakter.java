import java.util.Scanner;

class Karakter {
    private char karakter;

    public Karakter(char karakter) {
        this.karakter = karakter;
    }

    public char getKarakter() {
        return karakter;
    }

    public boolean HurufBesar() {
        return Character.isUpperCase(karakter);
    }

    public boolean HurufKecil() {
        return Character.isLowerCase(karakter);
    }
}

public class CekKarakter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di aplikasi cek huruf!");

        char karakterInput = '\0'; // Karakter default yang tidak valid

        boolean validInput = false;
        while (!validInput) {
            System.out.print("Masukkan sebuah (satu hanya satu saja) karakter (huruf) lalu tekan enter: ");
            String input = scanner.next();

            if (input.length() != 1) {
                System.out.println("Error: Masukkan satu karakter saja.");
            } else {
                karakterInput = input.charAt(0);
                validInput = true;
            }
        }

        Karakter karakterObjek = new Karakter(karakterInput);

        if (karakterObjek.HurufBesar()) {
            System.out.println("Karakter " + karakterObjek.getKarakter() + " adalah huruf besar (kapital).");
        } else if (karakterObjek.HurufKecil()) {
            System.out.println("Karakter " + karakterObjek.getKarakter() + " adalah huruf kecil.");
        } else {
            System.out.println("Karakter " + karakterObjek.getKarakter() + " bukan huruf.");
        }

        scanner.close();
    }
}
