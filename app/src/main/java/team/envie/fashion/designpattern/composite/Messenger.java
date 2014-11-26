package team.envie.fashion.designpattern.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by shuhe_000 on 2014/11/11.
 */
public class Messenger {

    LetterComposite messageFromOrcs() {
        List<Word> words = new ArrayList<Word>();
        words.add(new Word(Arrays.asList(new Letter('W'), new Letter('h'),new Letter('e'),new Letter('r'),new Letter('e'))));
        return new Sentence(words);
    }

    LetterComposite messageFromElves() {
        List<Word> words = new ArrayList<Word>();
        words.add(new Word(Arrays.asList(new Letter('w'), new Letter('i'),new Letter('n'),new Letter('d'),new Letter('s'))));
        return  new Sentence(words);
    }
}
