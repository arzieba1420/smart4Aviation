package pl.nazwa.arzieba.smart4viation.dto;

import org.springframework.stereotype.Component;

@Component
public class FlightResponseDTO {

    private Integer cargoWeidth;
    private Integer baggageWeidth;
    private Integer totalWeidth;

    public FlightResponseDTO() {
    }

    public FlightResponseDTO(Integer cargoWeidth, Integer baggageWeidth, Integer totalWeidth) {
        this.cargoWeidth = cargoWeidth;
        this.baggageWeidth = baggageWeidth;
        this.totalWeidth = totalWeidth;
    }

    public Integer getCargoWeidth() {
        return cargoWeidth;
    }

    public void setCargoWeidth(Integer cargoWeidth) {
        this.cargoWeidth = cargoWeidth;
    }

    public Integer getBaggageWeidth() {
        return baggageWeidth;
    }

    public void setBaggageWeidth(Integer baggageWeidth) {
        this.baggageWeidth = baggageWeidth;
    }

    public Integer getTotalWeidth() {
        return totalWeidth;
    }

    public void setTotalWeidth(Integer totalWeidth) {
        this.totalWeidth = totalWeidth;
    }

}
