import java.util.Scanner;

public class BilanganPositifdanNegatif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================================================================");
        System.out.println("3. Buatlah sebuah program Java yang menggunakan loop do-while untuk meminta pengguna");
        System.out.println("memasukkan bilangan positif, dan terus meminta hingga pengguna memasukkan bilangan");
        System.out.println ("negatif. Setelah itu, program mencetak jumlah bilangan positif yang dimasukkan.");
        System.out.println("Jawab :  :");
        System.out.println("===================================================================");
        
        //devenisikan BilanganPositif sebagai integer dengan nilai awal 0
        int BilanganPositif = 0;

        //devenisikan indikator sebagai integer
        int indikator;
        
        //Lakukan perulangan sampai indikator bernilai negatif
        do {
            //buat instruksi kepada pengguna
            System.out.print("Masukkan angka positif dan masukkan angka negatif untuk berhenti: ");

            //tampung nilai inputan dari pengguna
            indikator = scanner.nextInt();
            
            //jika indikator diatas 0 adalah true maka
            if (indikator >= 0) {

                //bilangan positif adalah BilanganPositif tambah indikator
                BilanganPositif += indikator;
            }

            //lakukan perulangan selama indikator bernilai diatas 0 atau positif jika negatif keluar dari looping
        } while (indikator >= 0);

        //jika keluar dari looping, cetak nilai BilanganPositif hasil penjumlahan dengan indikator
        System.out.println("Jumlah total bilangan positif yang dimasukkan: " + BilanganPositif);

        scanner.close();
    }
}
