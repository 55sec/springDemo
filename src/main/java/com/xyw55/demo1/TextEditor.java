package com.xyw55.demo1;

/**
 * Created by xiayiwei on 16/8/9.
 */
public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        System.out.println("in text editor constructor");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkspelling();
    }

}
