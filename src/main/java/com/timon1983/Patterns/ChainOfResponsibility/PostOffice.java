package main.java.com.timon1983.Patterns.ChainOfResponsibility;

public abstract class PostOffice {

    PostOffice nextPostOffice;

    void setPostOffice(PostOffice postOffice){
        nextPostOffice = postOffice;
    }

    void mailOperation(){
        printMassage();
        if(nextPostOffice != null){
            nextPostOffice.mailOperation();
        }
    }
    abstract void printMassage();
}
