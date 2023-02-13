package bigch02.ch08;

public class PersonInfo {
    int tall;
    int weight;
    String sex;
    String name;
    int age;

    public PersonInfo(int tall, int weight, String sex, String name, int age) {
        this.tall = tall;
        this.weight = weight;
        this.sex = sex;
        this.name = name;
        this.age = age;
    }

    public String showPersonInfo(){
        return "키가" +tall+ "이고 몸무게가 " +weight+ " 킬로인 " +sex+ "이 있습니다. 이름은 " +name+ " 이고 나이는 " +age+"세입니다.";
    }
}
