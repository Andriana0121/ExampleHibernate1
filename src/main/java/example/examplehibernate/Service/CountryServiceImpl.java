package example.examplehibernate.Service;

import example.examplehibernate.Exception.NotFoundException;
import example.examplehibernate.Model.Country;
import example.examplehibernate.Repository.CountryRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {
    CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        super();
        this.countryRepository = countryRepository;
    }

    @Override
    public Country save(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public List<Country> getAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country get(long id) {
        return countryRepository.findById(id).orElseThrow(() -> new NotFoundException("country", "id", id));
    }
}