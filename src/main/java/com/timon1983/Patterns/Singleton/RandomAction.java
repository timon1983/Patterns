package main.java.com.timon1983.Patterns.Singleton;

public class RandomAction {

    CurrentState currentState = CurrentState.getCurrentState();


    public void firstAction(){
        currentState.setCount();
    }

    public void secondAction(){
        currentState.setCount();
    }
}
