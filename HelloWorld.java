public class TugasPBO1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int modulus = a % b;

        boolean isGreater = (a > b);
        boolean isEqual = (a == b);
        boolean logicalAnd = (isGreater && isEqual);
        boolean logicalOr = (isGreater || isEqual);

        // Tipe Data
        int age = 25;
        double weight = 60.5;
        char gender = 'M';
        boolean isTrue = true;

        // Variabel
        int x = 5;
        int y = x + 3;
        int z = x * y;

        int privateVariable;
        double PI = 3.14159;


        System.out.println("Penjumlahan: " + sum);
        System.out.println("Pengurangan: " + difference);
        System.out.println("Perkalian: " + product);
        System.out.println("Pembagian: " + quotient);
        System.out.println("Modulus: " + modulus);

        System.out.println("Apakah a lebih besar dari b? " + isGreater);
        System.out.println("Apakah a sama dengan b? " + isEqual);
        System.out.println("Hasil operator logika AND: " + logicalAnd);
        System.out.println("Hasil operator logika OR: " + logicalOr);

        System.out.println("Umur: " + age);
        System.out.println("Berat: " + weight);
        System.out.println("Jenis Kelamin: " + gender);
        System.out.println("isTrue: " + isTrue);

        System.out.println("Nilai z: " + z);
    }

}
