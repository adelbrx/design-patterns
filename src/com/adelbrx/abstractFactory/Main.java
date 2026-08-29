package com.adelbrx.abstractFactory;

import com.adelbrx.abstractFactory.app.ContactForm;
import com.adelbrx.abstractFactory.material.MaterialWidgetFactory;

public class Main {
    static void main(String[] args) {
        new ContactForm().render(new MaterialWidgetFactory());
    }
}
