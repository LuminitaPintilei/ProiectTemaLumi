package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {

        Dog rex = new Dog();
        rex.name = "Rex";
        rex.breed = "Labrador";
        rex.age = 2;
        rex.color = "golden";
        rex.weight = 40;
        rex.heightInCm = 50;
        rex.health = 7;
        rex.hunger = 10;
        rex.happiness = 8;


        System.out.println(rex.name);
        System.out.println(rex.age + " " + "years old");
        System.out.println(rex.breed);
        System.out.println(rex.color);
        System.out.println(rex.weight + " " + "kg");
        System.out.println(rex.heightInCm + " " + "cm");

        DogFood rexFood = new DogFood();
        rexFood.brand = "Royal Canin";
        rexFood.price = 3;
        rexFood.quantity = 1000;
        rexFood.stock = 1500;
        System.out.println("Favorite food" + " " + rexFood.brand);
        System.out.println("Food price" + " " + rexFood.price + " " + "$");
        System.out.println(rexFood.quantity + " " + "gr" + " " + "food per day");
        System.out.println(rexFood.stock + " " + "gr" + " food in stock");

        DogActivities rexActivities = new DogActivities();
        rexActivities.sleep();
        rexActivities.eat();
        rexActivities.speak();
        rexActivities.play();


        Dog blackie = new Dog();
        blackie.name = "Blackie";
        blackie.breed = "Cocker spaniel";
        blackie.age = 4;
        blackie.color = "black";
        blackie.weight = 8;
        blackie.heightInCm = 40;
        blackie.health = 8;
        blackie.hunger = 7;
        blackie.happiness = 9;


        System.out.println(blackie.name);
        System.out.println(blackie.age + " " + "years old");
        System.out.println(blackie.breed);
        System.out.println(blackie.color);
        System.out.println(blackie.weight + " " + "kg");
        System.out.println(blackie.heightInCm + " " + "cm");

        DogFood blackieFood = new DogFood();
        blackieFood.brand = "Purina";
        blackieFood.price = 2;
        blackieFood.quantity = 450;
        blackieFood.stock = 1000;
        System.out.println("Favorite food" + " " + blackieFood.brand);
        System.out.println("Food price" + " " + blackieFood.price + " " + "$");
        System.out.println(blackieFood.quantity + " " + "gr" + " " + "food per day");
        System.out.println(blackieFood.stock + " " + "gr" + " food in stock");


        DogActivities blackieActivities = new DogActivities();
        blackieActivities.sleep();
        blackieActivities.eat();
        blackieActivities.speak();
        blackieActivities.play();

        Dog freddie = new Dog();
        freddie.name = "Freddie";
        freddie.breed = "Teckel";
        freddie.age = 10;
        freddie.color = "brown";
        freddie.weight = 15;
        freddie.heightInCm = 20;
        freddie.health = 6;
        freddie.hunger = 9;
        freddie.happiness = 6;


        System.out.println(freddie.name);
        System.out.println(freddie.age + " " + "years old");
        System.out.println(freddie.breed);
        System.out.println(freddie.color);
        System.out.println(freddie.weight + " " + "kg");
        System.out.println(freddie.heightInCm + " " + "cm");

        DogFood freddieFood = new DogFood();
        freddieFood.brand = "Hill's";
        freddieFood.price = 4;
        freddieFood.quantity = 300;
        freddieFood.stock = 600;
        System.out.println("Favorite food" + " " + freddieFood.brand);
        System.out.println("Food price" + " " + freddieFood.price + " " + "$");
        System.out.println(freddieFood.quantity + " " + "gr" + " " + "food per day");
        System.out.println(freddieFood.stock + " " + "gr" + " food in stock");

        DogActivities freddieActivities = new DogActivities();
        freddieActivities.sleep();
        freddieActivities.eat();
        freddieActivities.speak();
        freddieActivities.play();

        Dog max = new Dog ();
        max.name = "Max";
        max.breed = "Mops";
        max.age = 2;
        max.color = "Silver Fawn";
        max.weight = 18;
        max.heightInCm = 30;
        max.health = 7;
        max.hunger = 7;
        max.happiness = 4;

        System.out.println(max.name);
        System.out.println(max.age + " " + "years old");
        System.out.println(max.breed);
        System.out.println(max.color);
        System.out.println(max.weight + " " + "kg");
        System.out.println(max.heightInCm + " " + "cm");

        DogFood maxFood = new DogFood();
        maxFood.brand = "Taste of The Wild";
        maxFood.price = 5;
        maxFood.quantity = 700;
        maxFood.stock = 2700;
        System.out.println("Favorite food" + " " + maxFood.brand);
        System.out.println("Food price" + " " + maxFood.price + " " + "$");
        System.out.println(maxFood.quantity + " " + "gr" + " " + "food per day");
        System.out.println(maxFood.stock + " " + "gr" + " food in stock");


        DogActivities maxActivities = new DogActivities();
        maxActivities.sleep();
        maxActivities.eat();
        maxActivities.speak();
        maxActivities.play();

        Girl anna = new Girl();
        anna.nameGirl = "Anna";
        anna.money = 20;

        System.out.println(anna.nameGirl);
        System.out.println(anna.money + " " + " $ " + "for adoption");


        Veterinary john = new Veterinary();
        john.nameVet = " Dr. John Smith ";
        john.typeVet = " Critical Care Specialist";

        System.out.println(john.nameVet);
        System.out.println(john.typeVet);

        Veterinary dan = new Veterinary();
        dan.nameVet = " Dr. Dan Brown ";
        dan.typeVet = " Nutrition Care Specialist";

        System.out.println(dan.nameVet);
        System.out.println(dan.typeVet);






    }
}
