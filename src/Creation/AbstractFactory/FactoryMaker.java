package Creation.AbstractFactory;

import Creation.AbstractFactory.Factories.*;
import Creation.AbstractFactory.KingdomsObjects.KingdomsObjects.*;

public class FactoryMaker {

    public enum KingdomType {
        ELF, ORC
    }

    public static KingdomFactory makeFactory(KingdomType type) {
        switch (type) {
            case ELF:
                return new ElfKingdomFactory();
            case ORC:
                return new OrcKingdomFactory();
            default:
                throw new IllegalArgumentException("KingdomType not supported.");
        }
    }

    public static void main(String[] args) {
        KingdomFactory factory =FactoryMaker.makeFactory(KingdomType.ELF);
        Army army =factory.createArmy();
        Castle castle =factory.createCastle();
        King king =factory.createKing();
        System.out.println(castle.getDescription());
        System.out.println(king.getDescription());
        System.out.println(army.getDescription());

        System.out.println();

        factory =FactoryMaker.makeFactory(KingdomType.ORC);
        army =factory.createArmy();
        castle =factory.createCastle();
        king =factory.createKing();
        System.out.println(castle.getDescription());
        System.out.println(king.getDescription());
        System.out.println(army.getDescription());

    }
}
