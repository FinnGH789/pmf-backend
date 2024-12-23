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
    private String beschreibung;

    @Column
    private float betrag;

    @Column
    private String zahlungsmittel;

    public Einnahmen() {
    }

    public Einnahmen(Long id, String name, float einnahme, String zahlungsmittel) {
        this.id = id;
        this.beschreibung = name;
        this.betrag = einnahme;
        this.zahlungsmittel = zahlungsmittel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public float getBetrag() {
        return betrag;
    }

    public void setBetrag(float betrag) {
        this.betrag = betrag;
    }

    public String getZahlungsmittel() {
        return zahlungsmittel;
    }

    public void setZahlungsmittel(String zahlungsmittel) {
        this.zahlungsmittel = zahlungsmittel;
    }

    @Override
    public String toString() {
        return "Einnahmen{" +
                "id=" + id +
                ", name='" + beschreibung + '\'' +
                ", einnahme=" + betrag +
                ", zahlungsmittel='" + zahlungsmittel + '\'' +
                '}';
    }
}