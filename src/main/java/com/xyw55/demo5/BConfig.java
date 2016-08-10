package com.xyw55.demo5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by xiayiwei on 16/8/10.
 */
@Configuration
public class BConfig {

    @Bean(initMethod = "init", destroyMethod = "cleanup")
    @Scope("prototype")
    public SpellChecker spellChecker(){
        return new SpellChecker();
    }
}
