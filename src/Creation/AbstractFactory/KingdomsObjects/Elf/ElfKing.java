package Creation.AbstractFactory.KingdomsObjects.Elf;

import Creation.AbstractFactory.KingdomsObjects.KingdomsObjects;

public class ElfKing implements KingdomsObjects.King {
    static final String DESCRIPTION = "This is the elven king!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}