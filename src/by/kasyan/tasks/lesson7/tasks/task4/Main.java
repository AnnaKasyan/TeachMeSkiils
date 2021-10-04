package by.kasyan.tasks.lesson7.tasks.task4;

public class Main {
    public static void main(String[] args) {

        Clothes skirt1 = new Skirt(Size.XS, 15, "");
        Clothes skirt2 = new Skirt(Size.XXS, 12, "");
        Clothes pants1 = new Pants(Size.M, 25, "");
        Clothes pants2 = new Pants(Size.L, 30, "");
        Clothes teeShirt1 = new TeeShirt(Size.S, 10, "");
        Clothes teeShirt2 = new TeeShirt(Size.M, 12, "");
        Clothes tie1 = new Tie(Size.L, 8, "");
        Clothes tie2 = new Tie(Size.XXS, 5, "");
        Clothes[] clothes = new Clothes[]{skirt1, skirt2, pants1, pants2, teeShirt1, teeShirt2, tie1, tie2};
        Atelier atelier = new Atelier();

        for (Clothes cl : clothes) {

        }
    }
}
