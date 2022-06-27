package com.employeemanagement.example.employeemanagement.models;



import javax.persistence.*;

@Entity
@Table(name="employeemanager")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;


    @Column(name="name")
    private String name;
    @Column(name="age")
    private Integer age;
    @Column(name="employeeNumber")
    private Integer employeeNumber;
    @Column(name="email")
    private String email;

    public Employee() {
    }

    public Employee(String name, Integer age, Integer employeeNumber, String email) {
        this.name = name;
        this.age = age;
        this.employeeNumber = employeeNumber;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
