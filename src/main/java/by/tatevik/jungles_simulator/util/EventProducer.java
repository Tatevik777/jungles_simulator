package by.tatevik.jungles_simulator.util;

import by.tatevik.jungles_simulator.model.Elephant;
public class EventProducer {
    public void startSimulation(Elephant elephant){
        while(statusChecker(elephant)) {
            int eventNumber = (int) (Math.random() * 500);
            if (eventNumber >= 0 && eventNumber < 100) {
                sleepEvent(elephant);
            } else if (eventNumber >= 100 && eventNumber < 200) {
                moveEvent(elephant);
            } else if (eventNumber >= 200 && eventNumber < 300) {
                eatEvent(elephant);
            } else if (eventNumber >= 300 && eventNumber < 350) {
                hunterAttack(elephant);
            }
        }
        System.out.println("О нет! Слон не выжил!");
        }
    private void sleepEvent (Elephant elephant){
        int energy = elephant.getEnergy();
        energy = energy + 20;
        if (energy > 500) {
            energy = 500;
        }
        elephant.setEnergy(energy);
        energyChecker(elephant);
        System.out.println("Слоник поспал! + 20 энергии. " +
                "Текущая энергия: " + elephant.getEnergy());
    }
    private void moveEvent (Elephant elephant){
        int energy = elephant.getEnergy();
        energy = energy - 50;
        if (energy < 0) {
            energy = 0;
        }
        elephant.setEnergy(energy);
        energyChecker(elephant);
        System.out.println("Слоник походил! - 50 энергии. " +
                "Текущая энергия: " + elephant.getEnergy());
    }
    private void eatEvent (Elephant elephant){
        int energy = elephant.getEnergy();
        int health = elephant.getHealth();
        energy = energy - 50;
        if (energy < 0) {
            energy = 0;
        }
        health = health + (int) (elephant.getENERGY_RATIO_AFTER_EATING() * 4);
        if (health > 300) {
            health = 300;
        }
        elephant.setEnergy(energy);
        elephant.setHealth(health);
        energyChecker(elephant);
        System.out.println("Слоник поел ! Здоровье увеличилось! " +
                "Текущее здоровье: " + elephant.getHealth());
    }
    private void hunterAttack (Elephant elephant){
        int health = elephant.getHealth();
        health = health - 25;
        if (health < 0) {
            health = 0;
        }
        elephant.setHealth(health);
        energyChecker(elephant);
        System.out.println("На слона напал охотник ! - 50 здоровья. " +
                "Текущее здоровье: " + elephant.getHealth());
    }
    private void feedBaby(Elephant elephant){

    }
    private void breakTree(Elephant elephant){

    }
    private void drink(Elephant elephant){

    }
    private void swim(Elephant elephant){

    }
    private void interactWithHuman(){

    }
    private boolean statusChecker (Elephant elephant){
        if (elephant.getHealth() <= 0) {
            return false;
        } else {
            return true;
        }
    }
    private void energyChecker (Elephant elephant){
        if (elephant.getEnergy() >= 0) {
            int health = elephant.getHealth();
            health = health - 10;
            if (health < 0) {
                health = 0;
            }
            elephant.setHealth(health);
        }
    }
}





