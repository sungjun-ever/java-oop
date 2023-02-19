package bigch02.ch12;

public class Person {
    String name;
    int age;

    public Person() {
        this("no name", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person getPerson() {
        return this;
    }

    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = person.getPerson();
        System.out.println(person2);
    }
}
