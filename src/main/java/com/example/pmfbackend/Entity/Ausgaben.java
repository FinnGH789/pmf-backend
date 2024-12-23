package com.example.pmfbackend.Entity;

import jakarta.persistence.*;
import java.util.Objects;

// TODO: Maybe als Record, sofern das mit Entities kompatibel ist!

@Entity
@Table(name = "Ausgaben")
public class Ausgaben {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String beschreibung;

    @Column
    private float betrag;

    @Column
    private String zahlungsmittel;

    public Ausgaben() {}

    public Ausgaben(Long id, String beschreibung, float betrag, String zahlungsmittel) {
        this.id = id;
        this.beschreibung = beschreibung;
        this.betrag = betrag;
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
        return "Ausgaben{" +
                "id=" + id +
                ", beschreibung='" + beschreibung + '\'' +
                ", betrag=" + betrag +
                ", zahlungsmittel='" + zahlungsmittel + '\'' +
                '}';
    }
}
