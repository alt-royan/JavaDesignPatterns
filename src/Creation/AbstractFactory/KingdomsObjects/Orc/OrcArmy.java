package Creation.AbstractFactory.KingdomsObjects.Orc;

import Creation.AbstractFactory.KingdomsObjects.KingdomsObjects;

public class OrcArmy implements KingdomsObjects.Army {
    static final String DESCRIPTION = "This is the orc Army!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
