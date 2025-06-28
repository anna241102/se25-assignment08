package de.unibayreuth.se.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject extends Subject {

    private final List<Observer> observers = new ArrayList<>();
    private int value;

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Sende Update an Beobachter...");
        for (Observer o : observers) {
            o.update(this);
        }
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }

    public int getValue() {
        return value;
    }
}
