package team.envie.fashion.designpattern.strategy;

import team.envie.fashion.designpattern.Logged;

/**
 * Created by shuhe_000 on 2014/11/03.
 */
public class SpellStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        Logged.d("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!");
    }
}
