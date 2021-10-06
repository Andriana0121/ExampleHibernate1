package example.examplehibernate.Service;

import example.examplehibernate.Model.Country;
import java.util.List;

public interface CountryService {
    Country save(Country country);
    List<Country> getAll();
    Country get(long id);
    Country update(Country country, long id);
    void delete(long id);
}