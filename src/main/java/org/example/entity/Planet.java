package org.example.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;
import java.util.regex.*;

@Entity
@Table(name = "planet")
@Data

public class Planet {
    @Id
    @Pattern(regexp = "^[A-Z]+$")
    private String id;

    @Column(name = "name")
    @Size(min = 1, max = 500)
    private String name;

    @OneToMany(mappedBy = "from_planet")
    private List<Ticket> tickets;

    @OneToMany(mappedBy = "to_planet")
    private List<Ticket> tickets1;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.matches("[A-Z]+")) {
            this.id = id;
        } else {
            System.out.println("This id is not valuable");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
