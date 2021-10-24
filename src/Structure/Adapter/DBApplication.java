package Structure.Adapter;

public class DBApplication {
    public static void main(String[] args) {
        Database database=new DatabaseAdapter();

        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
