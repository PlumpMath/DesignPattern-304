package team.envie.fashion.designpattern.strategy;

import team.envie.fashion.designpattern.Logged;

/**
 * Created by shuhe_000 on 2014/11/03.
 */
public class ProjectileStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        Logged.d("You shoot the dragon with the magical crossbow and it falls dead on the ground!");
    }
}
