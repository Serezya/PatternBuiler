package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        System.out.printf("У %s есть сын, %s%n", mom, son);

        try {
            new PersonBuilder().build();
        } catch (
                IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            new PersonBuilder().setAge(-100).build();
        } catch (
                IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
