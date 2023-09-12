import java.util.Scanner;

public class CekNamaBulan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka (1-12) untuk mewakili bulan: ");
        
        //tampung inputan dari keyboard sebagai integer dengan nama variabel bulan
        int bulan = input.nextInt();

        //deklarasi variabel namaBulan sebagai string
        String namaBulan;

        //deteksi angka dari variabel bulan
        switch (bulan) {
            //jika bulan bernilai 1 maka namaBulan = Januari 
            case 1:
                namaBulan = "Januari";
                break;
            
                //jika bulan bernilai 2 maka namaBulan = Februari
            case 2:
                namaBulan = "Februari";
                break;
            
                //jika bulan bernilai 3 maka namaBulan = Maret
            case 3:
                namaBulan = "Maret";
                break;

                //jika bulan bernilai 4 maka namaBulan = April
            case 4:
                namaBulan = "April";
                break;

                //jika bulan bernilai 5 maka namaBulan = Mei
            case 5:
                namaBulan = "Mei";
                break;

                //jika bulan bernilai 6 maka namaBulan = Juni
            case 6:
                namaBulan = "Juni";
                break;

                //jika bulan bernilai 7 maka namaBulan = Juli
            case 7:
                namaBulan = "Juli";
                break;

                //jika bulan bernilai 8 maka namaBulan = Agustus
            case 8:
                namaBulan = "Agustus";
                break;

                //jika bulan bernilai 9 maka namaBulan = September
            case 9:
                namaBulan = "September";
                break;

                //jika bulan bernilai 10 maka namaBulan = Oktober
            case 10:
                namaBulan = "Oktober";
                break;

                //jika bulan bernilai 11 maka namaBulan = November
            case 11:
                namaBulan = "November";
                break;

                //jika bulan bernilai 12 maka namaBulan = Desember
            case 12:
                namaBulan = "Desember";
                break;
            default:
                //Selain 1 sd 12 maka namaBulan tidak valid karena tidak ada bulan diatas 12
                namaBulan = "Angka bulan tidak valid";
                break;
        }

        System.out.println(namaBulan);

        input.close();
    }
}
