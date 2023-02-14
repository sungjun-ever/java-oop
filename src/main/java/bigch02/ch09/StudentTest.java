package bigch02.ch09;

public class StudentTest {
    public static void main(String[] args){
        Student student = new Student("임성준", 201413107);
        student.setKoreaSubject("국어", 100);
        student.setMathSubject("수학", 100);
        student.showScoreInfo();
    }
}
