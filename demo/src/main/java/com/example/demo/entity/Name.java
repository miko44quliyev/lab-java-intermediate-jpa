package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Name {
    @Column(nullable = false,length = 100)
    private String firstName;

    @Column(nullable = false,length = 100)
    private String middleName;

    @Column(nullable = false,length = 100)
    private String lastName;

    @Column(nullable = false,length = 100)
    private String salutation;

    public Name() {}

    public Name(String firstName, String middleName, String lastName, String salutation) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }
}
