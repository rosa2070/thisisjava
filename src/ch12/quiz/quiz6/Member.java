package ch12.quiz.quiz6;

public class Member {
    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        System.out.println();
        return id + ": " + name;
    }
}
