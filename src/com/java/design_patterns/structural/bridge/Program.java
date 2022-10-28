package com.java.design_patterns.structural.bridge;

abstract public class Program {
    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
