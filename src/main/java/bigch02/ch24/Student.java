package bigch02.ch24;

import java.util.ArrayList;

public class Student {
    String studentName;
    int studentId;
    private static int studentNum = 1001;

    ArrayList<Subject> subjectsList;

    public Student(String studentName) {
        this.studentName = studentName;
        subjectsList = new ArrayList<Subject>();
        this.studentId = studentNum++;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void addSubjects(String subjectName, int score) {
        subjectsList.add(new Subject(subjectName, score));
    }

    public void showInfo() {
        System.out.print(studentName + " 학생은 ");
        for (Subject subject : subjectsList){
            System.out.print(subject.getSubjectName() + " " + subject.getScore() + "점, ");
        }
        System.out.println("입니다.");
    }

    public void showScoreInfo(){
        int total = 0;
        for (Subject subject : subjectsList){
            total += subject.getScore();
            System.out.println(subject.getSubjectName() + " " + subject.getScore() + "점");
        }

        System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
    }

}
