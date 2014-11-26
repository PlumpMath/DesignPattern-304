package team.envie.fashion.designpattern.adapter;

/**
 * Adapter Pattern
 *
 * Adapterパターンでは、既存のクラスを変更するのではなく、一枚皮をかぶせるようなクラスを作ります。このクラスに必要となるメソッドや機能を実装します。
 * こうすることで、既存のクラスを一切変更することなく、新しいAPIとして提供することができます。この皮を被せることで既存のクラスを包み込んでいる様子から、
 * Wrapper（ラッパー）パターンと呼ばれることもあります。
 */
public class AdapterApp {

    public AdapterApp() {
        GnomeEngineeringManager manager = new GnomeEngineeringManager();
        manager.operateDevice();
    }
}
