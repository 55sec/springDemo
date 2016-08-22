package com.xyw55.demo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by xiayiwei on 16/8/9.
 */
public class TextEditor {
    //注入方式一
//    @Autowired
//    @Qualifier("spellChecker")//当相同对象时,通过这饿可以注入不同的实例,类似guice的Named注入
    @Resource(name = "spellChecker2") // Resource注入 name 通过byName相连,如果没有明确地指定一个 ‘name’，默认名称源于字段名或者 setter 方法。在字段的情况下，它使用的是字段名；在一个 setter 方法情况下，它使用的是 bean 属性名称。
    private SpellChecker spellChecker;
    private List list;
    private Set set;
    private Map map;

    public TextEditor() {
    }
    //注入方式三
//    @Autowired(required = true)
//    public TextEditor(SpellChecker spellChecker) {
//        System.out.println("spell checker constructor");
//        this.spellChecker = spellChecker;
//    }

    //    public TextEditor(SpellChecker spellChecker) {
//        System.out.println("in text editor constructor");
//        this.spellChecker = spellChecker;
//
//
//    }

    //通过setter进行注入
    //注入方式二
//    @Autowired
//    public void setSpellChecker(SpellChecker spellChecker) {
//        this.spellChecker = spellChecker;
//    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    @Required //表示必须注入的属性
    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    //    @Required
    public void setMap(Map map) {
        this.map = map;
    }

    public void spellCheck() {
        spellChecker.checkspelling();
    }

}
