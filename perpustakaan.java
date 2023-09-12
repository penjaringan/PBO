class Barang {
    private String judul;
    private String penulis;
    private int tahunTerbit;

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

class Buku extends Barang {
    private int jumlahHalaman;

    public Buku(String judul, String penulis, int tahunTerbit, int jumlahHalaman) {
        super(judul, penulis, tahunTerbit);
        this.jumlahHalaman = jumlahHalaman;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void cetakInfo() {
        System.out.println("Jenis: Buku");
        System.out.println("Judul: " + getJudul());
        System.out.println("Penulis: " + getPenulis());
        System.out.println("Tahun Terbit: " + getTahunTerbit());
        System.out.println("Jumlah Halaman: " + getJumlahHalaman());
    }
}

class Majalah extends Barang {
    private int nomorEdisi;

    public Majalah(String judul, String penulis, int tahunTerbit, int nomorEdisi) {
        super(judul, penulis, tahunTerbit);
        this.nomorEdisi = nomorEdisi;
    }

    public int getNomorEdisi() {
        return nomorEdisi;
    }

    public void cetakInfo() {
        System.out.println("Jenis: Majalah");
        System.out.println("Judul: " + getJudul());
        System.out.println("Penulis: " + getPenulis());
        System.out.println("Tahun Terbit: " + getTahunTerbit());
        System.out.println("Nomor Edisi: " + getNomorEdisi());
    }
}

class DVD extends Barang {
    private double durasi;

    public DVD(String judul, String penulis, int tahunTerbit, double durasi) {
        super(judul, penulis, tahunTerbit);
        this.durasi = durasi;
    }

    public double getDurasi() {
        return durasi;
    }

    public void cetakInfo() {
        System.out.println("Jenis: DVD");
        System.out.println("Judul: " + getJudul());
        System.out.println("Penulis: " + getPenulis());
        System.out.println("Tahun Terbit: " + getTahunTerbit());
        System.out.println("Durasi: " + getDurasi() + " menit");
    }
}

public class Perpustakaans {
    public static void main(String[] args) {
        Buku buku = new Buku("Fisika Dasar", "Budi Raharjo", 2020, 250);
        Majalah majalah = new Majalah("Traveler's Guide", "Lisa Wong", 2022, 10);
        DVD dvd = new DVD("Science Documentary", "National Geographic", 2018, 90.5);

        buku.cetakInfo();
        System.out.println();
        majalah.cetakInfo();
        System.out.println();
        dvd.cetakInfo();
    }
}
