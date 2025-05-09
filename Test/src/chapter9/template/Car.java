package chapter9.template;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 겁니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
    }
}
