package pl.nazwa.arzieba.smart4viation.model;

import org.springframework.stereotype.Component;

@Component
public class CargoPrototype {

    Integer id;
    Float weight;
    String weightUnit;
    Integer pieces;

    public CargoPrototype() {
    }

    public CargoPrototype(Integer id, Float weight, String weightUnit, Integer pieces) {
        this.id = id;
        this.weight = weight;
        this.weightUnit = weightUnit;
        this.pieces = pieces;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public Integer getPieces() {
        return pieces;
    }

    public void setPieces(Integer pieces) {
        this.pieces = pieces;
    }
}
