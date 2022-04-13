package forest;

import java.util.ArrayList;
import java.util.List;

import animals.entity.Animal;
import animals.entity.predators.impl.TigerImpl;

public class Forest {
    
    private List<Animal> animals;
    private int xLength;
    private int yLength;

    public Forest() {
        this.xLength = 100;
        this.yLength = 100;
        this.animals = new ArrayList<>();
    }

    public Forest(List<Animal> animals) {
        this.animals = animals;
    }

    public void fillForest() {
        animals.add(new TigerImpl(Integer.toString(animals.size()), (double) 10, 1, xLength));
        animals.add(new TigerImpl(Integer.toString(animals.size()), (double) 10, 1, xLength));
        animals.add(new TigerImpl(Integer.toString(animals.size()), (double) 10, 1, xLength));
    }

    public void setSize(int xLength, int yLength) {
        this.xLength = xLength;
        this.yLength = yLength;
    }

    public List<Animal> getAnimals() {
        return animals;
    }


}
