package example.examplehibernate.Repository;

import example.examplehibernate.Model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
    City save(City city);
}
