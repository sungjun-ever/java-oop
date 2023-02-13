package bigch02.ch06;

public class Student {
    public int studentNumber;
    public String studentName;
    public int grade;

    public Student() {} //디폴트 생성자는 생성자가 하나도 없을 경우에 만들어진다.

    public Student(int studentNumber, String studentName, int grade){
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }
    public String showStudentInfo(){
        return studentName + "학생의 학번은 " + studentNumber + "이고 " + grade + "학년 입니다.";
    }
}
