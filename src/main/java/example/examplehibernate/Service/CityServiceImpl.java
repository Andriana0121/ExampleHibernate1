package example.examplehibernate.Service;

import com.sun.deploy.security.JarSignature;
import example.examplehibernate.Exception.NotFoundException;
import example.examplehibernate.Model.City;
import example.examplehibernate.Repository.CityRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

    @Override
    public City update(City city, long id) {
        City existCity = cityRepository.findById(id).orElseThrow(() ->
                new NotFoundException("city", "id", id));
        existCity.setName(city.getName());
        cityRepository.save(existCity);
        return null;
    }

    @Override
    public void delete(long id) {
        cityRepository.findById(id).orElseThrow(() ->
                new NotFoundException("city", "id", id));
        cityRepository.deleteById(id);
    }
}