public class DeretBilanganGenap {
    public static void main(String[] args) {
        System.out.println("===================================================================");
        System.out.println("1. Buatlah sebuah program Java yang menggunakan loop for untuk mencetak deret bilangan genap");
        System.out.println ("dari 2 hingga 20.");
        System.out.println("Jawab : Deret bilangan genap dari 2 hingga 20 (menggunakan mod):");
        System.out.println("===================================================================");

        //tentukan range i antara 2 sampai 20 lalu naikkan nilai i 1 per 1
        for (int i = 2; i <= 20; i++) {

            //jika i habis dibagi 2 maka i adalah bilangan genap
            if (i % 2 == 0) {

                //jika i bilangan genap maka cetak lah nilai i
                System.out.print(i + " , ");
            }
        }

        System.out.println(); // Mencetak baris baru setelah mencetak deret bilangan genap
    }
}
