package team.envie.fashion.designpattern.template_method;

/**
 * Created by shuhe_000 on 2014/10/30.
 */
public class TemplateMethodApp {
    public TemplateMethodApp() {
        HalflingThief thief = new HalflingThief(new HitAndRunMethod());
        thief.steal();
        thief.changeMethod(new SubtleMethod());
        thief.steal();
    }
}
