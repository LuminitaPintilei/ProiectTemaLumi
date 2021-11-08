package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {

        Animal rex = new Animal();
        rex.setName("Rex");
        rex.setBreed("Labrador");
        rex.setAge(3);
        rex.setColor("golden");
        rex.setWeight(40);
        rex.setHeightInCm(50);
        rex.setHealth(7);
        rex.setHunger(10);
        rex.setHappiness(8);


        System.out.println(rex.getName());
        System.out.println(rex.getAge() + " " + "years old");
        System.out.println(rex.getBreed());
        System.out.println(rex.getColor());
        System.out.println(rex.getWeight() + " " + "kg");
        System.out.println(rex.getHeightInCm() + " " + "cm");

        AnimalFood rexFood = new AnimalFood();
        rexFood.setBrand("Royal Canin");
        rexFood.setPrice(3);
        rexFood.setQuantity(1000);
        rexFood.setStock(1500);
        System.out.println("Favorite food" + " " + rexFood.getBrand());
        System.out.println("Food price" + " " + rexFood.getPrice() + " " + "$");
        System.out.println(rexFood.getQuantity() + " " + "gr" + " " + "food per day");
        System.out.println(rexFood.getStock() + " " + "gr" + " food in stock");

        RecreationalActivity rexActivities = new RecreationalActivity();
        rexActivities.sleep();
        rexActivities.eat();
        rexActivities.speak();
        rexActivities.play();


        Animal blackie = new Animal();
        blackie.setName("Blackie");
        blackie.setBreed("Cocker spaniel");
        blackie.setAge(4);
        blackie.setColor("black");
        blackie.setWeight(8);
        blackie.setHeightInCm(40);
        blackie.setHealth(8);
        blackie.setHunger(7);
        blackie.setHappiness(9);


        System.out.println(blackie.getName());
        System.out.println(blackie.getAge() + " " + "years old");
        System.out.println(blackie.getAge());
        System.out.println(blackie.getColor());
        System.out.println(blackie.getWeight()+ " " + "kg");
        System.out.println(blackie.getHeightInCm() + " " + "cm");

        AnimalFood blackieFood = new AnimalFood();
        blackieFood.setBrand("Purina");
        blackieFood.setPrice(2);
        blackieFood.setQuantity(450);
        blackieFood.setStock(1000);
        System.out.println("Favorite food" + " " + blackieFood.getBrand());
        System.out.println("Food price" + " " + blackieFood.getPrice() + " " + "$");
        System.out.println(blackieFood.getQuantity() + " " + "gr" + " " + "food per day");
        System.out.println(blackieFood.getStock() + " " + "gr" + " food in stock");


        RecreationalActivity blackieActivities = new RecreationalActivity();
        blackieActivities.sleep();
        blackieActivities.eat();
        blackieActivities.speak();
        blackieActivities.play();

        Animal freddie = new Animal();
        freddie.setName("Freddie");
        freddie.setBreed("Teckel");
        freddie.setAge(10);
        freddie.setColor("brown");
        freddie.setWeight(15);
        freddie.setHeightInCm(20);
        freddie.setHealth(6);
        freddie.setHunger(9);
        freddie.setHappiness(6);


        System.out.println(freddie.getName());
        System.out.println(freddie.getAge() + " " + "years old");
        System.out.println(freddie.getBreed());
        System.out.println(freddie.getColor());
        System.out.println(freddie.getWeight() + " " + "kg");
        System.out.println(freddie.getHeightInCm() + " " + "cm");

        AnimalFood freddieFood = new AnimalFood();
        freddieFood.setBrand("Hill's");
        freddieFood.setPrice(4);
        freddieFood.setQuantity(300);
        freddieFood.setStock(600);
        System.out.println("Favorite food" + " " + freddieFood.getBrand());
        System.out.println("Food price" + " " + freddieFood.getPrice() + " " + "$");
        System.out.println(freddieFood.getQuantity() + " " + "gr" + " " + "food per day");
        System.out.println(freddieFood.getStock() + " " + "gr" + " food in stock");

        RecreationalActivity freddieActivities = new RecreationalActivity();
        freddieActivities.sleep();
        freddieActivities.eat();
        freddieActivities.speak();
        freddieActivities.play();

        Animal max = new Animal();
        max.setName("Max");
        max.setBreed("Mops");
        max.setAge(2);
        max.setColor("Silver Fawn");
        max.setWeight(18);
        max.setHeightInCm(30);
        max.setHealth(7);
        max.setHunger(7);
        max.setHappiness(4);

        System.out.println(max.getName());
        System.out.println(max.getAge() + " " + "years old");
        System.out.println(max.getBreed());
        System.out.println(max.getColor());
        System.out.println(max.getWeight() + " " + "kg");
        System.out.println(max.getHeightInCm() + " " + "cm");

        AnimalFood maxFood = new AnimalFood();
        maxFood.setBrand("Taste of The Wild");
        maxFood.setPrice(5);
        maxFood.setQuantity(700);
        maxFood.setStock(2700);
        System.out.println("Favorite food" + " " + maxFood.getBrand());
        System.out.println("Food price" + " " + maxFood.getPrice() + " " + "$");
        System.out.println(maxFood.getQuantity() + " " + "gr" + " " + "food per day");
        System.out.println(maxFood.getStock() + " " + "gr" + " food in stock");


        RecreationalActivity maxActivities = new RecreationalActivity();
        maxActivities.sleep();
        maxActivities.eat();
        maxActivities.speak();
        maxActivities.play();

        Rescuer anna = new Rescuer();
        anna.setNameGirl("Anna");
        anna.setMoney(20);

        System.out.println(anna.getNameGirl());
        System.out.println(anna.getMoney() + " " + " $ " + "for adoption");


        Veterinary john = new Veterinary();
        john.setNameVet(" Dr. John Smith ");
        john.setTypeVet(" Critical Care Specialist");

        System.out.println(john.getNameVet());
        System.out.println(john.getTypeVet());

        Veterinary dan = new Veterinary();
        dan.setNameVet(" Dr. Dan Brown ");
        dan.setTypeVet(" Nutrition Care Specialist");

        System.out.println(dan.getNameVet());
        System.out.println(dan.getTypeVet());






    }
}
