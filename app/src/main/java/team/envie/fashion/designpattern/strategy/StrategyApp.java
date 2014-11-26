package team.envie.fashion.designpattern.strategy;

import team.envie.fashion.designpattern.Logged;

/**
 * Created by shuhe_000 on 2014/11/03.
 */
public class StrategyApp {

    public StrategyApp() {

        Logged.d("Green dragon spotted ahead!");
        DragonSlayer dragonSlayer = new DragonSlayer(new MeleeStrategy());
        dragonSlayer.goToBattle();

        Logged.d("Red dragon emerges");
        dragonSlayer.changeStrategy(new ProjectileStrategy());
        dragonSlayer.goToBattle();

        Logged.d("Black dragon lands before you.");
        dragonSlayer.changeStrategy(new SpellStrategy());
        dragonSlayer.goToBattle();
    }
}
