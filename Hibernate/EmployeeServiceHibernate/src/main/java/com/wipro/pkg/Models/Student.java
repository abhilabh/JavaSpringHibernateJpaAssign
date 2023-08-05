package com.wipro.pkg.Models;



import javax.persistence.*;



@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype", discriminatorType = DiscriminatorType.STRING)

public class Student {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    private String studentClass;

    public Student() {

        super();

        // TODO Auto-generated constructor stub

    }

    public Student(Long id, String name, String studentClass) {

        super();

        this.id = id;

        this.name = name;

        this.studentClass = studentClass;

    }

    public Long getId() {

        return id;

    }

    public void setId(Long id) {

        this.id = id;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getStudentClass() {

        return studentClass;

    }

    public void setStudentClass(String studentClass) {

        this.studentClass = studentClass;

    }

    @Override

    public String toString() {

        return "Student [id=" + id + ", name=" + name + ", studentClass=" + studentClass + "]";

    }





}

