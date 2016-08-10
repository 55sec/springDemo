package com.xyw55.demo5;

/**
 * Created by xiayiwei on 16/8/10.
 */
public class TextEditor {
    private String message;
    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        System.out.println("textEditor init ...");
        this.spellChecker = spellChecker;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
