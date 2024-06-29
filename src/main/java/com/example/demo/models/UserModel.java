package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class UserModel {

    @Id
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String university;
    private int age;
    private String phoneNumber;
    private String location;
    private String major;
    private String password;

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getUniversity() { return university; }
    public int getAge() { return age; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getLocation() { return location; }
    public String getMajor() { return major; }
    public String getPassword() { return password; }

    // Setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setEmail(String email) { this.email = email; }
    public void setUniversity(String university) { this.university = university; }
    public void setAge(int age) { this.age = age; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setLocation(String location) { this.location = location; }
    public void setMajor(String major) { this.major = major; }
    public void setPassword(String password) { this.password = password; }


    public void setId(Long id) {this.id = id;}
    public Long getId() {return id;}
}

