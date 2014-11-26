package team.envie.fashion.designpattern.composite;


import team.envie.fashion.designpattern.Logged;

/**
 * Created by shuhe_000 on 2014/11/11.
 */
public class Letter extends LetterComposite {

    private char c;

    public Letter(char c) {
        this.c = c;
    }

    @Override
    protected void printThisBefore() {
        Logged.d("c");
    }

    @Override
    protected void printThisAfter() {

    }
}
