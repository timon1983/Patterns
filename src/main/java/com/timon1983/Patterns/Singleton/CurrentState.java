package main.java.com.timon1983.Patterns.Singleton;

public class CurrentState {
    private static CurrentState currentState;
    private static int count = 0;

    public static CurrentState getCurrentState(){
        if (currentState == null){
            currentState = new CurrentState();
        }
        return currentState;
    }

    private CurrentState(){}

    public void setCount(){
        count++;
    }

    public int getCount(){
        return count;
    }
}
