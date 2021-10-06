package example.examplehibernate.Service;

import example.examplehibernate.Exception.NotFoundException;
import example.examplehibernate.Model.City;
import example.examplehibernate.Repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        super();
        this.cityRepository = cityRepository;
    }

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }
    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }

    @Override
    public City get(long id) {
        return cityRepository.findById(id).orElseThrow(() ->
                new NotFoundException("city", "id", id));
    }
}