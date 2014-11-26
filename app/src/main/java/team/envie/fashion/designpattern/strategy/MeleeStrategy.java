package team.envie.fashion.designpattern.strategy;

import team.envie.fashion.designpattern.Logged;

/**
 * Created by shuhe_000 on 2014/11/03.
 */
public class MeleeStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        Logged.d("With you Excalibur you severe the dragons head!");
    }
}
