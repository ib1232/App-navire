package com.app.App.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Ship implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nom;
    private String post;
    private String terminal;
    private String grue;
    private String engin;
    private String equipe;

    public Ship() {}

    public Ship(String nom, String post, String terminal, String grue, String engin, String equipe) {
        this.nom = nom;
        this.post = post;
        this.terminal = terminal;
        this.grue = grue;
        this.engin = engin;
        this.equipe = equipe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getGrue() {
        return grue;
    }

    public void setGrue(String grue) {
        this.grue = grue;
    }

    public String getEngin() {
        return engin;
    }

    public void setEngin(String engin) {
        this.engin = engin;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", post='" + post + '\'' +
                ", terminal='" + terminal + '\'' +
                ", grue='" +grue + '\'' +
                ", engin='" + engin + '\'' +
                ", equipe='" + equipe + '\'' +
                '}';
    }
}
