package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "person")
@Data
public class Client {
    @Id
    private long id;

    @Column(name = "name", length = 200)
    private String name;
}