package io.codelex.collections.practice.phonebook;

public class MainPhone {
    public static void main(String[] args) {
        PhoneDirectory phoneBook = new PhoneDirectory();

        phoneBook.putNumber("Andrew", "123456");
        phoneBook.putNumber("Johanna", "2589789");
        phoneBook.putNumber("Rihanna", "123654");
        phoneBook.putNumber("Johny", "333666999");

        System.out.println(phoneBook.getNumber("Andrew"));
        System.out.println(phoneBook.getNumber("Sasha"));
        System.out.println(phoneBook);

    }
}
