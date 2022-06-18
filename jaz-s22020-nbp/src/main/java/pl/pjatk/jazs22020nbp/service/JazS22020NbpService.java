package pl.pjatk.jazs22020nbp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JazS22020NbpService {

    public String getNbpRate() {
        final String uri = "http://api.nbp.pl/api/cenyzlota/{startDate}/{endDate}";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        return result;
    }
}
