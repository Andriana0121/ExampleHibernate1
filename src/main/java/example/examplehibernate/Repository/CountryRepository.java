package example.examplehibernate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import example.examplehibernate.Model.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
