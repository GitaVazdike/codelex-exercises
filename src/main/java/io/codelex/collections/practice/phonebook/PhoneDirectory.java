package io.codelex.collections.practice.phonebook;

import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectory {
    private TreeMap<String, String> data;

    public PhoneDirectory() {
        data = new TreeMap<>();
    }

    public String getNumber(String name) {
        for (Map.Entry<String, String> i : data.entrySet()) {
            if (i.getKey().equals(name)) {
                return i.getValue();
            }
        }
        return "Person with such name doesn't exist";
    }

    public void putNumber(String name, String number) {
        data.put(name, number);
    }

    @Override
    public String toString() {
        return "PhoneDirectory{"
                + "data=" + data
                + '}';
    }
}
