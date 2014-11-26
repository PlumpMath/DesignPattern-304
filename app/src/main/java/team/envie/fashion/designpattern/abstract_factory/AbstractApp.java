package team.envie.fashion.designpattern.abstract_factory;

/**
 * Created by shuhe_000 on 2014/10/29.
 */
public class AbstractApp {

    public AbstractApp() {
        createKingdom(new ElfKingdomFactory());
        createKingdom(new OrcKingdomFactory());
    }

    public static void createKingdom(KingdomFactory factory) {
        King king = factory.createKing();
        Castle castle = factory.createCastle();
        Army army = factory.createArmy();
    }
}
