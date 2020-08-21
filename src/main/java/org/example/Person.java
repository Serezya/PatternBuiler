package org.example;

import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String town;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        }

    public boolean hasAge() {
        return this.age > 0;
    }

    public boolean hasAddress() {
        return this.town != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return town;
    }

    public void setAddress(String address) {
        this.town = address;
    }

    public void happyBirthday() {
        this.age += 1;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", town='" + town + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(town, person.town);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, town);
    }
    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname("Киндер")
                .setAge(5)
                .setAddress(town);
    }
}
