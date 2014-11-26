package team.envie.fashion.designpattern.template_method;

import team.envie.fashion.designpattern.Logged;

/**
 * Created by shuhe_000 on 2014/10/30.
 */
public class HitAndRunMethod extends StealingMethod {
    @Override
    protected String pickTarget() {
        return "old goblin woman";
    }

    @Override
    protected void confusetarget(String target) {
        Logged.d("Approach the " + target + "from behind");
    }

    @Override
    protected void stealTheItem(String target) {
        Logged.d("Grab the handbag and run away fast!");
    }
}
