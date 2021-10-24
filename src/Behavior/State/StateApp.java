package Behavior.State;

public class StateApp {
    public static void main(String[] args) {
        Person person =new Person(new Wellfed());
        person.reportState();
        person.timePassed();
        person.reportState();
        person.eat();
        person.reportState();
    }
}
