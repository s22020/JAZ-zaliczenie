package pl.pjatk.jazs22020nbp.service;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.jazs22020nbp.repository.JazS22020NbpRepository;

import java.sql.Date;
import java.time.LocalDate;

@Service
public class JazS22020NbpService {

    private final JazS22020NbpRepository jazS22020NbpRepository;

    public JazS22020NbpService(JazS22020NbpRepository jazS22020NbpRepository) {
        this.jazS22020NbpRepository = jazS22020NbpRepository;
    }

    public String getNbpRate(Date startDate, Date endDate) {
        final String uri = "http://api.nbp.pl/api/cenyzlota/{startDate}/{endDate}";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class, startDate, endDate);
        jazS22020NbpRepository.save(result);
        return result;
    }
}
