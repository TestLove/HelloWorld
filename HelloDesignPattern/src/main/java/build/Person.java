package build;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/14 20:44
 * @Description: null
 */
public class Person {
    String name;
    String school;
    int motherAge;
    int age;
     Person(PersonBuilder personBuilder){
        name = personBuilder.name;
        school = personBuilder.school;
        motherAge = personBuilder.motherAge;
        age = personBuilder.age;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", motherAge=" + motherAge +
                ", age=" + age +
                '}';
    }
}
class PersonBuilder{
    String name;
    String school;
    int motherAge;
    int age;
    //在这个方法里进行逻辑判断与参数校验
    public Person build(){
        return new Person(this);

    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder  setSchool(String school) {
        this.school = school;
        return this;
    }

    public PersonBuilder  setMotherAge(int motherAge) {
        this.motherAge = motherAge;
        return this;
    }

    public PersonBuilder  setAge(int age) {
        this.age = age;
        return this;
    }
}
