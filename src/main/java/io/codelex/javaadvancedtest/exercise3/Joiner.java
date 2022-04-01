package io.codelex.javaadvancedtest.exercise3;

import java.util.StringJoiner;

public class Joiner <T> {
    String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

public String join(T... objects){

        return objects + separator;
}

    @Override
    public String toString() {
        return "Joiner{" +
                "separator='" + separator + '\'' +
                '}';
    }
}
