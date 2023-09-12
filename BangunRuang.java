public class BangunRuang {
    public static void main(String[] args) {
        Bentuk lingkaran = new Lingkaran(5.0);
        Bentuk persegi = new Persegi(4.0);
        Bentuk segitiga = new Segitiga(3.0, 6.0);

        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas()); 
        System.out.println("Luas Persegi: " + persegi.hitungLuas());       
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
    }
}

// Interface Bentuk
interface Bentuk {
    double hitungLuas();
}

// Kelas Lingkaran
class Lingkaran implements Bentuk {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
}

// Kelas Persegi
class Persegi implements Bentuk {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
}

// Kelas Segitiga
class Segitiga implements Bentuk {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}
