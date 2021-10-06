package example.examplehibernate.Service;

import example.examplehibernate.Model.City;

import java.util.List;

public interface CityService {
    City save(City city);
    List<City> getAll();
    City  get ( long  id );
    City update(City city, long id);
    void delete(long id);
}
