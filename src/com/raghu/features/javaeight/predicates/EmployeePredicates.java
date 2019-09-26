package com.raghu.features.javaeight.predicates;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class EmployeePredicates {
    static Predicate<Employee> isAdultMale() {
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
    }

    static Predicate<Employee> isAdultFemale() {
        return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
    }

    static Predicate<Employee> isAgeMoreThan(Integer age) {
        return p -> p.getAge() > age;
    }

    static List<Employee> filterEmployees(List<Employee> employees,
                                                 Predicate<Employee> predicate) {
        return employees.stream().filter(predicate).collect(Collectors.toList());
    }
}

