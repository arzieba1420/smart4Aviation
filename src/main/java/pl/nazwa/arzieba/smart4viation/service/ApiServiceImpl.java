package pl.nazwa.arzieba.smart4viation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.nazwa.arzieba.smart4viation.configuration.InitSampleData;
import pl.nazwa.arzieba.smart4viation.dto.FlightResponseDTO;
import pl.nazwa.arzieba.smart4viation.model.CargoEnt;
import pl.nazwa.arzieba.smart4viation.model.Flight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class ApiServiceImpl implements ApiService {

    InitSampleData initSampleData;
    FlightResponseDTO flightResponseDTO;

    @Autowired
    public ApiServiceImpl(InitSampleData initSampleData) {
        this.initSampleData = initSampleData;
    }

    @Override
    public FlightResponseDTO getFlightDetails(Integer id) {
        List<Flight> flights = initSampleData.flights;
        List<CargoEnt> cargoEnts = initSampleData.cargoEnts;

        CargoEnt requestedEnt = cargoEnts.stream().filter(e->e.getFlightId().equals(id)).findAny().orElseThrow(()->new RuntimeException("No such flight in database for id: "+id));

        Integer initBaggageWeight =0;

        return null;
        }
}
