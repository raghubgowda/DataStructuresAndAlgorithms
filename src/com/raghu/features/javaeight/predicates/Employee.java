package com.raghu.features.javaeight.predicates;

public class Employee {

    Employee(Integer id, Integer age, String gender, String firstName, String lastName) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    Integer getAge() {
        return age;
    }

    private Integer id;
    private Integer age;
    private String firstName;
    private String lastName;

    String getGender() {
        return gender;
    }

    private String gender;

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " - " + this.gender + this.age.toString();
    }
}
