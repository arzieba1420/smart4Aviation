package pl.nazwa.arzieba.smart4viation.dto;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Component;

@Component
public class FlightResponseDTO {

    private Integer flightId;

    private Float cargoWeight_lb;
    private Float baggageWeight_lb;
    private Float totalWeight_lb;
    private String weightUnit = "lb";

    public FlightResponseDTO() {

    }

    public FlightResponseDTO(Integer flightId, Float cargoWeight_lb, Float baggageWeight_lb, Float totalWeight_lb) {
        this.flightId = flightId;
        this.cargoWeight_lb = cargoWeight_lb;
        this.baggageWeight_lb = baggageWeight_lb;
        this.totalWeight_lb = totalWeight_lb;
    }

    public Float getCargoWeight_lb() {
        return cargoWeight_lb;
    }

    public void setCargoWeight_lb(Float cargoWeight_lb) {
        this.cargoWeight_lb = cargoWeight_lb;
    }

    public Float getBaggageWeight_lb() {
        return baggageWeight_lb;
    }

    public void setBaggageWeight_lb(Float baggageWeight_lb) {
        this.baggageWeight_lb = baggageWeight_lb;
    }

    public Float getTotalWeight_lb() {
        return totalWeight_lb;
    }

    public void setTotalWeight_lb(Float totalWeight_lb) {
        this.totalWeight_lb = totalWeight_lb;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }
}
