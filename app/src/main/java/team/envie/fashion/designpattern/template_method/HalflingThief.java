package team.envie.fashion.designpattern.template_method;

/**
 * Created by shuhe_000 on 2014/10/30.
 */
public class HalflingThief {

    private StealingMethod method;

    public HalflingThief(StealingMethod method) {
        this.method = method;
    }

    public void steal() {
        method.steal();
    }

    public void changeMethod(StealingMethod method) {
        this.method = method;
    }
}
