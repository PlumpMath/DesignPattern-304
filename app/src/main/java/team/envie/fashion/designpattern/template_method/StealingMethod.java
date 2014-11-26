package team.envie.fashion.designpattern.template_method;

import team.envie.fashion.designpattern.Logged;

/**
 * Created by shuhe_000 on 2014/10/30.
 */
public abstract class StealingMethod {

    protected abstract String pickTarget();

    protected abstract void confusetarget(String target);

    protected abstract void stealTheItem(String target);

    public void steal() {
        String target = pickTarget();
        Logged.d("The target has been chosen as " + target + ".");
        confusetarget(target);
        stealTheItem(target);
    }
}
