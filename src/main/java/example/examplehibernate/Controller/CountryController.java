package example.examplehibernate.Controller;

import example.examplehibernate.Model.Country;
import example.examplehibernate.Service.CountryService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {
    private CountryService countryService;

    public CountryController(CountryService countryService) {
        super();
        this.countryService = countryService;
    }

    @PostMapping
    public ResponseEntity<Country> create(@RequestBody Country country) {
        return new ResponseEntity<Country>(countryService.save(country), HttpStatus.CREATED);
    }
    @GetMapping
    public List<Country> get() {
        return countryService.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<Country> get(@PathVariable("id") long id) {
        return new ResponseEntity<Country>(countryService.get(id), HttpStatus.OK);
    }
}