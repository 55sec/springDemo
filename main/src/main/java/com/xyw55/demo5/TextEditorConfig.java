package com.xyw55.demo5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by xiayiwei on 16/8/10.
 * 带有 @Configuration 的注解类表示这个类可以使用 Spring IoC 容器作为 bean 定义的来源。
 * 而@Bean 注解告诉 Spring，一个带有 @Bean 的注解方法将返回一个对象，该对象应该被注册为在 Spring 应用程序上下文中的 bean。
 * @Import会导入BConfig.class 当实例化上下文时，不需要同时指定 TextEditorConfig.class 和 ConfigB.class，只有 TextEditorConfig 类需要提供
 */
@Configuration
@Import(BConfig.class)
public class TextEditorConfig {
    @Bean
    public TextEditor textEditor(){
        return new TextEditor(new SpellChecker());
    }

}
