package Creation.AbstractFactory.Factories;

import Creation.AbstractFactory.KingdomsObjects.KingdomsObjects.*;
import Creation.AbstractFactory.KingdomsObjects.Orc.*;

public class OrcKingdomFactory implements KingdomFactory {
    public Castle createCastle() {
        return new OrcCastle();
    }
    public King createKing() {
        return new OrcKing();
    }
    public Army createArmy() {
        return new OrcArmy();
    }
}
