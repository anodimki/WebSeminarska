package mk.ukim.finki.webseminarska_186034.repository.jpa;

import mk.ukim.finki.webseminarska_186034.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {
}

