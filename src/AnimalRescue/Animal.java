package AnimalRescue;

import java.lang.constant.Constable;

public abstract class Animal {

    private String breed ;

    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){
        this.breed = breed;

    }
    private int age ;

    public int getAge(){
        return age;

    }

    public void setAge(int age){
        this.age = age;

    }
    private float weight;

    public float getWeight(){
        return weight;

    }

    public void setWeight(float weight){
        this.weight = weight;
    }
    private int heightInCm ;

    public int getHeightInCm(){
        return heightInCm;
    }

    public void setHeightInCm(int heightInCm){
        this.heightInCm = heightInCm;

    }
    private String name ;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    private String color ;

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
    private int health;

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health = health;

    }
    private int hunger;

    public int getHunger(){
        return hunger;
    }

    public void setHunger(int hunger){
        this.hunger = hunger;
    }
    private int happiness;

    public int getHappiness(){
        return happiness;
    }

    public void setHappiness(int happiness){
        this.happiness = happiness;
    }
    public abstract void speak();
    public abstract void eat();
    public abstract void play();
    public abstract void sleep();




    }



