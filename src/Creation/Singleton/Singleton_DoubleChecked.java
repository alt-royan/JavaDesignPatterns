package Creation.Singleton;

public class Singleton_DoubleChecked {
    private static volatile Singleton_DoubleChecked instance;

    public static Singleton_DoubleChecked getInstance() {
        Singleton_DoubleChecked localInstance = instance;
        if (localInstance == null) {
            synchronized (Singleton_DoubleChecked.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Singleton_DoubleChecked();
                }
            }
        }
        return localInstance;
    }
}