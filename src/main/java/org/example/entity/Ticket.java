package org.example.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "ticket")
@Data
public class Ticket {

    @Id
    private long id;

    @CreationTimestamp
    @Column(name = "created_at")
    private Timestamp created_at;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "from_planet_id")
    private Planet from_planet;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "to_planet_id")
    private Planet to_planet;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Planet getFrom_planet() {
        return from_planet;
    }

    public void setFrom_planet(Planet from_planet) {
        this.from_planet = from_planet;
    }

    public Planet getTo_planet() {
        return to_planet;
    }

    public void setTo_planet(Planet to_planet) {
        this.to_planet = to_planet;
    }
}
