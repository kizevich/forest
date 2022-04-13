package animals.entity.predators;

import animals.entity.Animal;

public abstract class Predator extends Animal {
    
    public Predator() {
    }

    public Predator(String name, Double weight, int age, int forestMaxLength) {
        super(name, weight, age, forestMaxLength);
    }

    public abstract void hunt();
}
