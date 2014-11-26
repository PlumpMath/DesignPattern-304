package team.envie.fashion.designpattern.adapter;

/**
 * Created by shuhe_000 on 2014/10/28.
 *
 * GnomeEngineerのラッパークラス
 */
public class GnomeEngineeringManager implements Engineer {

    private Engineer engineer;

    /**
     * コンストラクタでGnomeEngineerの振舞を取得
     */
    public GnomeEngineeringManager() {
        engineer = new GnomeEngineer();
    }

    /**
     * GnomeEngineerのoperateDeviceを使用して
     * さらに拡張できる
     */
    @Override
    public void operateDevice() {
        engineer.operateDevice();
        /**
         * 拡張を自由に
         */
    }
}
