package ch05.sec07;

public class MultidimensionalArrayByValueLlistExample {
    public static void main(String[] args) {
        int[][] scores = {
                {80, 90, 96},
                {76, 88}
        };

        int totalStudent = 0;
        int totalSum = 0;
        for (int i = 0; i < scores.length; i++) {
            totalStudent += scores[i].length;
            for (int k = 0; k < scores[i].length; k++) {
                totalSum += scores[i][k];
            }
        }
        double totalAvg = (double) totalSum / totalStudent;
        System.out.println("전체 학생의 평균 점수: " + totalAvg);

    }
}
