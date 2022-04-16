package pl.nazwa.arzieba.smart4viation.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;


@Component
public class CargoEnt {


    Integer flightId;
    @JsonProperty("baggage")
    CargoPrototype[] baggage;
    @JsonProperty("cargo")
    CargoPrototype[] cargo;

    public CargoEnt() {
    }

    public CargoEnt(Integer id,  CargoPrototype[] baggage, CargoPrototype[] cargo) {
        this.flightId = id;

        this.baggage = baggage;
        this.cargo = cargo;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }



    public CargoPrototype[] getBaggage() {
        return baggage;
    }

    public void setBaggage(CargoPrototype[] baggage) {
        this.baggage = baggage;
    }

    public CargoPrototype[] getCargo() {
        return cargo;
    }

    public void setCargo(CargoPrototype[] cargo) {
        this.cargo = cargo;
    }
}
