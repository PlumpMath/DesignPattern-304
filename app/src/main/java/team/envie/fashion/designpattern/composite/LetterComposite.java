package team.envie.fashion.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shuhe_000 on 2014/11/11.
 */
public abstract class LetterComposite {

    List<LetterComposite> children = new ArrayList<LetterComposite>();

    public void add(LetterComposite letter) {
        children.add(letter);
    }

    public int count() {
        return children.size();
    }

    protected abstract void printThisBefore();
    protected abstract void printThisAfter();

    public void print() {
        printThisBefore();
        for (LetterComposite letterComposite : children) {
            letterComposite.print();
        }
        printThisAfter();
    }

}
