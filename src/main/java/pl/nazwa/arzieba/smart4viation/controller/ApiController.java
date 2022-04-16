package pl.nazwa.arzieba.smart4viation.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.nazwa.arzieba.smart4viation.configuration.InitSampleData;
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

    @GetMapping("flight")
    public String flightDetails (@RequestParam Integer flightId){
        apiService.getFlightDetails(flightId);
        return null;
    }
}
