package pl.nazwa.arzieba.smart4viation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.EventListener;
import pl.nazwa.arzieba.smart4viation.model.CargoEnt;
import pl.nazwa.arzieba.smart4viation.model.Flight;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;


@SpringBootApplication
public class Smart4viationApplication {

    public static void main(String[] args) {
        SpringApplication.run(Smart4viationApplication.class, args);
    }

}
