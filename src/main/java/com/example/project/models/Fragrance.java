package com.example.project.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Fragrance")
public class Fragrance {

    //@Getter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long fragrance_id;

    //@Getter
    private String name;
    private String brand;

    public Fragrance(String name, String brand){
        this.name = name;
        this.brand = brand;
    }

    public Fragrance() {

    }

    public Long getFragrance_id() {
        return fragrance_id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }


}
