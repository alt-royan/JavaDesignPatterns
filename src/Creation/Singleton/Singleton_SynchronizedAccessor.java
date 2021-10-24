package Creation.Singleton;

public class Singleton_SynchronizedAccessor {
    private static Singleton_SynchronizedAccessor instance;

    public static synchronized Singleton_SynchronizedAccessor getInstance() {
        if (instance == null) {
            instance = new Singleton_SynchronizedAccessor();
        }
        return instance;
    }
}
