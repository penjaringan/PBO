// Kelas induk untuk semua barang di perpustakaan
class Barang {
    private String judul;  // Atribut untuk menyimpan judul barang
    private String penulis; // Atribut untuk menyimpan penulis barang
    private int tahunTerbit;      // Atribut untuk menyimpan tahun terbit barang

    public Barang(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }
}

// Subkelas untuk buku
class Buku extends Barang {
    private int jumlahHalaman;  // Atribut untuk menyimpan jumlah halaman buku

    public Buku(String judul, String penulis, int tahunTerbit, int jumlahHalaman) {
        super(judul, penulis, tahunTerbit);
        this.jumlahHalaman = jumlahHalaman;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    // Metode khusus untuk mencetak informasi buku
    public void cetakInfoBuku() {
        System.out.println("Judul Buku: " + getJudul());
        System.out.println("Penulis: " + getPenulis());
        System.out.println("Tahun Terbit: " + getTahunTerbit());
        System.out.println("Jumlah Halaman: " + getJumlahHalaman());
    }
}

// Subkelas untuk majalah
class Majalah extends Barang {
    private int nomorEdisi;  // Atribut untuk menyimpan nomor edisi majalah

    public Majalah(String judul, String penulis, int tahunTerbit, int nomorEdisi) {
        super(judul, penulis, tahunTerbit);
        this.nomorEdisi = nomorEdisi;
    }

    public int getNomorEdisi() {
        return nomorEdisi;
    }

    // Metode khusus untuk mencetak informasi majalah
    public void cetakInfoMajalah() {
        System.out.println("Judul Majalah: " + getJudul());
        System.out.println("Penulis: " + getPenulis());
        System.out.println("Tahun Terbit: " + getTahunTerbit());
        System.out.println("Nomor Edisi: " + getNomorEdisi());
    }
}

// Subkelas untuk DVD
class DVD extends Barang {
    private double durasi;  // Atribut untuk menyimpan durasi DVD dalam menit

    public DVD(String judul, String penulis, int tahunTerbit, double durasi) {
        super(judul, penulis, tahunTerbit);
        this.durasi = durasi;
    }

    public double getDurasi() {
        return durasi;
    }

    // Metode khusus untuk mencetak informasi DVD
    public void cetakInfoDVD() {
        System.out.println("Judul DVD: " + getJudul());
        System.out.println("Penulis: " + getPenulis());
        System.out.println("Tahun Terbit: " + getTahunTerbit());
        System.out.println("Durasi: " + getDurasi() + " menit");
    }
}

// Contoh penggunaan
public class Perpus {
    public static void main(String[] args) {
        Buku buku = new Buku("Matematika untuk Sekolah Dasar", "Airlangga", 2011, 120);
        Majalah majalah = new Majalah("Mengenal Internet", "Mico Pardosi", 2011, 5);
        DVD dvd = new DVD("Mission Imposible", "Hollywood", 2019, 120);

        buku.cetakInfoBuku();
        System.out.println();
        majalah.cetakInfoMajalah();
        System.out.println();
        dvd.cetakInfoDVD();
    }
}
