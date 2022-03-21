package io.codelex.classesandobjects.practice.exercise_7;

public class DogTest {
    public static void main(String[] args) {
        Dog max = new Dog("Max", Sex.MALE, "Lady", "Rocky");
        Dog rocky = new Dog("Rocky", Sex.MALE, "Molly", "Sam");
        Dog sparky = new Dog("Sparky", Sex.MALE);
        Dog buster = new Dog("Buster", Sex.MALE, "Lady", "Sparky");
        Dog sam = new Dog("Sam", Sex.MALE);
        Dog lady = new Dog("Lady", Sex.FEMALE);
        Dog molly = new Dog("Molly", Sex.FEMALE);
        Dog coco = new Dog("Coco", Sex.FEMALE, "Molly", "Buster");

        Dog[] dogs = {max, rocky, sparky, buster, sam, lady, molly, coco};

        for(Dog dog : dogs) {
            System.out.println(dog.getName() + " father's name is " + dog.fathersName());
        }

        System.out.println(coco.hasSameMotherAs(rocky));
        System.out.println(buster.hasSameMotherAs(rocky));
        System.out.println(sam.hasSameMotherAs(molly));
    }
}
