public class PerpustakaanBuku {
    public static void main(String[] args) {
        // Membuat objek dari setiap kelas buku: Fiksi dan NonFiksi
        Buku bukuFiksi = new Fiksi();
        Buku bukuNonFiksi = new NonFiksi();

        // Panggil metode deskripsi() pada setiap objek
        bukuFiksi.deskripsi();   // Output: Ini adalah sebuah buku fiksi.
        bukuNonFiksi.deskripsi(); // Output: Ini adalah sebuah buku non-fiksi.
    }
}

// Kelas Buku (kelas dasar)
class Buku {
    void deskripsi() {
        System.out.println("Ini adalah sebuah buku.");
    }
}

// Kelas Fiksi yang merupakan subkelas Buku
class Fiksi extends Buku {
    @Override
    void deskripsi() {
        System.out.println("Ini adalah sebuah buku fiksi.");
    }
}

// Kelas NonFiksi yang merupakan subkelas Buku
class NonFiksi extends Buku {
    @Override
    void deskripsi() {
        System.out.println("Ini adalah sebuah buku non-fiksi.");
    }
}


