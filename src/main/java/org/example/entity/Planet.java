package org.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
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
