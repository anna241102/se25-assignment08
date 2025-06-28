package de.unibayreuth.se.observer;

public class ConcreteObserver implements Observer {

private Subject subject;
private String name;

    public ConcreteObserver(Subject subject,String name) {
        this.subject= subject;
        this.name = name;
        subject.attach(this);
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof ConcreteSubject cs) {
            System.out.println(name + " erhielt Update vom subject ConcreteSubject: " + cs.getValue());
        }
    }

    public void detach() {
        subject.detach(this);
    }
}
