package team.envie.fashion.designpattern.composite;

import java.util.List;

import team.envie.fashion.designpattern.Logged;

/**
 * Created by shuhe_000 on 2014/11/11.
 */
public class Word extends LetterComposite {

    public Word(List<Letter> letters) {
        for (Letter l : letters) {
            this.add(l);
        }
    }

    @Override
    protected void printThisBefore() {
        Logged.d(" ");
    }

    @Override
    protected void printThisAfter() {

    }
}
