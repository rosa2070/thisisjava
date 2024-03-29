package ch15.quiz.quiz10;

public class Student implements Comparable<Student> {
    public String id;
    public int score;

    public Student(String id, int score) {
        this.id = id;
        this.score = score;
    }

    @Override
    public int compareTo(Student s) {
        if (score < s.score) return -1;
        else if (score == s.score) return 0;
        else return 1;
    }
}
