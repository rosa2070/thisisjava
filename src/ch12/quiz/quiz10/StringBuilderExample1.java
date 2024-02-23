package ch12.quiz.quiz10;

public class StringBuilderExample1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            sb.append(i);
        }
        System.out.println(sb.toString());

    }
}
