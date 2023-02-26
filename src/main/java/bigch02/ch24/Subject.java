package bigch02.ch24;

public class Subject {
    String SubjectName;
    int score;

    public Subject(String subjectName, int score) {
        this.SubjectName = subjectName;
        this.score = score;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
