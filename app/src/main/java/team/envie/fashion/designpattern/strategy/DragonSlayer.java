package team.envie.fashion.designpattern.strategy;

/**
 * Created by shuhe_000 on 2014/11/03.
 */
public class DragonSlayer {

    private DragonSlayingStrategy strategy;

    /**
     * コンストラクタ
     * @param strategy
     */
    public DragonSlayer(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 戦略を切り替える
     * @param strategy
     */
    public void changeStrategy(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 切り替えた戦略を実行する
     */
    public void goToBattle() {
        strategy.execute();
    }
}
