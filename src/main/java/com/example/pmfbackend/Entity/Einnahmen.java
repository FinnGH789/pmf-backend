package com.example.pmfbackend.Entity;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Einnahmen")
public class Einnahmen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private float einnahme;

    public Einnahmen() {}

    public Einnahmen(Long id, String name, float einnahme) {
        this.id = id;
        this.name = name;
        this.einnahme = einnahme;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getEinnahme() {
        return einnahme;
    }

    public void setEinnahme(float einnahme) {
        this.einnahme = einnahme;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Einnahmen einnahmen = (Einnahmen) o;
        return Float.compare(einnahme, einnahmen.einnahme) == 0 && Objects.equals(id, einnahmen.id) && Objects.equals(name, einnahmen.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, einnahme);
    }

    @Override
    public String toString() {
        return "Einnahmen{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", einnahme=" + einnahme +
                '}';
    }
}
