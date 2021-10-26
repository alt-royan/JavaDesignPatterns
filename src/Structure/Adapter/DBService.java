package Structure.Adapter;

public class DBService {
    public void doOnInsert(){
        System.out.println("Inserting...");
    }
    public void doOnUpdate(){
        System.out.println("Updating...");
    }
    public void doOnSelect(){
        System.out.println("Selecting...");
    }
    public void doOnRemove(){
        System.out.println("Removing...");
    }

}
