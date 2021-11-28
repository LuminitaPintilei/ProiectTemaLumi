package AnimalRescue;

public abstract class Cat extends Animal {


    @Override
    public void speak() {
        System.out.println ("Meow-meow!");

    }

    @Override
    public void eat() {
        System.out.println ("Whiskas");

    }

    @Override
    public void play() {
        System.out.println ("Trying to catch small toys.");

    }

    @Override
    public void sleep() {
        System.out.println ("Purr");

    }

    public abstract void furr ();
}
