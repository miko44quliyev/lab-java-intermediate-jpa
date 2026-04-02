package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "firstName", column = @Column(name = "contact_first_name")),
            @AttributeOverride(name = "middleName", column = @Column(name = "contact_middle_name")),
            @AttributeOverride(name = "lastName", column = @Column(name = "contact_last_name")),
            @AttributeOverride(name = "salutation", column = @Column(name = "contact_salutation"))
    })
    private Name name;

    @Column(nullable = false,length = 100)
    private String title;

    @Column(nullable = false,length = 100)
    private String company;

    public Contact(Name name, String title, String company) {
        this.name = name;
        this.title = title;
        this.company = company;
    }
    public Contact() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
