package team.envie.fashion.designpattern.adapter;

/**
 * Created by shuhe_000 on 2014/10/28.
 *
 * 既存クラス
 * このクラスを変更したいが、変更すると他クラスに影響もでる可能性があるため
 * 別クラスでラップしてやる
 */
public class GnomeEngineer implements Engineer {

    private GoblinGlider glider;

    public GnomeEngineer() {
        glider = new GoblinGlider();
    }

    @Override
    public void operateDevice() {
        glider.attachGlider();
        glider.gainSpeed();
        glider.takeOff();
    }
}
