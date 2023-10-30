package com.example.ATM.model;

import jakarta.persistence.*;

@Entity
@Table(name = "account_holder")
public class AccountHolder {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;


    @OneToOne(mappedBy = "accountHolder", cascade = CascadeType.ALL)
    private User user;

    public AccountHolder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public AccountHolder() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
