package com.xyw55.demo5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by xiayiwei on 16/8/10.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(TextEditorConfig.class);
        TextEditor textEditor = ctx.getBean(TextEditor.class);
        SpellChecker spellChecker = ctx.getBean(SpellChecker.class);

    }
}
