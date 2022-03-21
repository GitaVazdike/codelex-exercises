package io.codelex.classesandobjects.practice.exercise_7;

public class Dog {
    private String name;
    private Sex sex;
    private String mother;
    private String father;

    public Dog(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }

    public Dog(String name, Sex sex, String mother, String father) {
        this.name = name;
        this.sex = sex;
        this.mother = mother;
        this.father = father;
    }

    public String getName() {
        return name;
    }

    public String fathersName() {
        if (father == null) {
            return "Unknown";
        }
        return father;
    }

    public String hasSameMotherAs(Dog otherDog) {
        if (mother == null || otherDog.mother == null) {
            return "Unknown";
        } else if (mother.equals(otherDog.mother)) {
            return "Yes";
        } else {
            return "No";
        }
    }

        @Override
        public String toString () {
            return "Dog{"
                    + "name='" + name + '\''
                    + ", sex='" + sex + '\''
                    + '}';
        }
    }
