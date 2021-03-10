package main.java.com.timon1983.Patterns.Singleton;

public class ChangeCurrentState {
    public static void main(String[] args) {
        RandomAction randomAction = new RandomAction();
        CurrentState currentState1 = CurrentState.getCurrentState();
        for(int i = 0; i < 10 ; i++){
            randomAction.firstAction();
        }

        System.out.println(currentState1.getCount());

        CurrentState currentState2 = CurrentState.getCurrentState();
        for(int i = 0; i < 5 ; i++){
            randomAction.secondAction();
        }

        System.out.println(currentState2.getCount());
    }
}
