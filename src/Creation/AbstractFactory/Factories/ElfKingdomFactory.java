package Creation.AbstractFactory.Factories;

import Creation.AbstractFactory.KingdomsObjects.Elf.*;
import Creation.AbstractFactory.KingdomsObjects.KingdomsObjects.*;

public class ElfKingdomFactory implements KingdomFactory {
    public Castle createCastle() {
        return new ElfCastle();
    }
    public King createKing() {
        return new ElfKing();
    }
    public Army createArmy() {
        return new ElfArmy();
    }
}
