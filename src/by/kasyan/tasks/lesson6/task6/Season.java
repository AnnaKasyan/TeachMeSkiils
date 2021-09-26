package by.kasyan.tasks.lesson6.task6;

public enum Season {
    WINTER(-5),
    SPRING(15),
    SUMMER(22) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(15);

    private int temp;

    Season(int temp) {
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
