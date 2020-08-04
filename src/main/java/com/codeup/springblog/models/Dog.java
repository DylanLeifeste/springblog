package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
@Table(name = "dogs")
public class Dog {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT(11) UNSIGNED")
    private int id;

    @Column(columnDefinition = "TINYINT(3) UNSIGNED NOT NULL", unique = true)
    private int age;

    @Column(length = 200, nullable = false)
    private String name;

    @Column(length = 2, columnDefinition = "CHAR(2) DEFAULT 'XX'")
    private String resideState;

    public Dog() {
    }

    public Dog(int id, int age, String name, String resideState) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.resideState = resideState;
    }

    public long getId(){
        return id;
    }

    public long getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getResideState(){
        return resideState;
    }

}
