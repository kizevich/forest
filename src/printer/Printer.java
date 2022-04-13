package printer;

import java.util.List;

import animals.entity.Animal;

public class Printer {
    
    public Printer() {
    }

    public static void print(List<Animal> animals) {
        System.out.print("Name |   ");
        System.out.print("Age   | ");
        System.out.print("Satiety |    ");
        System.out.print("x    |    ");
        System.out.print("y    |");
        System.out.println();
        System.out.println("------------------------------------------------");

        for (Animal animal: animals) {
            System.out.print(animal.getName() + "    |    ");
            System.out.print(animal.getAge() + "    |    ");
            System.out.print(animal.getSatiety() + "    |    ");
            System.out.print(animal.getXCoordinate() + "    |    ");
            System.out.print(animal.getYCoordinate() + "    |    ");
            System.out.println();
        }

        System.out.println("------------------------------------------------");
    }
}
