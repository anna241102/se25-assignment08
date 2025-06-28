package de.unibayreuth.se.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private final List<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }
public abstract void notifyObservers();
    protected void fireUpdate() {
        System.out.println("Sende Update an Beobachter...");
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
