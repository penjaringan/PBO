public class Aritmatika {
    private int angka1;
    private int angka2;
    
    public Aritmatika(int a, int b) {
        angka1 = a;
        angka2 = b;
    }
    
    public int tambah() {
        return angka1 + angka2;
    }
    
    protected int kurang() {
        return angka1 - angka2;
    }
    
    private int kali() {
        return angka1 * angka2;
    }
    
    public static void main2(String[] args) {
        Aritmatika aritmatika = new Aritmatika(5, 3);
        
        int hasilTambah = aritmatika.tambah();
        System.out.println("Hasil penjumlahan: " + hasilTambah);
        
        int hasilKurang = aritmatika.kurang();
        System.out.println("Hasil pengurangan: " + hasilKurang);
        
        int hasilKali = aritmatika.kali(); // Akan menyebabkan error karena method 'kali' bersifat private
        System.out.println("Hasil perkalian: " + hasilKali);
    }
}
