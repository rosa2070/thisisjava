package ch08.quiz.quiz6;

public class SoundExample {
    public static void printSound(Soundable soundable) {
        System.out.println(soundable.sound());
    }

    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }
}
