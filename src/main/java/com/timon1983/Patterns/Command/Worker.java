package main.java.com.timon1983.Patterns.Command;

public class Worker {
    Work builder;
    Work checker;
    Work projecter;

    public Worker(Work builder, Work checker, Work projecter) {
        this.builder = builder;
        this.checker = checker;
        this.projecter = projecter;
    }

    void doBuild(){
        builder.doWork();
    }

    void doCheck(){
        checker.doWork();
    }

    void doProject(){
        projecter.doWork();
    }
}
