package example.examplehibernate.Controller;

import example.examplehibernate.Model.City;
import example.examplehibernate.Service.CityService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

public class CityController {
    private CityService cityService;

    public CityController(CityService cityService) {
        super();
        this.cityService = cityService;
    }

    @PostMapping
    public ResponseEntity<City> create(@RequestBody City city) {
        return new ResponseEntity<City>(cityService.save(city), HttpStatus.CREATED);
    }
}