public class TugasPBO_3 {

    public static void main(String[] args) {
        
        //Deklarasi variabel untuk tipe data integer
        int a = 10;
        int b = 5;
        int penjumlahan = a + b;
        int pengurangan = a - b; 
        int perkalian = a * b;
        int pembagian = a / b;
        int mod = a % b;
        int usia = 25;
        int x = 5;
        int nilaixbaru = x + 5 - 1;
        int y = nilaixbaru + 3;
        int z = nilaixbaru * y;
        
                
        //Deklarasi variabel untuk tipe data Boolean
        boolean lebihbesar = (a > b); 
        boolean samadengan = (a == b);
        boolean logikadan = (lebihbesar && samadengan);
        boolean logikaatau = (lebihbesar || samadengan);
        boolean benar = true;
        
        //Deklarasi variabel untuk tipe data Double
        double berat = 60.5;
        double PI = 3.14159;
        double jari= 8;

        //Deklarasi variabel untuk tipe data Char
        char jeniskelamin = 'P';
                
        

        System.out.println("Penjumlahan: " + penjumlahan);
        System.out.println("Pengurangan: " + pengurangan);
        System.out.println("Perkalian: " + perkalian);
        System.out.println("Pembagian: " + pembagian);
        System.out.println("Mod: " + mod);
        System.out.println("");
        System.out.println("Apakah a lebih besar dari b? " + lebihbesar);
        System.out.println("Apakah a sama dengan b? " + samadengan);
        System.out.println("Hasil operator logika AND: " + logikadan);
        System.out.println("Hasil operator logika OR: " + logikaatau);
        System.out.println("");
        System.out.println("Umur: " + usia);
        System.out.println("Berat: " + berat);
        System.out.println("Jenis Kelamin: " + jeniskelamin);
        System.out.println("isTrue: " + benar);
        System.out.println("");
        System.out.println("Nilai x: " + x);
        System.out.println("Nilai x baru : " + nilaixbaru);
        System.out.println("Nilai y: " + y);
        System.out.println("Nilai z: " + z);
        System.out.println("");
        System.out.println ("Luas Lingkaran: " + PI * Math.pow(jari, 2) );
        
    }

}
