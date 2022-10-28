package com.java.design_patterns.creational.factory;

public class CppDeveloperFactory implements DeveloperFactory
{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
