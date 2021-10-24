package Creation.AbstractFactory.Factories;

import Creation.AbstractFactory.KingdomsObjects.KingdomsObjects.*;


public interface KingdomFactory {
    Castle createCastle();
    King createKing();
    Army createArmy();
}
