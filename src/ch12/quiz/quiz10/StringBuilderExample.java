package ch12.quiz.quiz10;

public class StringBuilderExample {
    public static void main(String[] args) {
        String str = "";
        for (int i = 1; i <= 100; i++) {
            str += i;
        }
        System.out.println(str);
    }
}
