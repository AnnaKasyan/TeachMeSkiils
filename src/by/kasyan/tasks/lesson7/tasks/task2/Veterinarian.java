package by.kasyan.tasks.lesson7.tasks.task2;

public class Veterinarian {

    public void treatAnimal(Animal animal) {
        System.out.println("На приеме животное, происхождение породы: " + animal.getLocation() + ", ест: " + animal.getFood() + ".");
    }

}
