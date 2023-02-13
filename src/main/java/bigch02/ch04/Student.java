package bigch02.ch04;

public class Student {
    public int studentID;
    public String studentName;
    public String address;

    public void showStudentInfo(){
        System.out.println(studentID + "학번의 이름은 " + studentName + "이고, 주소는 " + address + " 입니다.");
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        this.studentName = name;
    }

    public int getStudentID(){
        return studentID;
    }

    public void setStudentID(int id){
        this.studentID = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
