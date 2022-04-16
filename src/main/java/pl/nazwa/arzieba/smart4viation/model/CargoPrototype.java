package pl.nazwa.arzieba.smart4viation.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Component
public class CargoPrototype {

    Integer id;
    Integer weight;
    String weighUnit;
    Integer pieces;

    public CargoPrototype() {
    }

    public CargoPrototype(Integer id, Integer weight, String weighUnit, Integer pieces) {
        this.id = id;
        this.weight = weight;
        this.weighUnit = weighUnit;
        this.pieces = pieces;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getWeighUnit() {
        return weighUnit;
    }

    public void setWeighUnit(String weighUnit) {
        this.weighUnit = weighUnit;
    }

    public Integer getPieces() {
        return pieces;
    }

    public void setPieces(Integer pieces) {
        this.pieces = pieces;
    }
}
