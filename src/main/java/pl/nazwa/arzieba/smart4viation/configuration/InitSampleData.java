package pl.nazwa.arzieba.smart4viation.configuration;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pl.nazwa.arzieba.smart4viation.model.CargoEnt;
import pl.nazwa.arzieba.smart4viation.model.Flight;

import java.io.IOException;
import java.net.URL;
import java.util.List;

@Configuration
@Component
public class InitSampleData {

    public ObjectMapper objectMapper;
    public List<Flight> flights;
    public List<CargoEnt> cargoEnts;

    @Autowired
    public InitSampleData(ObjectMapper objectMapper, List<Flight> flights, List<CargoEnt> cargoEnts) {
        this.objectMapper = objectMapper;
        this.flights = flights;
        this.cargoEnts = cargoEnts;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void load() throws IOException {
         flights = objectMapper.readValue(new URL("file:src/main/resources/generatedFlight.json"),new TypeReference<List<Flight>>(){});
         cargoEnts = objectMapper.readValue(new URL("file:src/main/resources/generatedCargo.json"),new TypeReference<List<CargoEnt>>(){});
    }
}
