public class ArraySuara {
    public static void main(String[] args) {
        // Membuat array objek dengan elemen-elemen dari kelas yang berbeda
        Hewan[] hewanArray = new Hewan[3];
        hewanArray[0] = new Kucing();
        hewanArray[1] = new Anjing();
        hewanArray[2] = new Sapi();

        // Menggunakan loop untuk memanggil metode suara() pada setiap objek dalam array
        for (Hewan hewan : hewanArray) {
            hewan.suara();
        }
    }
}

// Membuat interface Bentuk
interface Hewan {
    void suara();
}

// Kelas Kucing
class Kucing implements Hewan {
    @Override
    public void suara() {
        System.out.println("Meong... meong... (Suara kucing)");
    }
}

// Kelas Anjing
class Anjing implements Hewan {
    @Override
    public void suara() {
        System.out.println("Guk... guk... (Suara anjing)");
    }
}

// Kelas Sapi
class Sapi implements Hewan {
    @Override
    public void suara() {
        System.out.println("Moo... moo... (Suara sapi)");
    }
}
