package team.envie.fashion.designpattern.template_method;

import team.envie.fashion.designpattern.Logged;

/**
 * Created by shuhe_000 on 2014/10/30.
 */
public class SubtleMethod extends StealingMethod {
    @Override
    protected String pickTarget() {
        return "shop keeper";
    }

    @Override
    protected void confusetarget(String target) {
        Logged.d("Approach the " + target + "with tears running and hug him!");
    }

    @Override
    protected void stealTheItem(String target) {
        Logged.d("While in close contact grab the " + target + "'s wallet.");
    }
}
