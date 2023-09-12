public class Angkasegitiga {
    public static void main(String[] args) {
        System.out.println("===================================================================");
        System.out.println("4b. Buatlah sebuah program Java yang menggunakan loop bersarang untuk mencetak pola angka");
        System.out.println("segitiga:");
        System.out.println("Jawab :");
        System.out.println("===================================================================");

        //Tentukan jumlah baris yang diinginkan
        int tinggi = 5; 

        // Loop untuk setiap baris mulai dari 1 sampai maksimal tinggi lalu naikkan nilai baris 1 tiap looping
        for (int baris = 1; baris <= tinggi; baris++) {

            // Loop untuk mencetak angka pada setiap baris mulai dari 1 sampai maksimal sejumlah baris lalu nilai
            // angka ditambah 1 setiap loopingnya
            for (int angka = 1; angka <= baris; angka++) {

                //cetak angka
                System.out.print(angka);
            }
            // Pindah ke baris berikutnya setelah mencetak angka
            System.out.println(); 
        }
    }
}
