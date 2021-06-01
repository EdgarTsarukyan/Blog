package addPortal.model;

import java.util.Objects;

public class User {
    private String name;
    private String surNAme;
    private String gender;
    private int age;
    private String phonNumber;
    private String password;

    public User() {
    }

    public User(String name, String surNAme, String gender, int age, String phonNumber, String password) {
        this.name = name;
        this.surNAme = surNAme;
        this.gender = gender;
        this.age = age;
        this.phonNumber = phonNumber;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurNAme() {
        return surNAme;
    }

    public void setSurNAme(String surNAme) {
        this.surNAme = surNAme;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhonNumber() {
        return phonNumber;
    }

    public void setPhonNumber(String phonNumber) {
        this.phonNumber = phonNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(surNAme, user.surNAme) && Objects.equals(gender, user.gender) && Objects.equals(phonNumber, user.phonNumber) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surNAme, gender, age, phonNumber, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surNAme='" + surNAme + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", phonNumber='" + phonNumber + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
