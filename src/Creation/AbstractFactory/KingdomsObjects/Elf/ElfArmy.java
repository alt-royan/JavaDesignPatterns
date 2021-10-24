package Creation.AbstractFactory.KingdomsObjects.Elf;

import Creation.AbstractFactory.KingdomsObjects.KingdomsObjects;

public class ElfArmy implements KingdomsObjects.Army {
    static final String DESCRIPTION = "This is the elven Army!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
