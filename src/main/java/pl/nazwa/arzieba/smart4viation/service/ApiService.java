package pl.nazwa.arzieba.smart4viation.service;

import org.springframework.stereotype.Service;
import pl.nazwa.arzieba.smart4viation.dto.FlightResponseDTO;

@Service
public interface ApiService {

    public FlightResponseDTO getFlightDetails(Integer flightNumber);
}
