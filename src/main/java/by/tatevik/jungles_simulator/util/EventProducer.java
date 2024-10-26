package by.tatevik.jungles_simulator.util;

import by.tatevik.jungles_simulator.model.Elephant;

public class EventProducer {
public void activateEvent(){

}
private void sleepEvent(Elephant elephant){
    int energy=elephant.getEnergy();
    energy=energy+20;
    if (energy>500){
        energy=500;
    }
    elephant.setEnergy(energy);
    System.out.println("Слоник поспал! + 20 энергии. " +
            "Текущая энергия: "+elephant.getEnergy());
}
private void moveEvent(Elephant elephant){
    int energy=elephant.getEnergy();
    energy=energy-50;
    if (energy<0){
        energy=0;
    }
    elephant.setEnergy(energy);
    System.out.println("Слоник походил! - 50 энергии. " +
            "Текущая энергия: "+elephant.getEnergy());
}
private void eatEvent(Elephant elephant){
    int energy=elephant.getEnergy();
    int health=elephant.getHealth();
    energy=energy-50;
    if (energy<0){
        energy=0;
    }
  health=health +(int)(elephant.getENERGY_RATIO_AFTER_EATING()*4);
    if (health>300){
        health=300;
    }
    elephant.setEnergy(energy);
    elephant.setHealth(health);
}
private void hunterAttack(Elephant elephant){
    int health=elephant.getHealth();
    health=health-25;
}

}
