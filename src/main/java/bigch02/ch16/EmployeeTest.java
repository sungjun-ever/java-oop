package bigch02.ch16;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployeeName("임성준");

        Employee employee1 = new Employee();
        employee1.setEmployeeName("홍길동");

        System.out.println(employee.getEmployeeId());
        System.out.println(employee1.getEmployeeId());
    }
}
