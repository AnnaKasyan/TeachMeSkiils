package by.kasyan.tasks.lesson7.task;

public class AirTransport extends Transport {

    private final double wingspan;
    private final int minRunwayLength;

    public AirTransport(int power, int speed, int weight, String model, double wingspan, int minRunwayLength) {
        super(power, speed, weight, model);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nРазмах крыльев (м): " + wingspan +
                ", минимальная длина взлётно-посадочной полосы для взлёта (м): " + minRunwayLength + ".";
    }
}

