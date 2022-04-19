package pl.nazwa.arzieba.smart4viation.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.nazwa.arzieba.smart4viation.configuration.InitSampleData;
import pl.nazwa.arzieba.smart4viation.dto.FlightResponseDTO;
import pl.nazwa.arzieba.smart4viation.model.CargoEnt;
import pl.nazwa.arzieba.smart4viation.model.CargoPrototype;
import pl.nazwa.arzieba.smart4viation.model.Flight;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    Logger logger = LoggerFactory.getLogger(getClass());

    InitSampleData initSampleData;
    Float unitFactor = 1F;


    @Autowired
    public ApiServiceImpl(InitSampleData initSampleData) {
        this.initSampleData = initSampleData;
    }

    @Override
    public FlightResponseDTO getFlightDetails(Integer flightNumber) {
        List<Flight> flights = initSampleData.flights;
        List<CargoEnt> cargoEnts = initSampleData.cargoEnts;

        Float netBaggageWeight =0F;
        Float netCargoWeight = 0F;

       for (CargoPrototype baggage: requestedEnt.getBaggage()){
           if(baggage.getWeightUnit().equals("kg")) unitFactor=2.20462262F;
           netBaggageWeight+=(baggage.getWeight()*unitFactor);
       }

        for (CargoPrototype cargo: requestedEnt.getCargo()){
            if(cargo.getWeightUnit().equals("kg")) unitFactor=2.20462262F;
                    else if (cargo.getWeightUnit().equals("lb")) unitFactor=1F;
                    else throw new RuntimeException("Incorrect weight units");
            netCargoWeight+=(cargo.getWeight()*unitFactor);
        }

       logger.info("test: "+netBaggageWeight);


        return new FlightResponseDTO(id,netCargoWeight,netBaggageWeight,netCargoWeight+netBaggageWeight);
        }
}
