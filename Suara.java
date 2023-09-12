public class Suara {
    public static void main(String[] args) {
        Hewan hewan1 = new Anjing();
        Hewan hewan2 = new Kucing();
        Hewan hewan3 = new Sapi();

        hewan1.suara(); 
        hewan2.suara(); 
        hewan3.suara();
    }
}

class Hewan {
    void suara() {
        System.out.println("Ini adalah suara hewan umum.");
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Guk... guk... (Suara anjing)");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Meong... meong... (Suara kucing)");
    }
}

class Sapi extends Hewan {
    @Override
    void suara() {
        System.out.println("Moo... moo... (Suara sapi)");
    }
}


