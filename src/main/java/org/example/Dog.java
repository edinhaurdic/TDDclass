package org.example;

import javax.print.DocFlavor;
import java.util.Objects;

public class Dog {

    private int age;
    private String name;

    public Dog(int age, String name) {
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return getAge() == dog.getAge() && Objects.equals(getName(), dog.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName());
    }
}
