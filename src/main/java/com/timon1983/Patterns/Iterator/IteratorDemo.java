package main.java.com.timon1983.Patterns.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        String [] workSkills = {"Mason", "Roofer", "Electrician", "Plumber"};
        Worker worker = new Worker(workSkills);

        Iterator iterator = worker.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
