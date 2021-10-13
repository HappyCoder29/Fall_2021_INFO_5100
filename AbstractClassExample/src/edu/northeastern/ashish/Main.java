package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();


        Dog dog = new Dog("Dog");
        dog.speak();
        dog.getFamily();

        Animal cat = new Cat("Cat");
        cat.speak();

        Animal bird = new Bird("Bird");
        bird.speak();

        Fish fish = new Fish("Fish");
        fish.speak();
        fish.swim();

        zoo.listAnimals.add(dog);
        zoo.listAnimals.add(cat);
        zoo.listAnimals.add(bird);
        zoo.listAnimals.add(fish);


        Fish fish1 = (Fish) zoo.listAnimals.get(3);
        fish1.swim();


    }


}
