package com.java.design_patterns.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https:www.github.com/name/realProject");

        project.run();
    }
}
