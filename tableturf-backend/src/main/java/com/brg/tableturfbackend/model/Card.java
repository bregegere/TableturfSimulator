package com.brg.tableturfbackend.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.Type;

@Entity
@Data
public class Card {
    @Id
    @GeneratedValue
    private String id;

    private String name;

    private int specialCost;

    @Type(type = "json")
    private MapSquare[][] pattern;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MapSquare[][] getPattern() {
        return pattern;
    }

    public void setPattern(MapSquare[][] pattern) {
        this.pattern = pattern;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpecialCost() {
        return specialCost;
    }

    public void setSpecialCost(int specialCost) {
        this.specialCost = specialCost;
    }
}
