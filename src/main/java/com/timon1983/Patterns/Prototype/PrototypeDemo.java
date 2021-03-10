package main.java.com.timon1983.Patterns.Prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Person man = new Person("Mark", 24, true);
        System.out.println(man);

        PersonFactory personFactory = new PersonFactory(man);
        Person manClone = personFactory.getClonePerson();
        System.out.println(manClone);
    }
}
