package Creation.AbstractFactory.KingdomsObjects.Orc;

import Creation.AbstractFactory.KingdomsObjects.KingdomsObjects;

public class OrcCastle implements KingdomsObjects.Castle {
    static final String DESCRIPTION = "This is the orc castle!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
