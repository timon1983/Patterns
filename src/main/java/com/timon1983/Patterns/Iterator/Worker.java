package main.java.com.timon1983.Patterns.Iterator;

public class Worker implements Collection{

    String [] workSkills;

    public Worker(String[] workSkills) {
        this.workSkills = workSkills;
    }

    @Override
    public Iterator getIterator() {
        return new WorkerIterator();
    }

    public class WorkerIterator implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            if (index < workSkills.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return workSkills[index++];
        }
    }
}
