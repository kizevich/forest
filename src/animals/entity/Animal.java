package animals.entity;

import java.util.Random;

public abstract class Animal {
    
    private String name;
    private Double weight;
    private int age;
    private int xCoordinate;
    private int yCoordinate;
    private boolean alive;
    private int satiety;
    private int forestMaxLength;

    public Animal(String name, Double weight, int age, int forestMaxLength) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.forestMaxLength = forestMaxLength;
        this.alive = true;
    }

    public Animal() {
        this.alive = true;
    }

    public void move() {
        checkBorders(this.forestMaxLength);
        this.xCoordinate = makeStep(xCoordinate);
        this.yCoordinate = makeStep(yCoordinate);
    }

    public String getName() { return this.name; }

    public Double getWeight() { return this.weight; }

    public int getAge() { return this.age; }

    public int getXCoordinate() { return this.xCoordinate; }

    public int getYCoordinate() { return this.yCoordinate; }

    public boolean isAlive() { return this.alive; }

    public int getSatiety() { return this.satiety; }

    public void setName(String name) { this.name = name; }

    public void setWeight(Double weight) { this.weight = weight; }

    public void setAge(int age) { this.age = age; }

    public void setXCoordinate(int coordinate) { this.xCoordinate = coordinate; }

    public void setYCoordinate(int coordinate) { this.yCoordinate = coordinate; }

    public void setAlive(boolean status) { this.alive = status; }

    public void setSatiety(int satiety) { this.satiety = satiety; }

    private int makeStep(int coordinate) {
        int randomResult;
        Random random = new Random();
        randomResult = random.nextInt(2);
        if (randomResult == 0) {
            return coordinate++;
        } else if (randomResult == 1) {
            return coordinate--;
        }
        return coordinate;
    }

    private void checkBorders(int forestMaxLength) {
        if (xCoordinate >= forestMaxLength) xCoordinate--;
        if (xCoordinate < 1) xCoordinate++;
        if (yCoordinate >= forestMaxLength) yCoordinate--;
        if (yCoordinate < 1) yCoordinate++;
    }
}
