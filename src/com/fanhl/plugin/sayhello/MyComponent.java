package com.fanhl.plugin.sayhello;

import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

/**
 * date 2017/11/01
 *
 * @author fanhl
 */
public class MyComponent implements ApplicationComponent {
    public MyComponent() {
    }

    @Override
    public void initComponent() {
        // TODO: insert component initialization logic here
    }

    @Override
    public void disposeComponent() {
        // TODO: insert component disposal logic here
    }

    @Override
    @NotNull
    public String getComponentName() {
        return "MyComponent";
    }

    public void sayHello() {
        // Show dialog with message
        Messages.showMessageDialog(
                "Hello World! by 麟麟麟麟麟麟麟",
                "Sample",
                Messages.getInformationIcon()
        );
    }
}
