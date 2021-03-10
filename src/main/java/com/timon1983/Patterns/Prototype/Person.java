package main.java.com.timon1983.Patterns.Prototype;

public class Person implements Cloner{
    String name;
    int age;
    boolean isAdult;

    public Person(String name, int age, boolean isAdult) {
        this.name = name;
        this.age = age;
        this.isAdult = isAdult;
    }

    @Override
    public Object clone() {
        Person person = new Person(name , age , isAdult);
        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isAdult=" + isAdult +
                '}';
    }
}
