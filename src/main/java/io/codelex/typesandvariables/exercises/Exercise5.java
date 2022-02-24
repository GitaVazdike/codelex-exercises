package io.codelex.typesandvariables.exercises;

public class Exercise5 {
    public static void main(String[] args) {
        String[] classes = {"course1", "course2", "course3", "course4", "course5", "course6", "course7", "course8"};
        String[] teachers = {"teacher1", "teacher2", "teacher3", "teacher4", "teacher5", "teacher6", "teacher7", "teacher8"};
        String endLine = "+" + "-".repeat(48) + "+";

        System.out.println(endLine);

        for (int i = 0; i < classes.length; i++) {
            System.out.printf("| %d |%26s |%15s |\n", (i + 1), classes[i], teachers[i]);
        }

        System.out.println(endLine);
    }
}

