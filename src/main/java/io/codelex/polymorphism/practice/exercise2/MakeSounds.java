package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {

        List<Sound> soundList = new ArrayList<>();

        Firework firework = new Firework();
        Firework firework2 = new Firework();
        Radio radio = new Radio();
        Radio radio2 = new Radio();
        Parrot parrot = new Parrot();
        Parrot parrot2 = new Parrot();


        soundList.add(firework);
        soundList.add(radio);
        soundList.add(radio2);
        soundList.add(parrot);
        soundList.add(firework2);
        soundList.add(parrot2);

        for (Sound sound : soundList) {
            sound.playSound();
        }
    }

}
