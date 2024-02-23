package ch12.quiz.quiz15;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");

        LocalDateTime now = LocalDateTime.now();
//        System.out.println("시작일: " + now.format(dtf));

        LocalDateTime endDateTime = LocalDateTime.of(2024, 12, 31, 0, 0, 0);
//        System.out.println("종료일: " + endDateTime.format(dtf));

        long remainDay = now.until(endDateTime, ChronoUnit.DAYS);
        System.out.println("남은 일자: " + remainDay);


    }
}
