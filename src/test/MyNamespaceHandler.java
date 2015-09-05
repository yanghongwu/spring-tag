package test;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by qyhw on 9/4/15.
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("people", new PeopleBeanDefinitionParser());
    }
}
