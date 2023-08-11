package com.restapiexample.dummy.testing.models;

public class Employeer {

    String name,salary,age,id;

    public Employeer(String name, String salary, String age, String id) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSalary() {
        return salary;
    }

    public String getAge() {
        return age;
    }

    public String getId() {
        return id;
    }
}
