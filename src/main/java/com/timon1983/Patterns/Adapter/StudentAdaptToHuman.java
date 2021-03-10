package main.java.com.timon1983.Patterns.Adapter;

public class StudentAdaptToHuman extends Student implements Human{

    @Override
    public void isStudying() {
        StudyInCollege();
    }

    @Override
    public void resting() {
        RestAfterStudy();
    }

    @Override
    public void doWork() {
        Working();
    }

    @Override
    public void sleeping() {
        Sleeping();
    }
}
