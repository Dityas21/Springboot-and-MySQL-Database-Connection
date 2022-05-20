/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name="categories")
/**
 *
 * @author HP
 */
public class Category {
    @Id
    @GeneratedValue
    public Integer id;

    @Column(nullable = false)
    public String name;
}
