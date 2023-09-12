public class DeretBilanganGanjil {
    public static void main(String[] args) {
        System.out.println("===================================================================");
        System.out.println("2. Buatlah sebuah program Java yang menggunakan loop while untuk mencetak deret bilangan ganjil");
        System.out.println ("dari 1 hingga 15.");
        System.out.println("Jawab : Deret bilangan ganjil dari 1 hingga 15 (tanpa mod) adalah :");
        System.out.println("===================================================================");
            
                //deklarasikan nomorurut mulai dari 1 
                int nomorurut = 1;

                //Loop dengan while selama nomorurut masih dibawah atau sama dengan 15
                while (nomorurut <= 15) {

                    //cetak nomorurut
                    System.out.print(nomorurut + " ");
                    //nambahkan nomor urut dengan 2 untuk mendapatkan angka ganjil berikutnya.
                    nomorurut += 2;
                }
        
                // Mencetak baris baru setelah mencetak deret bilangan ganjil dah 1 s/d 15
                System.out.println(); 
       
        
    }
}
