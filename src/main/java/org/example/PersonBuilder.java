package org.example;

public class PersonBuilder implements IPersonBuilder{
    protected String name;
    protected String surname;
    protected int age;
    protected String town;

    @Override
    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    @Override
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }
    @Override
    public PersonBuilder setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Некорректный возраст человека");
        this.age = age;
        return this;
    }
    @Override
    public PersonBuilder setAddress(String address) {
        this.town = address;
        return this;
    }

    public Person build() {
        Person person;
        if (surname == null || name == null)
            throw new IllegalStateException("Ошибка в имени или фамилии человека");
        if (age >= 0) {
            person = new Person(name, surname, age);
        } else {
            person = new Person(name, surname);
        }
        person.setAddress(town);
        return person;
    }
}
