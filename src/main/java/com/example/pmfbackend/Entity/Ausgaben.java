package com.example.pmfbackend.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;


@Entity
@Table(name = "Ausgaben")
public class Ausgaben extends Finanzen {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private float ausgaben;

    public Ausgaben() {}

    public Ausgaben(Long id, String name, float ausgaben) {
        this.id = id;
        this.name = name;
        this.ausgaben = ausgaben;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAusgaben() {
        return ausgaben;
    }

    public void setAusgaben(float ausgaben) {
        this.ausgaben = ausgaben;
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
        Ausgaben ausgaben1 = (Ausgaben) o;
        return Float.compare(ausgaben, ausgaben1.ausgaben) == 0 && Objects.equals(id, ausgaben1.id) && Objects.equals(name, ausgaben1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, ausgaben);
    }

    @Override
    public String toString() {
        return "Ausgaben{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ausgaben=" + ausgaben +
                '}';
    }
}
