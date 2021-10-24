package Structure.Adapter;

public class DatabaseAdapter extends DBService implements Database {
    @Override
    public void insert() {
        doOnInsert();
    }

    @Override
    public void update() {
        doOnUpdate();
    }

    @Override
    public void select() {
        doOnSelect();
    }

    @Override
    public void remove() {
        doOnRemove();
    }
}
