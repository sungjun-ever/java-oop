package bigch02.ch09;

public class Student {
    String studentName;
    int studentId;

    Subject korea;
    Subject math;

    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;

        korea = new Subject();
        math = new Subject();
    }

    public void setKoreaSubject(String subjectName, int score){
        korea.subjectName = subjectName;
        korea.score = score;
    }

    public void setMathSubject(String subjectName, int score){
        math.subjectName = subjectName;
        math.score = score;
    }

    public void showScoreInfo(){
        int totalScore = korea.score + math.score;
        System.out.println(studentName + "의 총점은 " + totalScore + "점 입니다.");
    }

}
