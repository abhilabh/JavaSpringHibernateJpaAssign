interface Piano {
    default void play() {
        System.out.println("Playing Piano");
    }
}

interface Guitar {
    default void play() {
        System.out.println("Playing Guitar");
    }
}

class Instrument implements Piano, Guitar {
    @Override
    public void play() {
        System.out.println("Playing Instrument"); // Custom implementation in Instrument class
    }
}
public class InstrumentMain {
    public static void main(String[] args) {
        Instrument instrument = new Instrument();
        instrument.play();
    }
}
