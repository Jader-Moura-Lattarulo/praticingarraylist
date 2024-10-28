package br.com.alura.models;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Nome= " + name + ", Idade= " + age + "\n" ;
    }
}
