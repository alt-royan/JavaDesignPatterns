package Creation.AbstractFactory.KingdomsObjects.Orc;

import Creation.AbstractFactory.KingdomsObjects.KingdomsObjects;

public class OrcKing implements KingdomsObjects.King {
    static final String DESCRIPTION = "This is the orc king!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
