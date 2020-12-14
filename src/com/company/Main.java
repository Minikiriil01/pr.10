package com.company;

public class Main {
    public static void main(String[] args) {
        ConcreteFactory cf = new ConcreteFactory();
        cf.createComplex();
        cf.CreateComplex(-23, 34);
        System.out.println(cf.toString());
    }
}