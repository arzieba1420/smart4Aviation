package pl.nazwa.arzieba.smart4viation.model;
import org.springframework.stereotype.Component;
import java.util.Objects;


@Component
public class Flight {


    Integer flightId;
    Integer flightNumber;
    String  departureAirportIATACode;
    String  arrivalAirportIATACode;
    String departureDate;

    public Flight() {
    }

    public Flight(Integer flightId, Integer flightNumber, String departureAirportIATACode, String arrivalAirportIATACode, String departureDate) {
        this.flightId = flightId;
        this.flightNumber = flightNumber;
        this.departureAirportIATACode = departureAirportIATACode;
        this.arrivalAirportIATACode = arrivalAirportIATACode;
        this.departureDate = departureDate;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public Integer getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDepartureAirportIATACode() {
        return departureAirportIATACode;
    }

    public void setDepartureAirportIATACode(String departureAirportIATACode) {
        this.departureAirportIATACode = departureAirportIATACode;
    }

    public String getArrivalAirportIATACode() {
        return arrivalAirportIATACode;
    }

    public void setArrivalAirportIATACode(String arrivalAirportIATACode) {
        this.arrivalAirportIATACode = arrivalAirportIATACode;
    }

    public String getDepartureDate() {
        return departureDate;
    }



    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return getFlightId().equals(flight.getFlightId()) && getFlightNumber().equals(flight.getFlightNumber()) && getDepartureAirportIATACode().equals(flight.getDepartureAirportIATACode()) && getArrivalAirportIATACode().equals(flight.getArrivalAirportIATACode()) && getDepartureDate().equals(flight.getDepartureDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlightId(), getFlightNumber(), getDepartureAirportIATACode(), getArrivalAirportIATACode(), getDepartureDate());
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId=" + flightId +
                ", flightNumber=" + flightNumber +
                ", departureAirportIATACode='" + departureAirportIATACode + '\'' +
                ", arrivalAirportIATACode='" + arrivalAirportIATACode + '\'' +
                ", departureDate='" + departureDate + '\'' +
                '}';
    }
}
