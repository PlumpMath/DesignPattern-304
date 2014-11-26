package team.envie.fashion.designpattern.abstract_factory;

/**
 * Created by shuhe_000 on 2014/10/29.
 */
public class ElfKingdomFactory implements KingdomFactory {

    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }

    @Override
    public Army createArmy() {
        return new ElfArmy();
    }
}
