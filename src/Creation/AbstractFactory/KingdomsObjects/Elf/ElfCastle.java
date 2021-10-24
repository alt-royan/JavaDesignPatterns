package Creation.AbstractFactory.KingdomsObjects.Elf;

import Creation.AbstractFactory.KingdomsObjects.KingdomsObjects;

public class ElfCastle implements KingdomsObjects.Castle {
    static final String DESCRIPTION = "This is the elven castle!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
