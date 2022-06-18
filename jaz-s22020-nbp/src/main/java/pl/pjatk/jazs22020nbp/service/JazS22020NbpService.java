package pl.pjatk.jazs22020nbp.service;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.sql.Date;
import java.time.LocalDate;

@Service
public class JazS22020NbpService {

    public String getNbpRate(LocalDate startDate, LocalDate endDate) {
        final String uri = "http://api.nbp.pl/api/cenyzlota/{startDate}/{endDate}";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class, startDate, endDate);

        return result;
    }
}
