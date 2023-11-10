package com.enset.templatePattern.template;

public abstract class Template {
    public Template() {
    }

    public void operation() {
        partie1();
        partie2();
    }
    protected abstract void partie1();
    protected abstract void partie2();
}
