package Behavior.State;

public class Person {

    private State state;

    public Person(State state) {
        this.state = state;
    }

    public void timePassed(){
        System.out.println("Any time passed");
        if(state instanceof Wellfed){
            state=new Hungry();
        }
    }

    public void eat(){
        System.out.println("I have eaten");
        if(state instanceof Hungry){
            state=new Wellfed();
        }
    }

    public void reportState(){
        state.reportState();
    }
}
