package com.github.clucle.docker_spring_mysql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + this.firstName + ", lastName=" + this.lastName
                + "]";
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }
}
