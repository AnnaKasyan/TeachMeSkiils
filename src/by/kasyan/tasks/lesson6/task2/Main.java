package by.kasyan.tasks.lesson6.task2;

public class Main {
    public static void main(String[] args) {

        Jacket blackLeatherJacket = new BlackLeatherJacket();
        Jacket tweedJacket = new TweedJacket();
        Jacket denimJacket = new DenimJacket();
        Shoes bigHeavyShoes = new BigHeavyShoes();
        Shoes brownShoes = new BrownShoes();
        Shoes joggingShoes = new JoggingShoes();
        Pants baggyPants = new BaggyPants();
        Pants cottonPants = new CottonPants();
        Pants denimPants = new DenimPants();

        Person firstPerson = new Person("Jack", blackLeatherJacket, bigHeavyShoes, denimPants);
        Person secondPerson = new Person("Alex", denimJacket, joggingShoes, baggyPants);
        Person thirdPerson = new Person("Peter", tweedJacket, brownShoes, cottonPants);

        firstPerson.putOn();
        firstPerson.takeOff();
        System.out.println();
        System.out.println("--------------");
        secondPerson.putOn();
        secondPerson.takeOff();
        System.out.println();
        System.out.println("--------------");
        thirdPerson.putOn();
        thirdPerson.takeOff();
    }
}
