package main.java.com.timon1983.Patterns.Prototype;

public class PersonFactory {
    Person person;

    public PersonFactory(Person person) {
        this.person = person;
    }

    Person getClonePerson(){
        return (Person)person.clone();
    }
}
