package io.codelex.classesandobjects.practice.exercise_7;

public class DogTest {
    public static void main(String[] args) {
        Dog max = new Dog("Max", "male", "Lady", "Rocky");
        Dog rocky = new Dog("Rocky", "male", "Molly", "Sam");
        Dog sparky = new Dog("Sparky", "male");
        Dog buster = new Dog("Buster", "male", "Lady", "Sparky");
        Dog sam = new Dog("Sam", "male");
        Dog lady = new Dog("Lady", "female");
        Dog molly = new Dog("Molly", "female");
        Dog coco = new Dog("Coco", "female", "Molly", "Buster");

        Dog[] dogs = {max, rocky, sparky, buster, sam, lady, molly, coco};

        for(Dog dog : dogs) {
            System.out.println(dog.getName() + " father's name is " + dog.fathersName());
        }

        System.out.println(coco.hasSameMotherAs(rocky));
        System.out.println(buster.hasSameMotherAs(rocky));
    }
}
