import animals.entity.Animal;
import animals.entity.predators.impl.TigerImpl;
import forest.Forest;
import printer.Printer;

public class App {
    public static void main(String[] args) throws Exception {
        Forest forest = new Forest();

        forest.fillForest();

        for (int i = 0; i < 3; i++) {
            for (Animal animal: forest.getAnimals()) {
                animal.move();
            }
            Printer.print(forest.getAnimals());
        }
    }
}
