package example.examplehibernate.Controller;

import example.examplehibernate.Model.City;
import example.examplehibernate.Service.CityService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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

    @GetMapping
    public List<City> get() {
        return cityService.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<City> get(@PathVariable("id") long id) {
        return new ResponseEntity<City>(cityService.get(id), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<City> update(@PathVariable("id") long id, @RequestBody City city) {
        return new ResponseEntity<City>(cityService.update(city, id), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable("id") long id) {
        cityService.delete(id);
        return new ResponseEntity<String>("City is deleted", HttpStatus.OK);
    }
}