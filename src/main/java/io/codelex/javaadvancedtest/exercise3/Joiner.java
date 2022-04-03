package io.codelex.javaadvancedtest.exercise3;

import java.util.StringJoiner;

public class Joiner<T> {
    String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... objects) {
        StringJoiner str = new StringJoiner(separator);
        for (T object : objects) {
            str.add(object.toString());
        }
        return str.toString();
    }
}



