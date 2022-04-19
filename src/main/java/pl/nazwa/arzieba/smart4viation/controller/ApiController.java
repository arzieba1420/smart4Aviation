package pl.nazwa.arzieba.smart4viation.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.nazwa.arzieba.smart4viation.configuration.InitSampleData;
import pl.nazwa.arzieba.smart4viation.dto.FlightResponseDTO;
import pl.nazwa.arzieba.smart4viation.service.ApiService;


@RestController("/")
@RequestMapping("/v1/api/")
public class ApiController {

    private InitSampleData initSampleData;
    private ApiService apiService;

    public ApiController(InitSampleData initSampleData, ApiService apiService) {
        this.initSampleData = initSampleData;
        this.apiService = apiService;
    }

    @GetMapping(value = "flight",produces = "application/json")
    public FlightResponseDTO flightDetails (@RequestParam Integer flightNumber){
        FlightResponseDTO responseDTO= apiService.getFlightDetails(flightNumber);
        return responseDTO;
    }
}
