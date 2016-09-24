package com.xyw55.springMVC.service.impl;

import com.xyw55.springMVC.service.IIntroductionService;

/**
 * Created by xiayiwei on 16/9/24.
 */
public class IntroductionService implements IIntroductionService {
    @Override
    public void introduce() {
        System.out.println("======introduce xiaoming.");
    }
}
