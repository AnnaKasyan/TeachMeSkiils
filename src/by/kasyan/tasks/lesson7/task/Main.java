package by.kasyan.tasks.lesson7.task;

public class Main {
    public static void main(String[] args) {

        MilitaryAir fighter = new MilitaryAir(100000, 2400, 11600, "МиГ-29", 11.36, 600, true, 4);
        CivilAir airliner = new CivilAir(110000, 1185, 280000, "Airbus A380", 80, 3300, 853, true);
        PassengerGround car = new PassengerGround(500, 286, 2175, "Porsche Cayenne Turbo", 4, 9, "внедорожник", 5);
        FreightGround track = new FreightGround(435, 85, 6770, "МАЗ 5340", 4, 28.7, 10);

        System.out.println(fighter);
        System.out.println("-----------");
        System.out.println(airliner);
        System.out.println("-----------");
        System.out.println(car);
        System.out.println("-----------");
        System.out.println(track);
        System.out.println("-----------");

        car.calculatingLengthRoad();
        System.out.println("-----------");

        track.loading();
        System.out.println("-----------");

        airliner.calculatingCapacity();
        System.out.println("-----------");

        fighter.toFire();
        System.out.println("-----------");
        fighter.toCatapult();

    }
}
