package org.example.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "client")
@Data

public class Client {
    @Id
    private long id;

    @Column(name = "name")
    @Size(min = 3, max = 200)
    private String name;

    @OneToMany(mappedBy = "client")
    private List<Ticket> tickets;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
