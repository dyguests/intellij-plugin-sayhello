package com.fanhl.plugin.sayhello;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;

/**
 * date 2017/11/01
 *
 * @author fanhl
 */
public class SayHelloAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Application application = ApplicationManager.getApplication();
        MyComponent myComponent = application.getComponent(MyComponent.class);
        myComponent.sayHello();
    }
}
