package pl.pjatk.jazs22020nbp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pjatk.jazs22020nbp.model.Rate;

public interface JazS22020NbpRepository extends JpaRepository<Rate, Integer> {
    String save(Rate rate);
}
