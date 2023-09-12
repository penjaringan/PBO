public class PolaSegitiga {
    public static void main(String[] args) {
        System.out.println("===================================================================");
        System.out.println("4a. Buatlah sebuah program Java yang menggunakan loop bersarang untuk ");
        System.out.println("mencetak pola bintang segitiga terbalik:");
        System.out.println("Jawab :  :");
        System.out.println("===================================================================");

        //Tentukan tinggi bintang secara vertikal 
        int vertikal = 5; 

        // Loop untuk baris, ulangi proses sampai nilai baris sama dengan nilai vertikal sampai dengan 1
        // dan baris berkurang 1 setiap perulangannya
        for (int baris = vertikal; baris >= 1; baris--) {

            // Loop untuk mencetak bintang pada setiap baris
            for (int kolom = 1; kolom <= baris; kolom++) {

                //cetak bintang
                System.out.print("*");
            }
            // Pindah ke baris berikutnya setelah mencetak bintang
            System.out.println(); 
        }
    }
}
