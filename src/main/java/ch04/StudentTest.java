package ch04;

public class StudentTest {
    public static void main(String[] args){
        Student student = new Student();
        student.setStudentName("임성준");
        System.out.println(student.getStudentName());
        student.setStudentID(201413107);
        System.out.println(student.getStudentID());
        student.setAddress("경기도 의왕시");
        System.out.println(student.getAddress());
        student.showStudentInfo();
    }
}
