package Behavior.State;


public class Hungry implements State {
    @Override
    public void reportState() {
        System.out.println("I'm hungry");
    }
}
