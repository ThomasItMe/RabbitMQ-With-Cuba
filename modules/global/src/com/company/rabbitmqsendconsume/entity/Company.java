package com.company.rabbitmqsendconsume.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "RABBITMQSENDCONSUME_COMPANY")
@Entity(name = "rabbitmqsendconsume_Company")
@NamePattern("%s|name")
public class Company extends StandardEntity {
    private static final long serialVersionUID = 2959875054673251219L;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SIZE_")
    private Integer age;

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

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}