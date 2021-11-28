package AnimalRescue;

public abstract class Dog extends Animal {

    @Override
    public void speak() {

        System.out.println("Woof -woof!");

    }

    @Override
    public void eat() {

        System.out.println("Royal Canin for dogs");

    }

    @Override
    public void play() {
        System.out.println ("Playing fetch with a ball.");

    }

    @Override
    public void sleep() {
        System.out.println ( "Zzzz.");

    }

    public abstract void happiness();

}
