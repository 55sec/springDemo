package com.xyw55.demo4;

/**
 * Created by xiayiwei on 16/8/9.
 */
public class SpellChecker {

    String flag = "";

    public SpellChecker() {
        System.out.println("in spellchecker constructor");

    }

    public void checkspelling() {
        System.out.println("checkspelling..." + flag);
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
