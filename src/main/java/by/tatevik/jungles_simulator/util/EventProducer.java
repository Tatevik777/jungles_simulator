package by.tatevik.jungles_simulator.util;

import by.tatevik.jungles_simulator.model.Elephant;
public class EventProducer {
    public void startSimulation(Elephant elephant){
        while(statusChecker(elephant)) {
            int eventNumber = (int) (Math.random() * 500);
            if (eventNumber >= 0 && eventNumber < 100) {
                sleepEvent(elephant);
            } else if (eventNumber >= 100 && eventNumber < 150) {
                moveEvent(elephant);
            } else if (eventNumber >= 150 && eventNumber < 200) {
                swimEvent(elephant);
            } else if (eventNumber >= 200 && eventNumber < 250) {
                eatEvent(elephant);
            }else if(eventNumber >= 250 && eventNumber< 300){
                feedBaby(elephant);
            }else if(eventNumber >= 350 && eventNumber< 400){
                drinkEvent(elephant);
            } else if (eventNumber >= 400 && eventNumber < 450) {
                hunterAttack(elephant);
            }else if (eventNumber >= 450 && eventNumber < 500) {
                breakTree(elephant);
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
        energy = energy - 30;
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
        energy = energy - 30;
        if (energy < 0) {
            energy = 0;
        }
        health = health + (int) (elephant.getENERGY_RATIO_AFTER_EATING() * 4);
        if (health > 500) {
            health = 500;
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
        int energy = elephant.getEnergy();
        energy = energy - 15;
        if (energy < 0) {
            energy = 0;
        }
        elephant.setEnergy(energy);
        energyChecker(elephant);
        System.out.println("Слоник покормил малыша! - 15 энергии. " +
                "Текущая энергия: " + elephant.getEnergy());
    }
    private void breakTree(Elephant elephant){
        int energy = elephant.getEnergy();
        energy = energy - 30;
        if (energy < 0) {
            energy = 0;
        }
        elephant.setEnergy(energy);
        energyChecker(elephant);
        System.out.println("Слоник сломал дерево! - 30 энергии. " +
                "Текущая энергия: " + elephant.getEnergy());
    }
    private void drinkEvent(Elephant elephant){
        int energy = elephant.getEnergy();
        int health = elephant.getHealth();
        energy = energy +30;
        if (energy < 0) {
            energy = 0;
        }
        health = health + (int) (elephant.getENERGY_RATIO_AFTER_EATING() * 4);
        if (health > 500) {
            health = 500;
        }
        elephant.setEnergy(energy);
        elephant.setHealth(health);
        energyChecker(elephant);
        System.out.println("Слоник попил ! Здоровье увеличилось! " +
                "Текущее здоровье: " + elephant.getHealth());
    }
    private void swimEvent(Elephant elephant){
        int energy = elephant.getEnergy();
        int health = elephant.getHealth();
        energy = energy +40;
        if (energy < 0) {
            energy = 0;
        }
        health = health + (int) (elephant.getENERGY_RATIO_AFTER_EATING() * 4);
        if (health > 500) {
            health = 500;
        }
        elephant.setEnergy(energy);
        elephant.setHealth(health);
        energyChecker(elephant);
        System.out.println("Слоник поплавал ! Здоровье увеличилось! " +
                "Текущее здоровье: " + elephant.getHealth());
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









