package org.example;

public interface IPersonBuilder {
    Person build();
    PersonBuilder setName(String name);
    PersonBuilder setSurname(String surname);
    PersonBuilder setAge(int age);
    PersonBuilder setAddress(String address);
}
