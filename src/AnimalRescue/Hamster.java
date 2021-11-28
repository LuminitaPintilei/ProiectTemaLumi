package AnimalRescue;

public class Hamster extends Animal {

    @Override
    public void speak() {
        System.out.println ("Chit-chit");

    }

    @Override
    public void eat() {
        System.out.println ("Carrot");

    }

    @Override
    public void play() {
        System.out.println("Run on exercise wheels.");

    }

    @Override
    public void sleep() {
        System.out.println ("Sleep during the day, and awake at night.");

    }
}
