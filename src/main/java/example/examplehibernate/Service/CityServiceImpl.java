package example.examplehibernate.Service;

import example.examplehibernate.Model.City;
import example.examplehibernate.Repository.CityRepository;
import org.springframework.stereotype.Service;

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

}