package by.tatevik.jungles_simulator.model;

public class Elephant {
    private int health=500;
    private int energy=300;
    private final double ENERGY_RATIO_AFTER_EATING= 5.5;

    public void setEnergy(int energy) {
        this.energy = energy;
    }
    public int getEnergy() {
        return energy;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getHealth() {
        return health;
    }
    public double getENERGY_RATIO_AFTER_EATING() {
        return ENERGY_RATIO_AFTER_EATING;
    }
}
