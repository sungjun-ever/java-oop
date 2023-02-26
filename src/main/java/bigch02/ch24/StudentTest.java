package bigch02.ch24;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student("Lee");
        Student studentKim = new Student("kim");

        studentLee.addSubjects("국어", 100);
        studentLee.addSubjects("수학", 50);

        System.out.println(studentLee.getStudentId());
        studentLee.showScoreInfo();

        studentKim.addSubjects("국어", 70);
        studentKim.addSubjects("수학", 85);
        studentKim.addSubjects("영어", 100);

        System.out.println(studentKim.getStudentId());
        studentKim.showScoreInfo();
    }
}
