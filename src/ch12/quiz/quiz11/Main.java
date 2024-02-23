package ch12.quiz.quiz11;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String data = "아이디,이름,패스워드";
        StringTokenizer st = new StringTokenizer(data, ",");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
