package team.envie.fashion.designpattern.composite;

import team.envie.fashion.designpattern.Logged;

/**
 * Created by shuhe_000 on 2014/11/11.
 */
public class CompositeApp {

    public CompositeApp() {
        LetterComposite orcMessage = new Messenger().messageFromOrcs();
        orcMessage.print();

        LetterComposite elfMessage = new Messenger().messageFromElves();
        elfMessage.print();
    }
}
