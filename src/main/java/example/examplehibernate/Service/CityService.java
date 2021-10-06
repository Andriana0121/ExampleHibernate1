package example.examplehibernate.Service;

import example.examplehibernate.Model.City;

import java.util.List;

public interface CityService {
    City save(City city);
    List<City> getAll();
    City  get ( long  id );
}
