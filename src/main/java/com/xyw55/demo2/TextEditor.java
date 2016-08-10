package com.xyw55.demo2;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by xiayiwei on 16/8/9.
 */
public class TextEditor {
    private SpellChecker spellChecker;
    private List list;
    private Set set;
    private Map map;

    public TextEditor() {
    }

    //    public TextEditor(SpellChecker spellChecker) {
//        System.out.println("in text editor constructor");
//        this.spellChecker = spellChecker;
//
//
//    }

    //通过setter进行注入
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void spellCheck() {
        spellChecker.checkspelling();
    }

}
