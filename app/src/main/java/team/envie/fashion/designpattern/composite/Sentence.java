package team.envie.fashion.designpattern.composite;

import team.envie.fashion.designpattern.Logged;
import java.util.List;

/**
 * Created by shuhe_000 on 2014/11/11.
 */
public class Sentence extends LetterComposite {

    public Sentence(List<Word> wordList) {
        for (Word w : wordList) {
            this.add(w);
        }
    }

    @Override
    protected void printThisBefore() {

    }

    @Override
    protected void printThisAfter() {
        Logged.d(".");
    }
}
