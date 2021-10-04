package by.kasyan.tasks.lesson7.tasks.task2;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Dog("сухой корм", "Средняя Азия", "алабай");
        Animal animal2 = new Dog("сырое мясо", "Сибирь", "самоедская собака");
        Animal animal3 = new Cat("сухой корм", "Германия", "черный");
        Animal animal4 = new Cat("мясо", "Франция", "серый");
        Animal animal5 = new Horse("овес", "Северная Америка", 50);
        Animal animal6 = new Horse("сено", "Австралия", 60);
        Animal[] animals = new Animal[]{animal1, animal2, animal3, animal4, animal5, animal6};
        Veterinarian veterinarian = new Veterinarian();

        animal1.makeNoise();
        animal3.eat();
        animal5.sleep();
        System.out.println("-----------");

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }

    }
}
