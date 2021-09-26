package by.kasyan.tasks.lesson6.task5;

public class Main {
    public static void main(String[] args) {
        Guitar guitar1 = new Guitar(6);
        Guitar guitar2 = new Guitar(7);
        Guitar guitar3 = new Guitar(4);
        Drum drum1 = new Drum("22 × 18 дюймов");
        Drum drum2 = new Drum("12 × 9 дюймов");
        Drum drum3 = new Drum("16 × 16 дюймов");
        Trumpet trumpet1 = new Trumpet("10.5 мм");
        Trumpet trumpet2 = new Trumpet("11.65 мм");
        Trumpet trumpet3 = new Trumpet("11.3 мм");
        Instrument[] instruments = new Instrument[]{guitar1, guitar2, guitar3, drum1, drum2, drum3, trumpet1, trumpet2, trumpet3};

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
