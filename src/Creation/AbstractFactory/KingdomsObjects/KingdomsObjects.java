package Creation.AbstractFactory.KingdomsObjects;

public interface KingdomsObjects {
    interface Castle {
        String getDescription();
    }

    interface King {
        String getDescription();
    }

    interface Army {
        String getDescription();
    }
}
