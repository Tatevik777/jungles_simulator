package by.tatevik.jungles_simulator.main;

import by.tatevik.jungles_simulator.model.Elephant;
import by.tatevik.jungles_simulator.util.EventProducer;

public class Main {
    public static void main(String[] args) {
        Elephant elephant=new Elephant();
        EventProducer eventProducer=new EventProducer();
        eventProducer.startSimulation(elephant);
    }
}
