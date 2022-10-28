package com.java.design_patterns.creational.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("java");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpeciality(String specialty){

        if(specialty.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        }else if(specialty.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        }else if(specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        }
            throw new RuntimeException((specialty+ " unknown specialty."));
        }
    }
